package com.example.springbootdemocrmcrud.service;

import java.util.List;
import com.example.springbootdemocrmcrud.entity.User;
public interface UserService {
	public User save(User user);
	public List<User> getUsers();
}
