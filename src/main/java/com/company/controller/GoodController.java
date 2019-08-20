package com.company.controller;

import com.company.GoodService;
import com.company.model.Good;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/goods")
@Controller
public class GoodController {

    //private final Logger logger = LoggerFactory.getLogger(GoodController.class);

    @Autowired
    private GoodService goodService;


    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        //logger.info("Listing goods");

        List<Good> goods = goodService.findAll();
        uiModel.addAttribute("goods", goods);

        //logger.info("No. of goods: " + goods.size());

        return "goods/list";
    }
}
