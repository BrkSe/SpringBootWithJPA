package com.burakkutbay.springbootwithjpa.controller;

import com.burakkutbay.springbootwithjpa.entity.Adress;
import com.burakkutbay.springbootwithjpa.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdressController {

    @Autowired
    private AdressService adressService;

    @PostMapping("/adres/kayit")
    public void adresKayit(@RequestBody Adress adress){
        adressService.save(adress);
    }

}
