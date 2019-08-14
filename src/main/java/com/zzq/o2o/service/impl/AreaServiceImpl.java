package com.zzq.o2o.service.impl;

import com.zzq.o2o.Entity.Area;
import com.zzq.o2o.dao.AreaDao;
import com.zzq.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {

        return areaDao.queryArea();
    }
}
