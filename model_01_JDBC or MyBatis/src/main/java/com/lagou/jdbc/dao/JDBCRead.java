package com.lagou.jdbc.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *   
 *  @Title: read
 *  @Package com.lagou.jdbc.dao
 *  @Description: 数据库读取
 *  @author Liush  
 *  @date 2020/7/22
 *  @version V1.0  
 **/
@Service
@Slf4j
public class JDBCRead {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public List<String> getConnection() {
        List<String> runnerList = new ArrayList<>();
        try {
//            java反射注入mysql的驱动
            Class.forName("com.mysql.jdbc.Driver");
//            向驱动中写入mysql的地址
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jthxwg_volte?characterEncoding=utf-8&useSSL=false", "root", "Mysql456852@.");

            preparedStatement = connection.prepareStatement("SELECT * FROM `common_topology_configure_eor_wj` WHERE compute_room = 'CL'");
//            preparedStatement.setString(1, "'CL'");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String ip = resultSet.getString("ip");
                runnerList.add(ip);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return runnerList;
    }

}
