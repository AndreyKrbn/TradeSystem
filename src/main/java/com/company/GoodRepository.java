package com.company;

import com.company.model.Good;
import org.springframework.data.repository.CrudRepository;

public interface GoodRepository extends CrudRepository<Good, Long> {
}
