package springboot.mybatis.jsp.build.springbootdemo.service;

import springboot.mybatis.jsp.build.springbootdemo.domain.User;

/**
 * @Author: Create by FENGJINGJU
 * @Date: 2019/4/6 14:00
 */
public interface AdminService {

    /**
     * 用户登录
     * @param user
     * @return
     */
    User adminLogin(User user);

    /**
     * 用户注册
     * @param user
     */
    void adminRegist(User user);
}
