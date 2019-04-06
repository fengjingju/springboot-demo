package springboot.mybatis.jsp.build.springbootdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.mybatis.jsp.build.springbootdemo.domain.User;
import springboot.mybatis.jsp.build.springbootdemo.mapper.AdminMapper;
import springboot.mybatis.jsp.build.springbootdemo.service.AdminService;
import springboot.mybatis.jsp.build.springbootdemo.util.UuidUtil;

/**
 * @Author: Create by FENGJINGJU
 * @Date: 2019/4/6 14:01
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public User adminLogin(User user) {
        return adminMapper.adminLogin(user);
    }

    @Override
    public void adminRegist(User user) {
        user.setUid(UuidUtil.getUuid());
        adminMapper.adminRegist(user);
    }
}
