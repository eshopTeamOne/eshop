package com.onlineShop.service.impl;
import com.onlineShop.bean.AdvertPosition;
import com.onlineShop.bean.SysShop;
import com.onlineShop.dto.AdvertPositionMapper;
import com.onlineShop.dto.SysShopMapper;
import com.onlineShop.service.DemoMgr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DemoMgrImpl implements DemoMgr
{
    @Autowired
    private AdvertPositionMapper mapper;

    @Override
    public Integer get()
    {
        AdvertPosition p = new AdvertPosition();
        p.setCreated(new Date());
        p.setImgLink("aaaaa");
        p.setImgUrl("dfaf");
        p.setModified(new Date());

        return mapper.insert(p);
    }
}
