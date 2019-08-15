package com.zzq.o2o.dao;

import com.zzq.o2o.Entity.ShopCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 19788
 * Date: 2019/8/16
 * Time: 0:01
 * Description: No Description
 */
public interface ShopCategoryDao {
    List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition") ShopCategory shopCategoryCondition);
}
