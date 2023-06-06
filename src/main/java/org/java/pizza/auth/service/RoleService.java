package org.java.pizza.auth.service;

import org.java.pizza.auth.pojo.Role;
import org.java.pizza.auth.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }
    public Role save(Role role) {
        return roleRepository.save(role);
    }
}



