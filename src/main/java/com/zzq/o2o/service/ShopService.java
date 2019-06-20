package com.zzq.o2o.service;

import com.zzq.o2o.Entity.Shop;
import com.zzq.o2o.dto.ShopExecution;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;

public interface ShopService {
    ShopExecution addShop(Shop shop, File ShopImg);
}
