package com.example.springbootcrmcrudclientdemo.service;

import java.util.List;
import com.example.springbootcrmcrudclientdemo.model.User;

public interface UserService {
	public User save(User user);
	public List<User> getUsers();
}
