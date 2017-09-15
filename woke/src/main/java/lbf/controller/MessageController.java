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
import org.springframework.web.bind.annotation.RequestMapping;

import lbf.bean.Feel;
import lbf.bean.Message;
import lbf.bean.User;
import lbf.service.MessageService;
import lbf.service.UserService;

@Controller
@RequestMapping("/")
public class MessageController {
	@Autowired
	private MessageService messageService;
	@Autowired
	private UserService userService;
	public MessageService getMessageService() {
		return messageService;
	}
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
/*	@RequestMapping("/")
	public String message1(){
		return "message";
	}*/
	//留言板
	@RequestMapping("/message1")
	public String message(Message message,User user,HttpServletRequest request,HttpSession httpSession){
		User user1=(User) httpSession.getAttribute("user1");
		httpSession=request.getSession();
		 Date date=new Date();
		 //获取时间戳
		 Timestamp time=new Timestamp(date.getTime());
		 message.setMessagetime(time);
		 message.setReceiveid(user1.getUserid());
		 message.getContent();
		 messageService.insertMessage(message);
		 return "redirect:/showmessage";
	}
	//查看留言
	@RequestMapping("/showmessage")
	public String showMessages(Message message,User user,HttpServletRequest request,HttpSession httpSession){
		User user1=(User)httpSession.getAttribute("user1");
		httpSession=request.getSession();
		List<Message>messages=messageService.selectMessage(user1.getUserid());
		List<Map<String, Object>> messageList=new ArrayList<Map<String, Object>>();
		for (int i = 0; i <messages.size(); i++) {
			Map<String, Object> messageuser=new HashMap<String, Object>();
			message=(Message)messages.get(i);
			User user11=userService.selectall(message.getReceiveid());
			messageuser.put("message",message);
			messageuser.put("user",user11);
			messageList.add(messageuser);
			System.out.println(messageuser);
		}
		httpSession.setAttribute("messageList", messageList);
	    return "message";
	}
	@RequestMapping("deleteMessage")
	public String deleteMessage(Message message,User user,HttpServletRequest request,HttpSession httpSession){
		Integer dem=messageService.deleteMessage(message.getMessageid());
		System.out.println(dem);
		return "redirect:/showmessage";
	}
}
