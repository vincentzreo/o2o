package com.zzq.o2o.service;

import com.zzq.o2o.BaseTest;
import com.zzq.o2o.Entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area> areaList = areaService.getAreaList();
        assertEquals("西元",areaList.get(0).getAreaName());
    }
}
