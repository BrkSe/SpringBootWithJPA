package com.burakkutbay.springbootwithjpa.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.BatchSize;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;
import java.time.LocalDateTime;

//CODE - FIRST
@Entity
@Table(name = "kullanicilar")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull(message = "Ad alanı null olamaz.")
    private String name;
    @NotNull
    @NotBlank
    private String surname;

    @Email(message = "Email formatını düzgün girin")
    private String email;

    @Pattern(regexp =  "^\\d{10}$" , message = "Telefon 10 karakterden oluşmalıdır.")
    private String phone;

    @Min(9)
    @Max(65)
    private int age;

    //burada bir veritabanı ilişkisi var
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id", referencedColumnName = "id")
    private Adress adress;


    /**
     *  Java JPA Nesneler arasındaki
     *  veri ilişkiler
     *
     *  OneToMany (Bire Çok ) User -> Adress
     *  Bir entitnin başka bir entity ile birden fazla ilişkisi olduğu
     *  Eğer User birden fazla adres değeri olasacaksa bunu kullancaz
     *
     *  ManyToMany (Çoka Çok) User <-> Roller (kimin admin var 10 kişi, rol tarafında ) (bir userin birden fazla rolü)
     *  Her entitynin birbirleriyle birden fazla rolleri olabilir.
     *
     *  OneToOne (User=Adres)
     *  Bir entitynin bir entitye bağımlılığı olur. bir ilişkilendirme.
     *
     */


    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
