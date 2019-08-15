package com.zzq.o2o.dao;

import com.zzq.o2o.BaseTest;
import com.zzq.o2o.Entity.Shop;
import com.zzq.o2o.Entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: 19788
 * Date: 2019/8/16
 * Time: 0:11
 * Description: No Description
 */
public class ShopCategoryDaoTest extends BaseTest {
    @Autowired
    private ShopCategoryDao shopCategoryDao;
    @Test
    public void queryShopCategory(){
        List<ShopCategory> categoryList = shopCategoryDao.queryShopCategory(new ShopCategory());
        assertEquals(2,categoryList.size());
        ShopCategory testCategory = new ShopCategory();
        ShopCategory parentCategory = new ShopCategory();
        parentCategory.setShopCategoryId(1L);
        testCategory.setParent(parentCategory);
        categoryList = shopCategoryDao.queryShopCategory(testCategory);
        assertEquals(1,categoryList.size());
        System.out.println(categoryList.get(0).getShopCategoryName());
    }
}
