package com.origin.liubojin.project.action;

import com.opensymphony.xwork2.ActionSupport;
import com.origin.liubojin.project.service.IndexService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liubojin
 * Created on 2018/4/11
 */
@ParentPackage("basePackage")
@Action(value = "index")//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Results({@Result(name = "success", location = "/WEB-INF/jsp/success.jsp"),
        @Result(name = "error", location = "/WEB-INF/jsp/error.jsp")})//全局配置,如果方法上不指定result,则使用该Result
public class IndexController extends ActionSupport {

    /**
     * 注入userService
     */
    @Autowired
    private IndexService indexService;

    /**
     * http://localhost/index!login.action
     */
    public String login() {
        System.out.println("进入TestAction");
        System.out.println(indexService.showSomething());
        return "success";
    }
}