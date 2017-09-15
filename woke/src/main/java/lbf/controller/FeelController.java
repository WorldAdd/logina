package lbf.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lbf.bean.Feel;
import lbf.bean.User;
import lbf.service.FeelService;
import lbf.service.UserService;

@Controller
@RequestMapping("/")
public class FeelController {
	@Autowired
	private UserService userService;
	@Autowired
	private FeelService feelService;
	public FeelService getFeelService() {
		return feelService;
	}
	public void setFeelService(FeelService feelService) {
		this.feelService = feelService;
	}
	//插入说说
	@RequestMapping("/publishFeel")
	public String publishFeel(Feel feel,User user,HttpServletRequest request,HttpSession httpSession){
				User user1=(User) httpSession.getAttribute("user1");
				httpSession=request.getSession();
				 Date date=new Date();
				 //获取时间戳
				 Timestamp time=new Timestamp(date.getTime());
				 //更新数据库
				feel.setFeeltime(time);
				feel.setUserid(user1.getUserid());
				feel.getFeelcontent();
				feelService.insertFeel(feel);
	return "redirect:/feelindex";
	}
	//查看说说
	@RequestMapping(value={"/feelindex"})
	public String feelindex(Feel feel,User user,HttpServletRequest request,HttpSession httpSession) {
		User user1=(User)httpSession.getAttribute("user1");
		httpSession=request.getSession();
		List<Feel> feels=feelService.selectFeel(user1.getUserid());
/*	    countpage=feels.size();
		if(countpage>0){
			Integer a= (int) Math.ceil(countpage/2);
			httpSession.setAttribute("a", a);
			Integer b=0;
			for (int i = 0; i <a; i++) {
				b=b+2;
				httpSession.setAttribute("b", b);
			}
			System.out.println(a);
		}*/
		//httpSession.setAttribute("feels", feels);
		List<Map<String, Object>> feelList=new ArrayList<Map<String, Object>>(); 
		for(int i=0;i<feels.size();i++){
			Map<String, Object> feeluser=new HashMap<String, Object>(); //Map集合，封存说说者的信息和说说
			feel=(Feel)feels.get(i);
			User user11=userService.selectall(feel.getUserid());
			//httpSession.setAttribute("user", user1);
			feeluser.put("feel", feel); //说说者的说说
			feeluser.put("user", user11);  //说说者的信息
			feelList.add(feeluser);  //将单个说说者的map集合放置list中
			System.out.println(feeluser);
		}
		httpSession.setAttribute("feelList", feelList);
		return "feelindex";
	}
	@RequestMapping("/feelmy")
	public String feelmy(@RequestParam("countpage")int countpage,Model model,HttpServletRequest request){
		User user1=(User) request.getSession().getAttribute("user1");
		List<Feel> feels=feelService.selectFeel(user1.getUserid());
		return "feelindex";
	}
	//主页
	@RequestMapping("/feelallperson")
	public String feelallperson(){
		
		return "feelallperson";
	}
	//删除说说
	@RequestMapping("deleteFeel")
	public String deleteFeel(Feel feel,User user,HttpServletRequest request,HttpSession httpSession){
		Integer def=feelService.deleteFeel(feel.getFid());
		System.out.println(def);
		return "feelindex";
	}
}
