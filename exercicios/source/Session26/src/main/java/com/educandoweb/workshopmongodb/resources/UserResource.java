package com.educandoweb.workshopmongodb.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.workshopmongodb.domain.User;
import com.educandoweb.workshopmongodb.dto.UserDTO;
import com.educandoweb.workshopmongodb.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> users = service.findAll();
		List<UserDTO> usersDTO = users.stream().map(u -> new UserDTO(u)).collect(Collectors.toList());
		return ResponseEntity.ok().body(usersDTO);
	}
}
