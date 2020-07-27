package com.michael.reactorProject.service;

import com.michael.reactorProject.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> getUser(Long id);

    Mono<User> insertUser(User user);

    Mono<User> updateUser(User user);

    Mono<Void> deleteUser(User user);

    Flux<User> findUsers(String userName,String note);


}
