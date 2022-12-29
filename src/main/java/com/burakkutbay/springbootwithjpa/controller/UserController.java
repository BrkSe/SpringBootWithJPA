package com.burakkutbay.springbootwithjpa.controller;

import com.burakkutbay.springbootwithjpa.entity.User;
import com.burakkutbay.springbootwithjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public void kaydet(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping("/find/{id}")
    public User find(@PathVariable Integer id) {

        return userService.findUser(id);

    }

    @GetMapping("/count")
    public long toplamKayitSayisiniBul() {
        long toplamKayitSayisi = userService.countUsers();

        return toplamKayitSayisi;

//        return userService.countUsers();

    }

    @GetMapping("/hepsiniBul")
    public List<User> hepsiniBul(@RequestBody List<Integer> userIdList) {
        return userService.findAllById(userIdList);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> kayitSil(@PathVariable Integer id) {

        userService.deleteUser(id);

        return new ResponseEntity<>("Kayıt silindi", HttpStatus.ACCEPTED);
    }

    @GetMapping("/adagore/{name}")
    public List<User> adaGoreHepsiniBul(@PathVariable String name) {
        List<User> users = userService.adinaGoreBul(name);
        return users;
    }

    @GetMapping("/adasoyadagore/{kriter1}/{kriter2}")
    public List<User> adaSoyadaGoreAra(@PathVariable String name, @PathVariable String surname) {
        List<User> userList = userService.adaVeSoyadaGoreBul(name, surname);
        return userList;
    }

}
