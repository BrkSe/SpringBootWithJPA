package com.burakkutbay.springbootwithjpa.util;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorOrnek {
    public static void main(String[] args) {
        List<String> isimListesi=new ArrayList<>();
        isimListesi.add("ali");
        isimListesi.add("veli");
        isimListesi.add("mehmet");
        isimListesi.add("ayşe");
        isimListesi.add("fatma");
        isimListesi.add("kazım");


        ListIterator<String> iteratorIsimListesi= isimListesi.listIterator();

        System.out.println("--- İleri Doğru Dolaşma --- ");
        while (iteratorIsimListesi.hasNext()){
            String isim = iteratorIsimListesi.next();
            System.out.println(isim);
        }

        System.out.println("--- Geriye Doğru Dolaşma --- ");
        while (iteratorIsimListesi.hasPrevious()){
            String isim = iteratorIsimListesi.previous();
            System.out.println(isim);
        }

        iteratorIsimListesi= isimListesi.listIterator();
        System.out.println(" Elemanların özellikleri değiştirme");
        while (iteratorIsimListesi.hasNext()){
            String isim = iteratorIsimListesi.next();
            iteratorIsimListesi.set(isim.toUpperCase());
        }

        for (int i = 0; i <isimListesi.size() ; i++) {
            String isim=isimListesi.get(i);
            isimListesi.add(i, isim.toUpperCase());
        }

        for (String isim: isimListesi){
            System.out.println(isim);
        }


    }
}
