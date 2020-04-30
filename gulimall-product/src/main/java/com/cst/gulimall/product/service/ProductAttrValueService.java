package com.cst.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cst.common.utils.PageUtils;
import com.cst.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author cst
 * @email cst@gmail.com
 * @date 2020-04-30 15:00:53
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

