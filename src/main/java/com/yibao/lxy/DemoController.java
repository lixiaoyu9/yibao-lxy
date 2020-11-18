package com.yibao.lxy;

import com.pig4cloud.plugin.idempotent.annotation.Idempotent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaoyu
 * @date 2020/10/27
 */
@RestController()
public class DemoController {

    @Idempotent(key = "key")
    @GetMapping("test")
    public String test(@RequestParam String key) {
        return key + "success";
    }
}
