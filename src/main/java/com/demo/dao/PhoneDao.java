package com.demo.dao;

import com.demo.entity.PhoneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PhoneDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");

    public List<PhoneEntity> getAllPhone() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<PhoneEntity> list = em.createQuery("select c from PhoneEntity c", PhoneEntity.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public void insertProduct(PhoneEntity phone) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(phone);
        em.getTransaction().commit();
        em.close();
    }


}
