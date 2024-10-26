package com.ouchin.dao.generics;

import com.ouchin.entity.Cyclist;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class GenericDaoImpl<T, ID> implements GenericDao<T, ID> {

    @PersistenceContext
    private EntityManager entityManager;

    protected Class<T> entityClass;

    public GenericDaoImpl(Class<Cyclist> cyclistClass) {
    }


    @Override
    @Transactional
    public T save(T entity) {
        return entityManager.merge(entity);
    }

    @Override
    @Transactional
    public T update(T entity) {
        return entityManager.merge(entity);
    }

    @Override
    @Transactional
    public void delete(T entity) {
        entityManager.remove(entity);
    }


    @Override
    public Optional<T> findById(ID id) {
       T foundEntity = entityManager.find(entityClass, id);
       return Optional.ofNullable(foundEntity);
    }


    @Override
    public List<T> findAll() {
        return entityManager.createQuery("FROM " + entityClass.getName(), entityClass).getResultList();
    }
}
