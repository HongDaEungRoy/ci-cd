package com.example.spring_boot_docker

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/docker")
    fun startDocker(): String {
        return "Docker started"
    }
}