    package com.ouchin.dao.generics;

    import java.util.List;
    import java.util.Optional;

    public interface GenericDao<T,ID>{

        T save(T entity);
        T update(T entity);
        void delete(T entity);
        Optional<T> findById(ID id);
        List<T> findAll();
    }
