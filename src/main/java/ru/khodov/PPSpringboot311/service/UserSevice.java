package ru.khodov.PPSpringboot311.service;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.khodov.PPSpringboot311.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserSevice  {

    public List<User> findAll();

    public User saveUser(User user);

    public User findById(long id);

    public void deleteById(long id);

}
