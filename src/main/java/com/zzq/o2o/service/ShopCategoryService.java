package com.zzq.o2o.service;

import com.zzq.o2o.Entity.Area;
import com.zzq.o2o.Entity.ShopCategory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 19788
 * Date: 2019/8/16
 * Time: 14:49
 * Description: No Description
 */
public interface ShopCategoryService {
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
