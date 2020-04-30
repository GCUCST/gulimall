package com.cst.gulimall.product.dao;

import com.cst.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cst
 * @email cst@gmail.com
 * @date 2020-04-30 15:00:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
