package com.infy.sample.gcp.controller.crud;

import com.infy.sample.gcp.controller.AbstractCrudController;
import com.infy.sample.gcp.entity.firestore.User;
import com.infy.sample.gcp.service.users.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController extends AbstractCrudController<UserService, User> {
}
