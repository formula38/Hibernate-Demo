package com.example.hibernatedemo.controller;

import com.example.hibernatedemo.model.Zoid;
import com.example.hibernatedemo.service.ZoidService;
import org.springframework.stereotype.Controller;

@Controller
public class ZoidController {

    private final ZoidService zoidService = new ZoidService();

    public Zoid save(Zoid zoid) {
        return zoidService.save(zoid);
    }

    public Zoid editZoid(Zoid zoid) {
        return zoidService.update(zoid);
    }

    public Zoid findZoidById(Long id) {
        return zoidService.getById(id);
    }

    public void deleteZoidById(Long id) {
        zoidService.delete(id);
    }
}
