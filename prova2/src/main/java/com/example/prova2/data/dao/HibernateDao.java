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
        return session.find(getEntityClass(), id);
    }

    @Override
    public List<E> getAll() {
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<E> criteria = builder.createQuery(getEntityClass());
        criteria.from(getEntityClass());
        return session.createQuery(criteria).getResultList();
    }

    @Override
    public void insert(E entity) {
        Session session = getSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }

    @Override
    public void delete(E entity) {
        Session session = getSession();

    }

    @Override
    public void update(E entity) {
        Session session = getSession();

    }

    protected Session getSession() {
        return DbConfig.getSession();
    }
}