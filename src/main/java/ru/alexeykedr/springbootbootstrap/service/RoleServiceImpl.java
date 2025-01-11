package ru.alexeykedr.springbootbootstrap.service;

import ru.alexeykedr.springbootbootstrap.dao.RoleRepository;
import ru.alexeykedr.springbootbootstrap.model.Role;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
