package io.github.towerking.feignsimpledemo.controller;

import io.github.towerking.feignsimpledemo.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private FeignService feignService;

    @GetMapping("feign")
    public String hiFeign() {
        return feignService.hiFeign();
    }

}
