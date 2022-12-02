package com.example.hibernatedemo;

import com.example.hibernatedemo.data.ZoidDAO;
import com.example.hibernatedemo.model.Zoid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class HibernateDemoApplication {

    public static void main(String[] args)
    {
        Zoid zoid = new Zoid("Lion", "Rex", "Silver", 10.5, 9);
        ZoidDAO zoidDAO = new ZoidDAO();
        zoidDAO.insert(zoid);
        // check if the id was generated
        System.out.println(zoid);
    }

}
