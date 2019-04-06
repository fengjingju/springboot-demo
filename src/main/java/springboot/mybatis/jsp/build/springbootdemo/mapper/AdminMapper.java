package springboot.mybatis.jsp.build.springbootdemo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import springboot.mybatis.jsp.build.springbootdemo.domain.User;

/**
 * @Author: Create by FENGJINGJU
 * @Date: 2019/4/6 11:10
 */
@Mapper
@Repository
public interface AdminMapper {

    @Select("SELECT * FROM tbl_user WHERE username=#{userName} and password=#{password}")
    User adminLogin(User user);

    @Insert("INSERT INTO tbl_user (uid,username,password) VALUES (#{uid},#{userName},#{password})")
    void adminRegist(User user);
}
