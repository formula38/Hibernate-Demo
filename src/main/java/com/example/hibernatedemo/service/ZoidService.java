package com.example.hibernatedemo.service;

import com.example.hibernatedemo.data.ZoidDAO;
import com.example.hibernatedemo.model.Zoid;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ZoidService {

    private final ZoidDAO zoidDAO = new ZoidDAO();

    public Zoid save(Zoid zoid) {
        return zoidDAO.insert(zoid);
    }

    public Zoid update(Zoid zoid) {
        return zoidDAO.update(zoid);
    }

    public Zoid getById(Long id) {
        return zoidDAO.getById(id);
    }

    public void delete(Long id) {
        zoidDAO.deleteById(id);
    }
}
