package com.fred.wimi.wimiproduct.controller;

import com.fred.wimi.wimiproduct.api.framework.model.Pagination;
import com.fred.wimi.wimiproduct.api.model.Advertisement;
import com.fred.wimi.wimiproduct.api.framework.model.GenericBo;
import com.fred.wimi.wimiproduct.api.request.advertisement.AddAdvertisementRequest;
import com.fred.wimi.wimiproduct.api.request.advertisement.SearchAdvertisementRequest;
import com.fred.wimi.wimiproduct.api.request.advertisement.UpdateAdvertisementRequest;
import com.fred.wimi.wimiproduct.api.response.BizResult;
import com.fred.wimi.wimiproduct.api.response.advertisement.SearchAdvertisementResponse;
import com.fred.wimi.wimiproduct.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

//    @GetMapping
//    public BizResult<List<Advertisement>> getAllAdvertisement() {
//        return BizResult.success(advertisementService.selectAll());
//    }

    @PostMapping("search")
    public Pagination<SearchAdvertisementResponse> searchAdvertisement(@RequestBody GenericBo<SearchAdvertisementRequest> genericBo) {
        return advertisementService.selectByBo(genericBo);
    }

    @GetMapping("/{id}")
    public BizResult<Advertisement> getAdvertisementById(@PathVariable("id") Long id) {
        return BizResult.success(advertisementService.selectById(id));
    }

    @PostMapping
    public BizResult<String> addAdvertisement(@RequestBody AddAdvertisementRequest request) {
        return advertisementService.addAdvertisement(request);
    }

    @DeleteMapping
    public BizResult<String> removeAdvertisement(@RequestParam("id") Long id) {
        return advertisementService.removeAdvertisement(id);
    }

    @PutMapping
    public BizResult<String> updateAdvertisement(@RequestBody UpdateAdvertisementRequest request) {
        return advertisementService.updateAdvertisement(request);
    }
}
