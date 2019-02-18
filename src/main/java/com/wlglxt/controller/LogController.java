package com.wlglxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2019/2/18.
 */
@Controller("log")
public class LogController {
    @RequestMapping("succ")
    public String toLog() {
        return "succ";
    }
}
