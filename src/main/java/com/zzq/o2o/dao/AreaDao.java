package com.zzq.o2o.dao;

import com.zzq.o2o.Entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 列出区域列表
     * @return arealist
     */
    List<Area> queryArea();
    //增加
    void add(Area area);
    //删除
    void delete(Area area);
    //改
    void update(Area area);
    //查
    Area get(int id);
}
