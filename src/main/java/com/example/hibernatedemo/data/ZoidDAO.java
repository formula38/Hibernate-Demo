package com.example.hibernatedemo.data;

import com.example.hibernatedemo.model.Zoid;
import com.example.hibernatedemo.util.HibernateUtil;

public class ZoidDAO {
    private HibernateUtil hu;

    // CRUD operations using Save, Update, Delete
    public Zoid insert(Zoid zoid) {
        try {
            hu = new HibernateUtil();
            hu.beginTransaction();
            hu.getSession().save(zoid);
            hu.closeTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return zoid;
    }

    public Zoid update(Zoid zoid) {
        try {
            hu = new HibernateUtil();
            hu.beginTransaction();
            hu.getSession().update(zoid);
            hu.closeTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return zoid;
    }

    public void deleteById(Long id) {
        try {
            hu = new HibernateUtil();
            hu.beginTransaction();
            Zoid zoid = (Zoid) hu.getSession().load(Zoid.class, id);
            hu.getSession().update(zoid);
            hu.closeTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Zoid getById(Long id) {
        Zoid zoid = null;

        try {
            hu = new HibernateUtil();
            hu.beginTransaction();
            hu.getSession().load(Zoid.class, id);
            hu.closeTransaction();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return zoid;
    }

    // Exercise, fill out the rest of the CRUD methods (update, getById, getAll, delete)
    // Also create a service and CommandLine/Servlet layer that lets us interact with the program and choose different operations
}
