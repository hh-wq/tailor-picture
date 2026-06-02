package com.tailor.picturebackend.controller;

import com.tailor.picturebackend.common.BaseResponse;
import com.tailor.picturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/health")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("OK");
    }
}
