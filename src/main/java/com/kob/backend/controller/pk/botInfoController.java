package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author youfei
 * @date 2022/9/3 4:48 PM
 */

@RestController
@RequestMapping("/pk")
public class botInfoController {

    @RequestMapping("/getbotinfo")
    public String getBotInfo() {
        String res = "hello test";
        return res;
    }
}
