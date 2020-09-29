package com.lagou.jdbc.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.OnceAbsoluteMerge;

/**
 *   
 *  @Title: Common_branch_province
 *  @Package com.lagou.jdbc.domain
 *  @Description: common_branch_province 对应实体类
 *  @author Liush  
 *  @date 2020/9/17
 *  @version V1.0  
 **/
@ColumnWidth(25)
@OnceAbsoluteMerge(firstRowIndex = 0, lastRowIndex = 0, firstColumnIndex = 1, lastColumnIndex = 3)
public class Common_branch_province {

    @ExcelProperty("ID")
    private String id;
    @ExcelProperty("大区英文名")
    private String branch_en;
    @ExcelProperty("大区中文名")
    private String branch;
    @ExcelProperty("省份英文名")
    private String province_en;
    @ExcelProperty("省份中文名")
    private String province;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBranch_en() {
        return branch_en;
    }

    public void setBranch_en(String branch_en) {
        this.branch_en = branch_en;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getProvince_en() {
        return province_en;
    }

    public void setProvince_en(String province_en) {
        this.province_en = province_en;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
