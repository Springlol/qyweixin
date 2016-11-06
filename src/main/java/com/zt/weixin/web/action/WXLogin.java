package com.zt.weixin.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zt.weixin.entity.User;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;


/**
 * Created by zhoutao on 16/11/6.
 */
@Namespace("/weixin")
public class WXLogin extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    public User getModel() {
        return this.user;
    }

    @Action("login")
    public String login(){
        return SUCCESS;
    }

}
