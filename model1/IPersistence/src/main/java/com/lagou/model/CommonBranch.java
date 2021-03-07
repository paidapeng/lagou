package com.lagou.model;

import lombok.Data;

import javax.annotation.Resource;

/**
 *
 *  @Title: CommonBranch
 *  @Package com.lagou.jdbc.model
 *  @Description: common_branch的实体类
 *  @author Liush
 *  @date 2020/8/6
 *  @version V1.0
 **/
@Resource
@Data
public class CommonBranch {
    private String id;
    private String branch;
    private String branch_en;
    private String create;
    private String update;
    private String user;
    private String remark;
}
