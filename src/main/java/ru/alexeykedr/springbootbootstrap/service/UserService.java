package ru.alexeykedr.springbootbootstrap.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.alexeykedr.springbootbootstrap.model.Role;
import ru.alexeykedr.springbootbootstrap.model.User;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    User findByUsername(String username);

    Optional<User> findById(Long id);

    boolean saveUser(User user);

    List<User> getAllUsers();

    void updateUser(User user);

    boolean deleteUser(Long userId);

    Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles);

    UserDetails loadUserByUsername(String username);
}
