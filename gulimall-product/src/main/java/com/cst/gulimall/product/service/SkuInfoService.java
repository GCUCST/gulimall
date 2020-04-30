package com.cst.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cst.common.utils.PageUtils;
import com.cst.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author cst
 * @email cst@gmail.com
 * @date 2020-04-30 15:00:53
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

