package com.qq.dao;

import com.qq.pojo.Items;

import java.util.List;

public interface ItemsDao {
    List<Items> findAll();

    int save(Items items);

    int ahri(Items items);
}
