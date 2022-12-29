package com.burakkutbay.springbootwithjpa.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
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
    private String name;
    private String surname;

    //burada bir veritabanı ilişkisi var
    @OneToOne(cascade = CascadeType.ALL)
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
}
