package lbf.mapper;

import java.util.Date;

import lbf.bean.User;

public interface UserMapper {
 //ȫ��ѯ
 User selectall (Integer userid);
 User selectlogin(Integer qq);
 //ע��
 Integer insertUser(User user);
 Integer updateuser(User user);
 //�޸�ͷ��
 Integer updateheadpic(User user);
}
