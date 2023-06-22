package com.example.ZBSProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
    private UserRepository userRep;

    public User saveUser(User user) {
        return userRep.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return userRep.saveAll(users);
    }

    public List<User> getUser() {
        return userRep.findAll();
    }

    public User getUserById(int id) {
        return userRep.findById((long) id).orElse(null);
    }

    public User getUserByName(String name) {
        return userRep.findByName(name);
    }

    public String deleteUser(int id) {
    	userRep.deleteById((long) id);
        return "user removed !! " + id;
    }

    public User updateUser(User users) {
        User existingUser = userRep.findById(users.getId()).orElse(null);
        existingUser.setName(users.getName());
        existingUser.setGender(users.getGender());
        existingUser.setAddress(users.getAddress());
        existingUser.setPhone(users.getPhone());
        existingUser.setRole(users.getRole());
        existingUser.setStatus(users.getStatus());
        existingUser.setUsername(users.getUsername());
        existingUser.setPassword(users.getPassword());
        return userRep.save(existingUser);
    }
}
