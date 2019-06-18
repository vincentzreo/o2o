package com.zzq.o2o.dao;

import com.zzq.o2o.Entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 列出区域列表
     * @return arealist
     */
    List<Area> queryArea();
}
