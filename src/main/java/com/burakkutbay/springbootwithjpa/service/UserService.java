package com.burakkutbay.springbootwithjpa.service;

import com.burakkutbay.springbootwithjpa.entity.User;
import com.burakkutbay.springbootwithjpa.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepository iUserRepository;

    public void saveUser(User user){
        iUserRepository.save(user);
    }

    public void deleteUser(User user){
        iUserRepository.delete(user);
    }

    public void findUser(Integer id){
        iUserRepository.findById(id);
    }
}
