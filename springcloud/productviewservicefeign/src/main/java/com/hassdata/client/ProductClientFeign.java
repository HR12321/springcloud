package com.hassdata.client;

import java.util.List;

import com.hassdata.po.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "PRODUCT-DATA-SERVICE")
@Component
public interface ProductClientFeign {

    @GetMapping("/products")
    public List<Product> listProdcuts();
}
