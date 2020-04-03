package com.fred.wimi.wimiproduct.controller;

import com.fred.wimi.wimiproduct.api.model.Advertisement;
import com.fred.wimi.wimiproduct.api.response.BizResult;
import com.fred.wimi.wimiproduct.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/4 2:20 上午
 */
@RestController("/")
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @GetMapping()
    public BizResult<List<Advertisement>> getAllAdvertisement() {
        return BizResult.success(advertisementService.getAdvertisementList());
    }
}
