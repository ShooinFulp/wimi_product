package com.fred.wimi.wimiproduct.controller;

import com.fred.wimi.wimiproduct.api.constant.WimiConstant;
import com.fred.wimi.wimiproduct.api.model.Advertisement;
import com.fred.wimi.wimiproduct.api.request.AddAdvertisementRequest;
import com.fred.wimi.wimiproduct.api.response.BizResult;
import com.fred.wimi.wimiproduct.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈广告〉
 *
 * @author: fuliping
 * @date: 2020/4/4 2:20 上午
 */
@RestController()
@RequestMapping("advertisement")
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @GetMapping
    public BizResult<List<Advertisement>> getAllAdvertisement() {
        return BizResult.success(advertisementService.selectAll());
    }

    @GetMapping("/{id}")
    public BizResult<Advertisement> getAdvertisementById(@PathVariable("id") Long id){
        return  BizResult.success(advertisementService.selectById(id));
    }

    @PostMapping
    public BizResult<String> addAdvertisement(@RequestBody AddAdvertisementRequest request){
        return  advertisementService.addAdvertisement(request);

    }
}
