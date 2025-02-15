package com.company.serviceImpl;

import com.company.GoodRepository;
import com.company.GoodService;
import com.company.model.Good;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@Component
public class GoodServiceImpl implements GoodService {

    @Autowired
    private GoodRepository goodRepository;


    @Transactional(readOnly=true)
    public List<Good> findAll() {
        return Lists.newArrayList(goodRepository.findAll());
    }


    public Good findById(Long id) {
        return goodRepository.findOne(id);
    }


    public Good save(Good good) {
        return goodRepository.save(good);
    }

/*    @Autowired
    public void setGoodRepository(GoodRepository goodRepository) {
        this.goodRepository =goodRepository;
}*/

}
