package com.test.demo.service.impl;

import com.test.demo.entity.Demo;
import com.test.demo.repo.DemoRepo;
import com.test.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    private final DemoRepo demoRepo;

    public DemoServiceImpl(DemoRepo demoRepo) {
        this.demoRepo = demoRepo;
    }

    @Override
    public Demo get(long id) {
        Demo obj = demoRepo.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));

        return obj;
    }

    @Override
    public void delete(long id) {
        Demo obj = demoRepo.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));

        demoRepo.delete(obj);
    }

    @Override
    public Demo create(String name) {
        Demo newDemo = new Demo();
        newDemo.setName(name);

        demoRepo.save(newDemo);

        return newDemo;
    }
}
