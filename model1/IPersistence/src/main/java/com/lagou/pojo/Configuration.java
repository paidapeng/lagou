package com.lagou.pojo;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 *   
 *  @Description: 解析sqlMap的配置文件bean
 *  @author liushuai
 *  @date 2021/3/12
 *  @version V1.0  
 */
public class Configuration {
    //解析到最后的目的是为一个数据源对象
    private DataSource dataSource;
    /** key:statementId  value:封装好的Statement对象*/
    private Map<String,MapperStatement> mapperStatementMap = new HashMap<>();

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Map<String, MapperStatement> getMapperStatementMap() {
        return mapperStatementMap;
    }

    public void setMapperStatementMap(Map<String, MapperStatement> mapperStatementMap) {
        this.mapperStatementMap = mapperStatementMap;
    }
}
