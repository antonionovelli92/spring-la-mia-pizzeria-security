package org.java.pizza.auth.service;

import java.util.List;
import java.util.Optional;

import org.java.pizza.auth.pojo.Role;
import org.java.pizza.auth.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepo;
	
	public List<Role> findAll() {
		
		return roleRepo.findAll();
	}
	public Optional<Role> findById(Long id) {
		
		return roleRepo.findById(id);
	}
	public Role save(Role role) {
		
		return roleRepo.save(role);
	}
}



