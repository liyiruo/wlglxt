package com.wlglxt.dao;

import com.wlglxt.bean.Iaccount;
import org.apache.ibatis.annotations.Param;

/**
 * Created by admin on 2019/2/16.
 */
public interface LogInfo {

   // Iaccount getAccInfo(String account ,String secretkey);
    Iaccount getAccInfo(@Param("account") String account,  @Param("secretkey")String secretkey);
    //public User selectUser(@Param("userName") String name, int @Param("deptId") deptId);


}
