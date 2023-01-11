package com.burakkutbay.springbootwithjpa.repository;

import com.burakkutbay.springbootwithjpa.entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdressRepository extends JpaRepository<Adress, Long> {
}
