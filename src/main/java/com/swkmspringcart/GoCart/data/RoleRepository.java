package com.swkmspringcart.GoCart.data;

import com.swkmspringcart.GoCart.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String role);
}