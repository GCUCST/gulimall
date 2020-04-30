package com.cst.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cst.common.utils.PageUtils;
import com.cst.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author cst
 * @email cst@gmail.com
 * @date 2020-04-30 15:00:53
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

