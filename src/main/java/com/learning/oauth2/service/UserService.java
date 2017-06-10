package com.learning.oauth2.service;

import com.learning.oauth2.model.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by mudassir on 21/02/2017.
 */
public interface UserService extends UserDetailsService {

    List<User> findAllUsers();
}
