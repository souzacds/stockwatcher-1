package org.stockwatcher.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.stockwatcher.data.UserDAO;
import org.stockwatcher.domain.User;

@RestController
@RequestMapping(path = "/usersRest", consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
public class UserRestController {
	@Autowired
	private UserDAO dao;

	@SuppressWarnings("rawtypes")
	@PostMapping
	public ResponseEntity createUser(@RequestBody User user) {
		if (user.getId() != null) {

			return ResponseEntity.badRequest().body("Error user.id was provided :" + user.getId());
		}

		return ResponseEntity.ok(dao.insertUser(user));
	}

	@GetMapping
	public ResponseEntity<User> get() {
		return ResponseEntity.ok(new User());
	}
}
