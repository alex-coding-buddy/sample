package com.infy.sample.gcp.service;

import com.infy.sample.gcp.entity.firestore.FirestoreEntity;
import com.infy.sample.gcp.entity.firestore.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class AbstractCrudFirestoreService<R extends FirestoreReactiveRepository, E extends FirestoreEntity> {

    @Autowired
    protected R abstractFirestoreRepo;

    public Mono<User> findById(String id) {
        return abstractFirestoreRepo.findById(id);
    }

    public Flux<E> getAll() {
        return abstractFirestoreRepo.findAll();
    }

    public Mono<E> create(E entity) {
        return abstractFirestoreRepo.save(entity);
    }

    public Mono<E> update(E entity) {
        return abstractFirestoreRepo.save(entity);
    }

    public Mono<Void> deleteById(E entity) {
        return abstractFirestoreRepo.delete(entity);
    }

    public Mono<Void> deleteById(String id) {
        return abstractFirestoreRepo.deleteById(id);
    }
}
