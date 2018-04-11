package com.origin.liubojin.project.service;

import com.origin.liubojin.project.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liubojin
 * Created on 2018/4/11
 */
@Service
public class IndexService {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexService.class);

//    @Resource
//    private UserDao userDao;

    public String showSomething() {
        return "hello world";
    }

}
