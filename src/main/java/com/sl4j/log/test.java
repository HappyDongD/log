package com.sl4j.log;


import com.sl4j.log.core.log.ParamLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @ParamLog(value = "test")
    @RequestMapping("test")
    public String sayhi() {
        System.out.println("nininiHHHH---->>>");
        return "233333";
    }
}
