package com.swkmspringcart.GoCart.repository;

import com.swkmspringcart.GoCart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
