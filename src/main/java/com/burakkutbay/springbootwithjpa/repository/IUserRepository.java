package com.burakkutbay.springbootwithjpa.repository;

import com.burakkutbay.springbootwithjpa.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {
}
