package com.burakkutbay.springbootwithjpa.service;

import com.burakkutbay.springbootwithjpa.entity.Adress;
import com.burakkutbay.springbootwithjpa.repository.IAdressRepository;
import org.springframework.stereotype.Service;

@Service
public class AdressService {

   // @Autowired
    private final IAdressRepository iAdressRepository;

    public AdressService(IAdressRepository iAdressRepository) {
        this.iAdressRepository = iAdressRepository;
    }

    public void save(Adress adress){
        iAdressRepository.save(adress);
    }
}
