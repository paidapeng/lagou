package com.lagou.mybatis.model;

import lombok.Data;

import javax.annotation.Resource;

/**
 *   
 *  @Title: CommonBranchProvince
 *  @Package com.lagou.jdbc.model
 *  @Description: common_branch_province的实体类
 *  @author Liush  
 *  @date 2020/8/6
 *  @version V1.0  
 **/
@Resource
@Data
public class CommonBranchProvince {
    private String id;
    private String branch_en;
    private String branch;
    private String province_en;
    private String province;
}
