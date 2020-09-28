package com.qq.service;

import com.qq.pojo.Items;

import java.util.List;

public interface ItemsService {


    List<Items> findAll();

    int save(Items items);
}
