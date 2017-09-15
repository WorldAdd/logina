package lbf.serviceimpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lbf.bean.User;
import lbf.mapper.UserMapper;
import lbf.service.UserService;
@Service
public class UserServiceimpl implements UserService{
    @Autowired
	private UserMapper usermapper;
    
	public UserMapper getUsermapper() {
		return usermapper;
	}

	public void setUsermapper(UserMapper usermapper) {
		this.usermapper = usermapper;
	}

	@Override
	public User selectall(Integer userid) {
		
		return usermapper.selectall(userid);
	}

	@Override
	public User selectlogin(Integer qq, String password) {
		User user=usermapper.selectlogin(qq);
		if(user!=null&& user.getPassword().equals(password)){
			return user;
		}
		return null;
	}

	@Override
	public boolean updateuser(User user) {
		//ÈıÄ¿ÔËËã
		return usermapper.updateuser(user)>0?true:false;
/*		Integer count=usermapper.updateuser(user);
		if(count>0){
			
		}*/
	}

	@Override
	public boolean insertUser(User user) {
		return usermapper.insertUser(user)>0?true:false;
	}

	@Override
	public boolean updateheadpic(User user) {
		
		return usermapper.updateheadpic(user)>0?true: false;
	}
 
}
