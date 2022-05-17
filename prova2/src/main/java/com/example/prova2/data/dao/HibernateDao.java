package com.example.prova2.data.dao;

import com.example.prova2.data.config.DbConfig;
import com.example.prova2.data.model.BaseEntity;
import org.hibernate.Session;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;

public abstract class HibernateDao<E extends BaseEntity> implements Dao<E> {

    protected abstract Class<E> getEntityClass();

    @Override
    public E getBydId(long id) {
        Session session = getSession();
        E entity = session.find(getEntityClass(), id);
        session.close();
        return entity;
    }

    @Override
    public List<E> getByAll() {
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<E> criteria = builder.createQuery(getEntityClass());
        criteria.from(getEntityClass());
        List<E> entities = session.createQuery(criteria).getResultList();
        session.close();
        return entities;
    }

    @Override
    public void insert(E entity) {
        Session session = getSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(E entity) {
        Session session = getSession();

        session.close();
    }

    @Override
    public void update(E entity) {
        Session session = getSession();

        session.close();
    }

    private Session getSession() {
        return DbConfig.getSession();
    }
}