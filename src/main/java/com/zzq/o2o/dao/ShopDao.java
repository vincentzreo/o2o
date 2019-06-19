package com.zzq.o2o.dao;

import com.zzq.o2o.Entity.Shop;

public interface ShopDao {
    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);

    /**
     * 跟新店铺信息
     * @param shop
     * @return
     */
    int updateShop(Shop shop);
}
