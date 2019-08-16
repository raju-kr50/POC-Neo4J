package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }

    @Override
    public User saveUser(User user) {
        User savedUser = userRepository.save(user);
        System.out.println("****" + savedUser);
        return savedUser;
    }

//    @Override
//    public Collection<User> getAllUsers() {
//
//        return (Collection<User>) userRepository.findAll();
//    }
//
//    @Override
//    public User deleteUserById(Long id) {
//        Optional<User> deletedUser= Optional.ofNullable(userRepository.findOne(id));
//        userRepository.delete(id);
//        return null;
//    }
//
//    @Override
//    public User updateUserById(Long id) {
//        return null;
//    }

}
