package com.ouchin.dao.impl;

import com.ouchin.dao.CyclistDao;
import com.ouchin.dao.generics.GenericDaoImpl;
import com.ouchin.entity.Cyclist;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class CyclistDaoImpl implements CyclistDao {


    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Cyclist> findByNationality(String nationality) {
        return entityManager.createQuery(
                        "SELECT c FROM Cyclist c WHERE c.nationality = :nationality", Cyclist.class)
                .setParameter("nationality", nationality)
                .getResultList();
    }

    @Override
    public List<Cyclist> findByTeam(String team) {
        return entityManager.createQuery(
                        "SELECT c FROM Cyclist c WHERE c.team = :team", Cyclist.class)
                .setParameter("team", team)
                .getResultList();
    }

    @Override
    public Cyclist save(Cyclist entity) {
        return null;
    }

    @Override
    public Cyclist update(Cyclist entity) {
        return null;
    }

    @Override
    public void delete(Cyclist entity) {
    }

    @Override
    public Optional<Cyclist> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Cyclist> findAll() {
        return List.of();
    }
}
