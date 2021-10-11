package com.jrmj.JRMJEdgeService.util.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient
public interface ProductServiceClient {

    @GetMapping("/products")
    public String testProductService();
}