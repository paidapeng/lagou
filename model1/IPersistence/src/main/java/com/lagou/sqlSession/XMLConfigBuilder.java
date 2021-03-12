package com.lagou.sqlSession;

import com.lagou.pojo.Configuration;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 *   
 *  @Description: 
 *  @author liushuai
 *  @date 2021/3/12
 *  @version V1.0  
 */
public class XMLConfigBuilder {

    /**
     * 将配置文件解析成 Configuration
     *
     * @param inputStream:
     * @Author: liushai
     * @Date: 2021/3/12 21:17
     * @return: com.lagou.pojo.Configuration
     */
    public Configuration parseConfig(InputStream inputStream) throws DocumentException {
        Document document = new SAXReader().read(inputStream);
        //这里拿到了根对象<configuration>
        Element rootElement = document.getRootElement();
        Properties properties = new Properties();
        List<Element> list = rootElement.selectNodes("//property");
        for (Element element:list){
            String name = element.attributeValue("name");
            String value = element.attributeValue("value");
            properties.setProperty(name,value);
        }
        // TODO: 2021/3/12  
        return null;
    }

}
