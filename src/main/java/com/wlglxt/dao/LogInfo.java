package com.wlglxt.dao;

import com.wlglxt.bean.Iaccount;

/**
 * Created by admin on 2019/2/16.
 */
public interface LogInfo {

    Iaccount getAccInfo(String account ,String secretkey);

}
