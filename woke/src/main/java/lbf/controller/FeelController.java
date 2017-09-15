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
	//����˵˵
	@RequestMapping("/publishFeel")
	public String publishFeel(Feel feel,User user,HttpServletRequest request,HttpSession httpSession){
				User user1=(User) httpSession.getAttribute("user1");
				httpSession=request.getSession();
				 Date date=new Date();
				 //��ȡʱ���
				 Timestamp time=new Timestamp(date.getTime());
				 //�������ݿ�
				feel.setFeeltime(time);
				feel.setUserid(user1.getUserid());
				feel.getFeelcontent();
				feelService.insertFeel(feel);
	return "redirect:/feelindex";
	}
	//�鿴˵˵
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
			Map<String, Object> feeluser=new HashMap<String, Object>(); //Map���ϣ����˵˵�ߵ���Ϣ��˵˵
			feel=(Feel)feels.get(i);
			User user11=userService.selectall(feel.getUserid());
			//httpSession.setAttribute("user", user1);
			feeluser.put("feel", feel); //˵˵�ߵ�˵˵
			feeluser.put("user", user11);  //˵˵�ߵ���Ϣ
			feelList.add(feeluser);  //������˵˵�ߵ�map���Ϸ���list��
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
	//��ҳ
	@RequestMapping("/feelallperson")
	public String feelallperson(){
		
		return "feelallperson";
	}
	//ɾ��˵˵
	@RequestMapping("deleteFeel")
	public String deleteFeel(Feel feel,User user,HttpServletRequest request,HttpSession httpSession){
		Integer def=feelService.deleteFeel(feel.getFid());
		System.out.println(def);
		return "feelindex";
	}
}
