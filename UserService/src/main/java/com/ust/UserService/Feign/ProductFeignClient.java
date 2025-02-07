package com.ust.UserService.Feign;

import com.ust.UserService.Response.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductFeignClient {
    @GetMapping("/products/{pid}")
    Product getProductById(@PathVariable("pid") Long pid);
}
