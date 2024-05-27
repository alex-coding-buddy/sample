package com.infy.sample.gcp.controller;

import com.infy.sample.gcp.entity.firestore.FirestoreEntity;
import com.infy.sample.gcp.service.AbstractCrudFirestoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class AbstractCrudController<S extends AbstractCrudFirestoreService, E extends FirestoreEntity> {

    @Autowired
    S service;

    @GetMapping
    Flux<E> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    Mono<E> getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    Mono<E> create(@RequestBody E entity) {
        return service.create(entity);
    }

    @PutMapping
    Mono<E> update(@RequestBody E entity) {
        return service.update(entity);
    }

    @DeleteMapping
    Mono<Void> deleteById(@RequestParam String id) {
        return service.deleteById(id);
    }
}
