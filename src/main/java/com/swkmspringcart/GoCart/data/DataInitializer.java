package com.swkmspringcart.GoCart.data;

import com.swkmspringcart.GoCart.model.Role;
import com.swkmspringcart.GoCart.model.User;
import com.swkmspringcart.GoCart.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Transactional
@Component
@RequiredArgsConstructor
public class DataInitializer implements ApplicationListener<ApplicationReadyEvent> {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void onApplicationEvent(@NonNull ApplicationReadyEvent event) {
        Set<String> defaultRoles =  Set.of("ROLE_ADMIN", "ROLE_USER");
        createDefaultUserIfNotExist();
        createDefaultRoleIfNotExits(defaultRoles);
        createDefaultAdminIfNotExits();
    }



    private void createDefaultUserIfNotExist(){
        for(int i = 1; i <= 5; i++){
            String defaultEmail = "user"+i+"@gmail.com";
            if (userRepository.existsByEmail(defaultEmail)){
                continue;
            }
            User user = new User();
            user.setFirstName("The user");
            user.setLastName("user"+i);
            user.setEmail(defaultEmail);
            user.setPassword("123456");
            userRepository.save(user);
            System.out.println("Default user "+i+" created");
        }
    }


    private void createDefaultAdminIfNotExits(){
        Role adminRole = roleRepository.findByName("ROLE_ADMIN").get();
        for (int i = 1; i<=2; i++){
            String defaultEmail = "admin"+i+"@email.com";
            if (userRepository.existsByEmail(defaultEmail)){
                continue;
            }
            User user = new User();
            user.setFirstName("Admin");
            user.setLastName("Admin" + i);
            user.setEmail(defaultEmail);
            user.setPassword(passwordEncoder.encode("123456"));
            user.setRoles(Set.of(adminRole));
            userRepository.save(user);
            System.out.println("Default admin user " + i + " created successfully.");
        }
    }
    private void createDefaultRoleIfNotExits(Set<String> roles){
        roles.stream()
                .filter(role -> roleRepository.findByName(role).isEmpty())
                .map(Role:: new).forEach(roleRepository::save);

    }
}
