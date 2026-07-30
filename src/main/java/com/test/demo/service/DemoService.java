package com.test.demo.service;

import com.test.demo.entity.Demo;

public interface DemoService {

    Demo get(long id);

    void delete(long id);

    Demo create(String name);

}
