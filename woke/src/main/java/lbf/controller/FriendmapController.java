package lbf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FriendmapController {
/*	//个人资料
	@RequestMapping("/hostinfor")
	public String friendinfo(){
				
	return "hostinfor";
	}*/
	//好友列表
	@RequestMapping("/showfriends")
	public String showfriends(){
				
	return "askforfriend";
	}
}
