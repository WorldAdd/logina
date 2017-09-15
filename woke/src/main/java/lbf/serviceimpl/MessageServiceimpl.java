package lbf.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lbf.bean.Message;
import lbf.mapper.MessageMapper;
import lbf.service.MessageService;
@Service
public class MessageServiceimpl implements MessageService{
	@Autowired
    private MessageMapper messageMapper;
	public MessageMapper getMessageMapper() {
		return messageMapper;
	}
	public void setMessageMapper(MessageMapper messageMapper) {
		this.messageMapper = messageMapper;
	}
	@Override
	public Integer insertMessage(Message messagge) {
		return messageMapper.insertMessage(messagge);
	}
	@Override
	public List<Message> selectMessage(Integer receiveid) {
		return messageMapper.selectMessage(receiveid);
	}
	@Override
	public Integer deleteMessage(Integer messageid) {
		return messageMapper.deleteMessage(messageid);
	}

}
