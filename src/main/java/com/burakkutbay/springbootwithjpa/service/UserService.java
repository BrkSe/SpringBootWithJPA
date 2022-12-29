package com.burakkutbay.springbootwithjpa.service;

import com.burakkutbay.springbootwithjpa.entity.User;
import com.burakkutbay.springbootwithjpa.repository.IUserRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUserRepository iUserRepository;

    public void saveUser(User user) {
        iUserRepository.save(user);
    }



    public long countUsers(){

        long count = iUserRepository.count();
        return count;

//        return iUserRepository.count();
    }

    public void deleteUser(Integer id){
        iUserRepository.deleteById(id);
    }

    public List<User> findAllById(List<Integer> idListesi){
      return (List<User>) iUserRepository.findAllById(idListesi);
    }

    public User findUser(Integer id) {

        return iUserRepository.findById(id).get();

        //   User user =  iUserRepository.findById(id).get();
        //   return user;

//        Optional<User> optionalUser = iUserRepository.findById(id);
//        User user = optionalUser.get();
//        return user;
    }

    public List<User> adinaGoreBul(String name){
        List<User> allByName = iUserRepository.findAllByName(name);
        return allByName;
    }

    public List<User> adaVeSoyadaGoreBul(String name,String surname){
        List<User> userList=iUserRepository.findAllByNameAndSurname(name, surname);
        return userList;
    }
}
