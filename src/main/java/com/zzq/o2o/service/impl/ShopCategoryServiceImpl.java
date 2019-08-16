package com.zzq.o2o.service.impl;

import com.zzq.o2o.Entity.ShopCategory;
import com.zzq.o2o.dao.ShopCategoryDao;
import com.zzq.o2o.service.ShopCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 19788
 * Date: 2019/8/16
 * Time: 14:50
 * Description: No Description
 */
@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {
    @Autowired
    private ShopCategoryDao shopCategoryDao;
    @Override
    public List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) {
        return shopCategoryDao.queryShopCategory(shopCategoryCondition);
    }
}
