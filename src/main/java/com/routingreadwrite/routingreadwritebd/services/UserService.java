package com.routingreadwrite.routingreadwritebd.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.routingreadwrite.routingreadwritebd.dto.UserDTO;
import com.routingreadwrite.routingreadwritebd.entities.User;
import com.routingreadwrite.routingreadwritebd.repositories.UserRepository;
import com.routingreadwrite.routingreadwritebd.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(int id) {
		
		User client = this.repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Client doesn't exists!"));
		
		return new UserDTO(client);
	}
	
	@Transactional
	public User insert(UserDTO obj) {
		obj.setId(null);
		User client = new User(obj);
		client = repository.save(client);
		return client;
	}
}
