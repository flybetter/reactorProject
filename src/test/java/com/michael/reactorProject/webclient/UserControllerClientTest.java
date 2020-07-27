package com.michael.reactorProject.webclient;

import com.michael.reactorProject.Enum.SexEnum;
import com.michael.reactorProject.entity.User;
import com.michael.reactorProject.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class UserControllerClientTest {

    private static Logger logger= LoggerFactory.getLogger(UserControllerClientTest.class);

    public static void main(String[] args) {

        WebClient webClient=WebClient.create("http://localhost:8080");

        User user=new User();

        user.setId(1L);
        user.setNote("test");
        user.setUserName("michael");
        user.setSexEnum(SexEnum.FEMALE);

        insertUser(webClient,user);

    }


    private static void insertUser(WebClient webClient,User user){

        Mono<UserVo> userMono=webClient.post().uri("/user").contentType(MediaType.APPLICATION_STREAM_JSON).body(Mono.just(user),User.class).
                accept(MediaType.APPLICATION_STREAM_JSON).retrieve().bodyToMono(UserVo.class);

        UserVo userVo=userMono.block();

        logger.info(userVo.getUserName());

    }
}
