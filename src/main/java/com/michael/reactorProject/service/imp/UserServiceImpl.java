package com.michael.reactorProject.service.imp;

import com.michael.reactorProject.dao.UserRepository;
import com.michael.reactorProject.entity.User;
import com.michael.reactorProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public Mono<User> getUser(Long id) {
        return userRepository.findBy;
    }

    @Override
    public Mono<User> insertUser(User user) {
        return null;
    }

    @Override
    public Mono<User> updateUser(User user) {
        return null;
    }

    @Override
    public Mono<Void> deleteUser(User user) {
        return null;
    }

    @Override
    public Flux<User> findUsers(String userName, String note) {
        return null;
    }
}
