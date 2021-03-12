package com.lagou.test;

import com.lagou.io.Resources;
import com.lagou.sqlSession.SqlSessionFactory;
import com.lagou.sqlSession.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author Liush
 * @version V1.0
 * @Title: IPersistenceTest
 * @Package com.lagou.test
 * @Description: 测试读写文件输入流
 * @date 2020/9/8
 **/
public class IPersistenceTest {

    public void test() {

        InputStream inputStream = Resources.getResourceAsStream("conferenceRecord.xml");
        try {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
