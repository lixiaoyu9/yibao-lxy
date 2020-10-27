package com.yibao.lxy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaoyu
 * @date 2020/10/27
 */
@RestController()
public class DemoController {

    @GetMapping("hello")
    public String test() {
        return "hello world!";
    }
}
