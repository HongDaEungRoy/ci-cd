package com.example.spring_boot_docker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootDockerApplication

fun main(args: Array<String>) {
	runApplication<SpringBootDockerApplication>(*args)
}
