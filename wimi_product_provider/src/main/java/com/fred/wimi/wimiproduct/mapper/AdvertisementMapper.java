package com.fred.wimi.wimiproduct.mapper;

import com.fred.wimi.wimiproduct.api.model.Advertisement;
import com.fred.wimi.wimiproduct.api.request.advertisement.SearchAdvertisementRequest;
import com.fred.wimi.wimiproduct.api.response.advertisement.SearchAdvertisementResponse;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AdvertisementMapper extends Mapper<Advertisement> {
     List<SearchAdvertisementResponse> search(@Param("param") SearchAdvertisementRequest request);
}