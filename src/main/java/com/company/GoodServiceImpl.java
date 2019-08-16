package com.company;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
//@Service("qwerty")
@Component
public class GoodServiceImpl implements GoodService {

    @Autowired
    private GoodRepository goodRepository;

    @Override
    @Transactional(readOnly=true)
    public List<Good> findAll() {
        return Lists.newArrayList(goodRepository.findAll());
    }

    @Override
    public Good findById(Long id) {
        return goodRepository.findOne(id);
    }

    @Override
    public Good save(Good good) {
        return goodRepository.save(good);
    }

    @Autowired
    public void setGoodRepository(GoodRepository goodRepository) {
        this.goodRepository =goodRepository;
}

}
