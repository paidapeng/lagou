package com.lagou.jdbc.service;

import com.lagou.jdbc.dao.Read;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *   
 *  @Title: JdbcService
 *  @Package com.lagou.jdbc.service
 *  @Description: 操作jdbc
 *  @author Liush  
 *  @date 2020/7/22
 *  @version V1.0  
 **/
@Service
public class JdbcService {
    @Autowired
    Read read;
    public List<String> runJdbc(){
        List<String> list = read.getConnection();
        return  list;
    }

}
