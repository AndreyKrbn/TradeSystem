package com.company;

import com.company.model.Good;

import java.util.List;

public interface GoodService {
    List<Good> findAll();
    Good findById(Long id);
    Good save(Good good);
}
