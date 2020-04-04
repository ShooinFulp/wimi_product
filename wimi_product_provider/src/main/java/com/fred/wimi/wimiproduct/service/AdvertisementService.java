package com.fred.wimi.wimiproduct.service;

import com.fred.wimi.wimiproduct.api.constant.WimiConstant;
import com.fred.wimi.wimiproduct.api.enums.exceptioncode.BaseDataErrorCode;
import com.fred.wimi.wimiproduct.api.exception.WimiException;
import com.fred.wimi.wimiproduct.api.model.Advertisement;
import com.fred.wimi.wimiproduct.api.request.AddAdvertisementRequest;
import com.fred.wimi.wimiproduct.api.response.BizResult;
import com.fred.wimi.wimiproduct.converter.AdvertisementConverter;
import com.fred.wimi.wimiproduct.mapper.AdvertisementMapper;
import com.sun.tools.javac.util.Assert;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Random;

/**
 * 〈功能概述〉
 *
 * @author: fuliping
 * @date: 2020/4/4 2:21 上午
 */
@Service
public class AdvertisementService extends BaseService<Advertisement> {

    public AdvertisementService(AdvertisementMapper advertisementMapper) {
        super(advertisementMapper);
    }

    public BizResult<String> addAdvertisement(AddAdvertisementRequest request) {
        if (ObjectUtils.isEmpty(request)) {
            throw WimiException.create(BaseDataErrorCode.Data_ARG_ERROR);
        }
        Advertisement advertisement = AdvertisementConverter.AddAdvertisementRequest2Model(request);

        advertisement.setId(new Random().nextLong());

        this.insert(advertisement);
        return BizResult.success(WimiConstant.SUCCESS);
    }
}
