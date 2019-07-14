package io.github.towerking.feignsimpledemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-client", path = "/")
public interface FeignService {

    @GetMapping(path = "/hi?name=feign")
    String hiFeign();

}
