package com.zzq.o2o.service;

import com.zzq.o2o.Entity.Shop;
import com.zzq.o2o.dto.ShopExecution;
import com.zzq.o2o.exceptions.ShopOperationException;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.InputStream;

public interface ShopService {
    /**
     *
     * @param shop
     * @param ShopImgInputStream
     * @param fileName
     * @return
     * @throws ShopOperationException
     */
    ShopExecution addShop(Shop shop, InputStream ShopImgInputStream,String fileName) throws ShopOperationException;

    /**
     * 通过店铺id获取店铺信息
     * @param shopId
     * @return
     */
    Shop getByShopId(long shopId);

    /**
     *更新shop
     * @param shop 要更新的内容
     * @param shopImgInputStream 传入文件流
     * @param fileName 文件名
     * @return
     * @throws ShopOperationException
     */
    ShopExecution modifyShop(Shop shop,InputStream shopImgInputStream,String fileName)throws ShopOperationException;
}
