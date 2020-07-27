package com.michael.reactorProject.controller;

import com.michael.reactorProject.entity.User;
import com.michael.reactorProject.service.UserService;
import com.michael.reactorProject.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

    @Autowired
    public UserService userService;


    @GetMapping("/user/{id}")
    public Mono<UserVo> getUser(@PathVariable Long id){
      return   userService.getUser(id).map(user -> translation(user));
    }


    @PostMapping("/user")
    public Mono<UserVo> inserUser(@RequestBody User user){
        return  userService.insertUser(user).map(u->translation(u));
    }


    @PatchMapping("/user")
    public Mono<UserVo> updateUser(@RequestBody User user){
        return userService.updateUser(user).map(user1 -> translation(user1));
    }


    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteUser(@PathVariable Long id ){
        return userService.deleteUser(id);
    }

    @GetMapping("/user/{userName}/{note}")
    public Flux<UserVo> getUser(@PathVariable String userName,@PathVariable String note){
        return userService.findUsers(userName,note).map(user -> translation(user));
    }

    public UserVo translation(User user){
        UserVo userVo=new UserVo();
        userVo.setNote(user.getNote());
        userVo.setUserName(user.getUserName());
        userVo.setSexCode(user.getSexEnum().getCode());
        userVo.setSexName(user.getSexEnum().getName());
        return userVo;
    }

}
