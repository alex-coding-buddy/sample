package com.infy.sample.gcp.repository;

import com.infy.sample.gcp.entity.firestore.User;
import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;

public interface UserRepository extends FirestoreReactiveRepository<User> {
}