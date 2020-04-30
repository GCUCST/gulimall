package com.cst.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cst.common.utils.PageUtils;
import com.cst.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author cst
 * @email cst@gmail.com
 * @date 2020-04-30 15:00:52
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

