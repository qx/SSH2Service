package com.fullwish.service.user;

import java.io.Serializable;

import com.fullwish.bean.entity.User;
import com.fullwish.service.base.DAO;

public interface UserService extends DAO<User> {
    /**
     * 启用指定用户
     *
     * @param user_emails
     */
    public void enable(Serializable... user_emails);

    /**
     * 判断用户是否存在
     *
     * @param user_email
     * @return
     */
    public boolean exsit(String user_email);

    /**
     * 判断用户名及密码是否正确
     *
     * @param user_email
     * @param user_password
     * @return
     */
    public boolean checkUser(String user_email, String user_password);

    /**
     * 用户信息(user_country,user_career,user_nickname)
     *
     * @param user_email    用户名
     * @param user_country  用户国家
     * @param user_career   用户职业
     * @param user_nickname 用户昵称
     */
    public void updateUserInfo(String user_email, String user_country,
                               String user_career, String user_nickname);
}
