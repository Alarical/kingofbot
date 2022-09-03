package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author youfei
 * @date 2022/9/3 4:48 PM
 */

@RestController
@RequestMapping("/pk")
public class botInfoController {

    @RequestMapping("/getbotinfo")
    public List<String> getBotInfo() {
        List<String> res = new ArrayList<>();
        res.add("dasfas");
        return res;
    }
}
