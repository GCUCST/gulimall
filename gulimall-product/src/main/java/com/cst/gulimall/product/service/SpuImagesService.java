package com.cst.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cst.common.utils.PageUtils;
import com.cst.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author cst
 * @email cst@gmail.com
 * @date 2020-04-30 15:00:53
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

