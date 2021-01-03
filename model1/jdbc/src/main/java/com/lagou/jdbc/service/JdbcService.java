package com.lagou.jdbc.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.lagou.jdbc.dao.JDBCRead;
import com.lagou.jdbc.domain.Common_branch_province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *  @Title: JdbcService
 *  @Package com.lagou.jdbc.service
 *  @Description: 操作jdbc
 *  @author Liush
 *  @date 2020/7/22
 *  @version V1.0
 **/
@Service
public class JdbcService {
    @Autowired
    JDBCRead read;

    public List<String> runJdbc() {
        List<String> list = read.getConnection();
        return list;
    }

    public void excel(HttpServletResponse response) {
        ExcelWriter excelWriter = null;
        try {
            response.reset();
            response.setContentType("applications/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            String fileName = URLEncoder.encode("参会人员列表", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
            excelWriter = EasyExcel.write(response.getOutputStream(), Common_branch_province.class).needHead(Boolean.TRUE).build();
            WriteSheet writeSheet = EasyExcel.writerSheet("模板").needHead(Boolean.FALSE).build();
            WriteTable writeTable1 = EasyExcel.writerTable(1).needHead(Boolean.TRUE).build();

            String sql = "SELECT * FROM `common_branch_province`";
            List<String> tableName = new ArrayList<>();
            tableName.add("id");
            tableName.add("branch_en");
            tableName.add("branch");
            tableName.add("province_en");
            tableName.add("province");
            List<Map<String, String>> list = read.querySql(sql, tableName);
            List<Common_branch_province> commonBranchProvinceList = new ArrayList<>();
            for (Map<String, String> map : list) {
                Common_branch_province common = new Common_branch_province();
                common.setId(map.get("id"));
                common.setBranch(map.get("branch"));
                common.setBranch_en(map.get("branch_en"));
                common.setProvince(map.get("province"));
                common.setProvince_en(map.get("province_en"));
                commonBranchProvinceList.add(common);
            }
            excelWriter.write(commonBranchProvinceList, writeSheet, writeTable1);
        } catch (Exception e) {
            // 重置response
            response.reset();
            response.setContentType("applications/json");
            response.setCharacterEncoding("utf-8");
            Map<String, String> map = new HashMap<String, String>();
            map.put("status", "5000");
            map.put("message", "下载文件失败" + e.getMessage());
        } finally {
            // 千万别忘记finish 会帮忙关闭流
            if (excelWriter != null) {
                excelWriter.finish();
            }
        }
        return;
    }
}
