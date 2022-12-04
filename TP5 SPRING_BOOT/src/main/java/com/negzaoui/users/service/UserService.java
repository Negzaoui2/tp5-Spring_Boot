package com.negzaoui.users.service;

import com.negzaoui.users.entities.Role;
import com.negzaoui.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
