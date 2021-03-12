package com.lagou.sqlSession;

import com.lagou.pojo.Configuration;
import org.dom4j.DocumentException;

import java.io.InputStream;

/**
 *   
 *  @Description: 解析配置文件，生产sql session
 *  @author liushuai
 *  @date 2021/3/12
 *  @version V1.0  
 */
public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build (InputStream inputStream) throws DocumentException {
        //使用dom4j解析配置文件，解析后封装到configuration中
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder();
        Configuration configuration = xmlConfigBuilder.parseConfig(inputStream);
        //创建SqlSessionFactory
        return null;
    }
}
