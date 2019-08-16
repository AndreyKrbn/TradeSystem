package com.company;

import java.util.List;

public interface GoodService {
    List<Good> findAll();
    Good findById(Long id);
    Good save(Good good);
}
