package ch.silvanadrian.backend.service;

import ch.silvanadrian.backend.model.User;

import java.util.List;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserService {
    void resetCredentials();
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
}
