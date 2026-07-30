package com.test.demo.controller;

import com.test.demo.entity.Demo;
import com.test.demo.service.DemoService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @PostMapping("/create")
    public Demo create(@RequestParam("name") String name) {
        return demoService.create(name);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") long id) {
        demoService.delete(id);
    }

    @PostMapping("/get")
    public Demo get(@RequestParam("id") long id) {
        return demoService.get(id);
    }
}
