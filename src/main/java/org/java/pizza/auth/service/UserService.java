package org.java.pizza.auth.service;

import java.util.List;
import java.util.Optional;

import org.java.pizza.auth.pojo.User;
import org.java.pizza.auth.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
   
  

    @Autowired
    private  UserRepository userRepository;


		public List<User> findAll() {
		
		return userRepository.findAll();
}
		public Optional <User> findById(Long id){
		return userRepository.findById(id); 
}
    public User save(User user) {
  
        return userRepository.save(user);
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optUser = userRepository.findByUsername(username);
		if(optUser.isEmpty())throw new UsernameNotFoundException("Username not found");
		return optUser.get();
	}
    
}
