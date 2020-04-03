package com.fred.wimi.wimiproduct.service;

import com.fred.wimi.wimiproduct.api.model.Advertisement;
import com.fred.wimi.wimiproduct.mapper.AdvertisementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/4 2:21 上午
 */
@Service
public class AdvertisementService {

    @Autowired
    private AdvertisementMapper advertisementMapper;

    public List<Advertisement> getAdvertisementList() {
        return advertisementMapper.selectAll();
    }
}
