package com.wlglxt.controller;

import com.wlglxt.bean.Iaccount;
import com.wlglxt.services.UserLogInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 2019/2/18.
 */
@Controller
public class LogController {

    @Autowired
    private UserLogInfo userLogInfo;

    @RequestMapping(value = "succ", method = RequestMethod.POST)
    public ModelAndView toLog(String account, String secretkey) {
        System.out.println(account);
        Iaccount iaccount = userLogInfo.getAccInfo(account, secretkey);

        System.out.println(iaccount.toString());
        return new ModelAndView("succ", "iaccount", iaccount);
    }


}
