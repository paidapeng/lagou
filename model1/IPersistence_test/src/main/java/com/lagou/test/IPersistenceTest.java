package com.lagou.test;

import com.lagou.io.Resources;
import java.io.InputStream;
/**
 *
 *  @Title: IPersistenceTest
 *  @Package com.lagou.test
 *  @Description: 测试读写文件输入流
 *  @author Liush
 *  @date 2020/9/8
 *  @version V1.0
 **/
public class IPersistenceTest {

    public void test(){
        InputStream inputStream = Resources.getResourceAsStream("conferenceRecord.xml");

    }
}
