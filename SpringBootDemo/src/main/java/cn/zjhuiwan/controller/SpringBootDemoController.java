package cn.zjhuiwan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 是spring4里的新注解，是@ResponseBody和@Controller的缩写
public class SpringBootDemoController {
    @RequestMapping("/hello")
    public String hello() {
        return "HELLO SpringBoot! 这是一个springboot的demo<p>这是一个测试赛</p>欢迎大家访问我的个人博客：http://www.zjhuiwan.cn<a href='http://www.zjhuiwan.cn'>ZJBLOG</a>";
    }

}
