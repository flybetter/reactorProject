package com.michael.reactorProject.dao;

import com.michael.reactorProject.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface UserRepository  extends ReactiveMongoRepository<User,Long> {

    public Flux<User> findByUserNameLikeAndNoteLikeAnd(String userName, String note);


}
