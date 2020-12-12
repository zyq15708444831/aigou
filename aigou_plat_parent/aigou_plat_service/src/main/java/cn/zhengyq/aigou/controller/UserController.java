package cn.zhengyq.aigou.controller;

import cn.zhengyq.aigou.common.ResultBean;
import cn.zhengyq.aigou.domain.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Administrator
 * @Date 2020/12/11 18:52
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResultBean login(@RequestBody User user){
        ResultBean resultBean = ResultBean.me();
        if (user != null && !StringUtils.isEmpty(user.getName()) && !StringUtils.isEmpty(user.getPassword())) {
            if ("zhangsan".equals(user.getName()) && "123456".equals(user.getPassword()) ) {
                return resultBean.setMessage("登陆成功！");
            }
            return resultBean.setSuccess(false).setMessage("用户名或密码错误！");
        }
        return resultBean.setMessage("登陆失败！").setSuccess(false);
    }
}
