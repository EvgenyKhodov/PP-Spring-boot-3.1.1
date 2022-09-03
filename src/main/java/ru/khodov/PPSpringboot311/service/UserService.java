package ru.khodov.PPSpringboot311.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.khodov.PPSpringboot311.entity.User;
import ru.khodov.PPSpringboot311.repository.UserRepository;


import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id){
        return userRepository.getOne(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}