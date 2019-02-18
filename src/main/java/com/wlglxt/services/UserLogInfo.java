package com.wlglxt.services;

import com.wlglxt.bean.Iaccount;

/**
 * Created by admin on 2019/2/18.
 */
public interface UserLogInfo {
    Iaccount getAccInfo(String account , String secretkey);
}
