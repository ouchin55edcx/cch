    package com.ouchin.dao.generics;

    import jakarta.persistence.EntityManager;
    import jakarta.persistence.PersistenceContext;

    import java.util.List;
    import java.util.Optional;

    public class GenericDaoImpl<T, ID> implements GenericDao<T, ID> {

        @PersistenceContext
        private EntityManager entityManager;

        protected Class<T> entityClass;



        @Override
        public T save(T entity) {
            return entityManager.merge(entity);
        }

        @Override
        public T update(T entity) {
            return entityManager.merge(entity);
        }

        @Override
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
