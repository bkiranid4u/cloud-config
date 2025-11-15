package com.kiran4dev.configdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kiran4dev.configdemo.models.BuildInfo;





@RestController
public class BuildInfoController {

    private final BuildInfo buildInfo;
    public BuildInfoController(BuildInfo buildInfo) {
        this.buildInfo = buildInfo;
    }

    @GetMapping("app/buildinfo")
    public String getBuildIndo() {
        return buildInfo.toString();
    }
    
}
