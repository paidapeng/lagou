package com.lagou.i_persistence.io;

import java.io.InputStream;

/**
 *  通过配置文件的路径解析xml将其中的内容解析到java中
 *  @Title: Resources
 *  @Package com.lagou.i_persistence.io
 *  @Description: 读取配置文件信息
 *  @author Liush
 *  @date 2020/9/8
 *  @version V1.0
 **/
public class Resources {

    public static InputStream getResourceAsStream(String path){
        InputStream inputStream = Resources.class.getResourceAsStream(path);
        return  inputStream;
    }
}
