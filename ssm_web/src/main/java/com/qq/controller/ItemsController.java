package com.qq.controller;

import com.qq.pojo.Items;
import com.qq.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: Lee
 * @Date: 2020/9/28 0028 17:48
 * @Description:
 */
@Controller
@RequestMapping("items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<Items> items = itemsService.findAll();
        model.addAttribute("items",items);
        return "items";
    }
    @RequestMapping("save")
    public String save(Items items){
        int account = itemsService.save(items);
        return "redirect:/items/findAll";
    }
}
