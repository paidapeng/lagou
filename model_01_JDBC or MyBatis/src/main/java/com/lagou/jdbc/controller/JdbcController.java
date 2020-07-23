package com.lagou.jdbc.controller;

import com.lagou.jdbc.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *   
 *  @Title: JdbcController
 *  @Package com.lagou.jdbc.controller
 *  @Description: 
 *  @author Liush  
 *  @date 2020/7/22
 *  @version V1.0  
 **/
@RestController
public class JdbcController {

    @Autowired
    JdbcService jdbcService;

    @RequestMapping("/runjdbc")
    public List<String> runjdbc(HttpServletRequest request, HttpServletResponse response) {
        List<String> list =  jdbcService.runJdbc();
        return list;
    }

}
