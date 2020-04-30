package com.cst.gulimall.product;


import com.cst.gulimall.product.entity.BrandEntity;
import com.cst.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService ;

    @Test
    public void contextLoads() {
        System.out.println("test...");
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功。");
    }

}
