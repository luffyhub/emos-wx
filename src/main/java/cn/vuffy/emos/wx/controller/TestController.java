package cn.vuffy.emos.wx.controller;

import cn.vuffy.emos.wx.common.util.R;
import cn.vuffy.emos.wx.controller.form.TestSayHelloForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("test")
@Api("测试 Web 接口")
public class TestController {

    @PostMapping("sayHello")
    @ApiOperation("最简单的测试方法")
    public R sayHello(@Valid @RequestBody TestSayHelloForm form) {
        return R.ok().put("message", "Hello," + form.getName());
    }
}
