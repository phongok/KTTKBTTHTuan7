package com.example.springbootcrmcrudclientdemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.springbootcrmcrudclientdemo.model.User;

@Service
public class UserServiceImpl implements UserService{

	private RestTemplate restTemplate = new RestTemplate();
	
	@Value("${rest.url}")
	private String url; 
	
	
	@Override
	public User save(User user) {
		if(user.getId() == 0) {
			ResponseEntity<User> result = restTemplate.postForEntity(url, user, User.class);
			return result.getBody();
		}
		else
			restTemplate.put(url, user);
		return user;
	}
	
	@Override
	public List<User> getUsers() {
		ResponseEntity<List<User>> responseEntity=
			restTemplate.exchange(url, HttpMethod.GET, null,
			new ParameterizedTypeReference<List<User>>() {});
		List<User> users=responseEntity.getBody();
		return users;
	}
}