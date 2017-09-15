package lbf.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lbf.bean.User;
import lbf.service.UserService;
@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
    //登录
	@RequestMapping("/")	
     public String index(){

    	 return "login";
     }
	@RequestMapping("/hostinfor")
	public String hostinfor(User user1,HttpServletRequest request,Model model){
		  request.setAttribute("user1",userService.selectall(user1.getUserid()));
		   model.addAttribute("user1",userService.selectall(user1.getUserid()));
		return "updateheadpic";
	}
	//修改头像
	@RequestMapping("/updateheadpic")
	public String updateheadpic(User user1,HttpServletRequest request,Model model){
		  boolean flag=userService.updateheadpic(user1);
		if(!flag){
			   user1=userService.selectall(user1.getUserid());
			   request.setAttribute("user1",user1);
			   model.addAttribute("user1",user1);
			   System.out.println("==================");
			   return "redirect:/index";
		   }else{
			   return "hostinfor";
		   }
	}
	//注册
	@RequestMapping("/register1")
	public String reg(){
		return "register";
	}
	@RequestMapping("/register")
	public String register(User user,HttpServletRequest request,HttpSession httpSession){
		httpSession=request.getSession();
		Random qq1=new Random();
		Integer qq=qq1.nextInt(10000);
		User user1=userService.selectall(qq);
		if(user1==null){
			user.setQq(qq);
			user.setHeadpic("bg.jpg");
			user.setState(1);
			 Date date=new Date();
			 //获取时间戳
			 Timestamp time=new Timestamp(date.getTime());
			 //更新数据库
			 user.setLastvisit(time);
			 boolean flag=userService.insertUser(user);
			 if(!flag){
				 return"register";
			 }
			 User user2=userService.selectall(qq);
			 httpSession.setAttribute("user", user2);
		}else{
			return "register";
		}

		return "register_suc";
	}
	//个人资料修改
	@RequestMapping("/modifyInfor")
	public String modifyInfor(){
				
	return "";
	}				
	@RequestMapping(value={"/login1"},method=RequestMethod.POST)
	public String login1(User user,HttpServletRequest request){
		User user1=userService.selectlogin(user.getQq(),user.getPassword());
		 if(user1!=null&&user1.getPassword().equals(user.getPassword())){
			 HttpSession httpSession=request.getSession();
			 httpSession.setAttribute("user1", user1);
			 //更新时间
			 //获取系统当前时间时间
			 Date date=new Date();
			 //获取时间戳
			 Timestamp time=new Timestamp(date.getTime());
			 //更新数据库
			 user.setLastvisit(time);
         	boolean flag=userService.updateuser(user1);
         	if(!flag){
         		return "error";
         	}
			 return "index";
		 }
		System.out.println(user1);
		return "";
	}
}
