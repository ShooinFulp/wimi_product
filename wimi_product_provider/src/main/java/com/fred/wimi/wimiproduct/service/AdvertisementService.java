package com.fred.wimi.wimiproduct.service;

import com.fred.wimi.wimiproduct.api.constant.WimiConstant;
import com.fred.wimi.wimiproduct.api.enums.exceptioncode.BaseDataErrorCode;
import com.fred.wimi.wimiproduct.api.exception.WimiException;
import com.fred.wimi.wimiproduct.api.framework.model.Pagination;
import com.fred.wimi.wimiproduct.api.model.Advertisement;
import com.fred.wimi.wimiproduct.api.framework.model.GenericBo;
import com.fred.wimi.wimiproduct.api.request.advertisement.AddAdvertisementRequest;
import com.fred.wimi.wimiproduct.api.request.advertisement.SearchAdvertisementRequest;
import com.fred.wimi.wimiproduct.api.request.advertisement.UpdateAdvertisementRequest;
import com.fred.wimi.wimiproduct.api.framework.model.BizResult;
import com.fred.wimi.wimiproduct.api.response.advertisement.SearchAdvertisementResponse;
import com.fred.wimi.wimiproduct.converter.AdvertisementConverter;
import com.fred.wimi.wimiproduct.mapper.AdvertisementMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * 〈广告〉
 *
 * @author: fuliping
 * @date: 2020/4/4 2:21 上午
 */
@Service
public class AdvertisementService extends BaseService<Advertisement> {

    private AdvertisementMapper advertisementMapper;

    public AdvertisementService(AdvertisementMapper advertisementMapper) {
        super(advertisementMapper);
        this.advertisementMapper = advertisementMapper;
    }

    public BizResult<String> addAdvertisement(AddAdvertisementRequest request) {
        if (ObjectUtils.isEmpty(request)) {
            throw WimiException.create(BaseDataErrorCode.Data_ARG_ERROR);
        }

        Advertisement advertisement = AdvertisementConverter.AddAdvertisementRequest2Model(request);

        this.insert(advertisement);

        return BizResult.success(WimiConstant.SUCCESS);
    }

    public BizResult<String> removeAdvertisement(Long id) {
        this.gc(id);
        return BizResult.success(WimiConstant.SUCCESS);
    }

    public BizResult<String> updateAdvertisement(UpdateAdvertisementRequest request) {

        Advertisement advertisement = AdvertisementConverter.UpdateAdvertisementRequest2Model(request);

        this.update(advertisement);
        return BizResult.success(WimiConstant.SUCCESS);
    }

    public Pagination<SearchAdvertisementResponse> selectByBo(GenericBo<SearchAdvertisementRequest> bo) {
        return selectByPage(bo, advertisementMapper::search);
    }
}
