package com.jieve.ad.service;

import com.jieve.ad.entity.AdPlan;
import com.jieve.ad.exception.AdException;
import com.jieve.ad.vo.AdPlanGetRequest;
import com.jieve.ad.vo.AdPlanRequest;
import com.jieve.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * @author Jieve
 */
public interface IAdPlanService {

    /**
     * 创建推广计划
     * @param adPlanRequest
     * @return
     * @throws AdException
     */
    AdPlanResponse createAdPlan(AdPlanRequest adPlanRequest) throws AdException;

    /**
     * 获取推广计划
     * @param adPlanGetRequest
     * @return
     * @throws AdException
     */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest adPlanGetRequest) throws AdException;

    /**
     * 更新推广计划
     * @param adPlanRequest
     * @return
     * @throws AdException
     */
    AdPlanResponse updateAdPlan(AdPlanRequest adPlanRequest) throws AdException;

    /**
     * 删除推广计划
     * @param adPlanRequest
     * @throws AdException
     */
    void deleteAdPlan(AdPlanRequest adPlanRequest) throws AdException;
}
