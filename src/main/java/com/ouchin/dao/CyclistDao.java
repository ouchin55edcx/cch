package com.ouchin.dao;


import com.ouchin.dao.generics.GenericDao;
import com.ouchin.entity.Cyclist;

import java.util.List;

public interface CyclistDao extends GenericDao<Cyclist, Long> {
    List<Cyclist> findByNationality(String nationality);
    List<Cyclist> findByTeam(String team);
}
