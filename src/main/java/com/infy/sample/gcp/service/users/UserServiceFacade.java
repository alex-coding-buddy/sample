package com.infy.sample.gcp.service.users;

import com.infy.sample.gcp.entity.firestore.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserServiceFacade {

    Flux<User> getAll();

    Mono<User> findById(String username);

    Mono<User> create(User user);

}
