package com.wlglxt.services.impl;

import com.wlglxt.bean.Iaccount;
import com.wlglxt.dao.LogInfo;
import com.wlglxt.services.UserLogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2019/2/17.
 */
@Service("LogInfoServiece")
public class UserLogInfoImpl implements UserLogInfo {
    @Autowired
    UserLogInfo userLogInfo;
    @Override
    public Iaccount getAccInfo(String account, String secretkey) {
        return userLogInfo.getAccInfo(account,secretkey);
    }
}
