package net.proselyte.springsecuritydemo.repository;
//класс который возвращяет по емейлу 
// адрес электронной почты, указанный пользователем, не найден в базе данных.
//Это делается путем вызова метода findByEmail () интерфейса UserRepository .
import net.proselyte.springsecuritydemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
