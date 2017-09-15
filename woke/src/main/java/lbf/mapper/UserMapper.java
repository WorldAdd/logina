package lbf.mapper;

import java.util.Date;

import lbf.bean.User;

public interface UserMapper {
 //全查询
 User selectall (Integer userid);
 User selectlogin(Integer qq);
 //注册
 Integer insertUser(User user);
 Integer updateuser(User user);
 //修改头像
 Integer updateheadpic(User user);
}
