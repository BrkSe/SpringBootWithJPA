package com.burakkutbay.springbootwithjpa.repository;

import com.burakkutbay.springbootwithjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {
    // adını verecem bana bulduğun tüm isimde aynı olanları getir

    // select * from User where name='';
    List<User> findAllByName(String name);

    List<User> findAllByNameAndSurname(String name,String surname);



}
