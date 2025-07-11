package org.vehiclerental.vehiclerentalsystem.service;
import org.vehiclerental.vehiclerentalsystem.model.User;
import org.vehiclerental.vehiclerentalsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;


    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
