package com.lagou.mybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *   
 *  @Title: MybatisController
 *  @Package com.lagou.mybatis.controller
 *  @Description: 模拟MyBatis操作
 *  @author Liush  
 *  @date 2020/8/6
 *  @version V1.0  
 **/
@RestController
public class MybatisController {


    @RequestMapping("/runUserMyBatis")
    public List<String> runjdbc(HttpServletRequest request, HttpServletResponse response) {

        return null;
    }

}
