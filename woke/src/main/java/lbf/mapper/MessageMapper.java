package lbf.mapper;

import java.util.List;

import lbf.bean.Message;

public interface MessageMapper {
      //�������
	Integer insertMessage(Message messagge);
	//�鿴����
	List<Message>selectMessage(Integer receiveid);
	//ɾ������
	Integer deleteMessage(Integer messageid);
}
