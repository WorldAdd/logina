package lbf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FriendmapController {
/*	//��������
	@RequestMapping("/hostinfor")
	public String friendinfo(){
				
	return "hostinfor";
	}*/
	//�����б�
	@RequestMapping("/showfriends")
	public String showfriends(){
				
	return "askforfriend";
	}
}
