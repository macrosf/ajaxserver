package com.imooc.ajaxserver;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get1")
    private ResultBean get1() {
        System.out.println("TestController.get1()");
        return new ResultBean("get1 ok");
    }

    @PostMapping("/postJson")
    private ResultBean postJson(@RequestBody User user){
        System.out.println("TestController.postJson()");
        return new ResultBean("postJson " + user.getName());
    }
}
