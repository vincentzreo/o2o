package com.zzq.o2o.service;

import com.zzq.o2o.Entity.Shop;
import com.zzq.o2o.dto.ShopExecution;
import com.zzq.o2o.exceptions.ShopOperationException;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.InputStream;

public interface ShopService {
    ShopExecution addShop(Shop shop, InputStream ShopImgInputStream,String fileName) throws ShopOperationException;
}
