package com.xamcheck.accelerate.cloud.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
    @RequestMapping("/prsFallBack")
    public Mono<String> prsServiceFallBack() {
        return Mono.just("PRS Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/masterFallback")
    public Mono<String> masterServiceFallBack() {
        return Mono.just("Master Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/examFallBack")
    public Mono<String> examServiceFallBack() {
        return Mono.just("Exam Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/schoolAppFallBack")
    public Mono<String> schoolAppServiceFallBack() {
        return Mono.just("School App Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/teacherAppFallBack")
    public Mono<String> teacherAppServiceFallBack() {
        return Mono.just("Teacher App Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/adminrAppFallBack")
    public Mono<String> adminAppServiceFallBack() {
        return Mono.just("Admin App Service is taking too long to respond or is down. Please try again later");
    }

}
