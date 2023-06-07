package org.java.pizza.auth.repo;

import java.util.Optional;

import org.java.pizza.auth.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
    public Optional<User>findByUsername(String username);
}
