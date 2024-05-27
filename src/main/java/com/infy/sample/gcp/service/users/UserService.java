package com.infy.sample.gcp.service.users;

import com.infy.sample.gcp.entity.firestore.User;
import com.infy.sample.gcp.repository.UserRepository;
import com.infy.sample.gcp.service.AbstractCrudFirestoreService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractCrudFirestoreService<UserRepository, User> implements UserServiceFacade {
}
