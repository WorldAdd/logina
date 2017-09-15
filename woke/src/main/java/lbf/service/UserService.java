package lbf.service;

import java.util.Date;

import lbf.bean.User;

public interface UserService {
      public User selectall (Integer userid);
      public User selectlogin(Integer qq,String password);
      public boolean updateuser(User user);
      public  boolean insertUser(User user);
      public boolean updateheadpic(User user);
}
