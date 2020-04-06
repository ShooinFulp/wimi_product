package com.fred.wimi.wimiproduct.converter;

import com.fred.wimi.wimiproduct.api.model.Advertisement;
import com.fred.wimi.wimiproduct.api.request.advertisement.AddAdvertisementRequest;
import com.fred.wimi.wimiproduct.api.request.advertisement.UpdateAdvertisementRequest;
import org.springframework.beans.BeanUtils;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/5 1:58 上午
 */
public class AdvertisementConverter {
    public static Advertisement AddAdvertisementRequest2Model(AddAdvertisementRequest request) {
        return getAdvertisement(request);
    }


    public static Advertisement UpdateAdvertisementRequest2Model(UpdateAdvertisementRequest request) {
        return getAdvertisement(request);
    }

    private static Advertisement getAdvertisement(AddAdvertisementRequest request) {
        Advertisement advertisement = new Advertisement();
        BeanUtils.copyProperties(request, advertisement);
        return advertisement;
    }
}
