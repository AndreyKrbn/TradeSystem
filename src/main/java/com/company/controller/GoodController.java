package com.company.controller;

import com.company.GoodService;
import com.company.model.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/goods")
@Controller
public class GoodController {


    @Autowired
    private GoodService goodService;


    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {

        List<Good> goods = goodService.findAll();
        uiModel.addAttribute("goods", goods);

        return "goods/list";
    }

}
