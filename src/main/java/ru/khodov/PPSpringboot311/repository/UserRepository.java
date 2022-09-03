package ru.khodov.PPSpringboot311.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.khodov.PPSpringboot311.entity.User;
// JpaRepository генерирует запросы
public interface UserRepository extends JpaRepository<User,Long> {

}
