package com.lagou.jdbc.domain;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 *
 *  @Title: Common_branch
 *  @Package com.lagou.jdbc.domain
 *  @Description:
 *  @author Liush
 *  @date 2020/7/23
 *  @version V1.0
 **/
@Data
@Configuration
public class Common_branch {
    String branch;
    String branch_en;
    String create;
    String update;
    String user;
    String remark;

}
