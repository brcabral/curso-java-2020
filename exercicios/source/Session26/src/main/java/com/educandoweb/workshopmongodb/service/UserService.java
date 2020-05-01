package com.educandoweb.workshopmongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshopmongodb.domain.User;
import com.educandoweb.workshopmongodb.dto.UserDTO;
import com.educandoweb.workshopmongodb.repository.UserRepository;
import com.educandoweb.workshopmongodb.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(String id) {
		Optional<User> user = repository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("User not found"));
	}

	public User insert(User user) {
		return repository.insert(user);
	}

	public void delete(String id) {
		repository.deleteById(id);
	}

	public User fromDTO(UserDTO userDTO) {
		return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
	}

	public User update(User user) {
		User u = findById(user.getId());
		updateDate(u, user);
		return repository.save(u);
	}

	private void updateDate(User u, User user) {
		u.setName(user.getName());
		u.setEmail(user.getEmail());
	}
}
