package com.qq.service.impl;

import com.qq.dao.ItemsDao;
import com.qq.pojo.Items;
import com.qq.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Lee
 * @Date: 2020/9/28 0028 17:36
 * @Description:
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Override
    public int save(Items items) {
        int account = itemsDao.save(items);
        System.out.println("account:" + account);
//        int num = 10 / 0;
        return account;
    }
}
