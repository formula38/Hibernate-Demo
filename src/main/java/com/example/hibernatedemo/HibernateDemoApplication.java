package com.example.hibernatedemo;

import com.example.hibernatedemo.controller.ZoidController;
import com.example.hibernatedemo.data.ZoidDAO;
import com.example.hibernatedemo.model.Zoid;
import com.example.hibernatedemo.service.ZoidService;

//@SpringBootApplication
public class HibernateDemoApplication {

    public static void main(String[] args)
    {
        Zoid zoid = new Zoid("Lion", "Rex", "Silver", 10.5, 9);
        ZoidDAO zoidDAO = new ZoidDAO();
        zoidDAO.insert(zoid);

        // check if the id was generated
        System.out.println("Using DAO: ");
        System.out.println(zoid);

        ZoidService zoidService = new ZoidService();
        System.out.println();
        System.out.println("Using Service layer: ");
        System.out.println(zoidService.save(zoid));

        ZoidController zoidController = new ZoidController();
        System.out.println();
        System.out.println("Using Controller layer: ");
        System.out.println(zoidController.save(zoid));
    }

}
