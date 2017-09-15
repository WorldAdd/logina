package lbf.mapper;

import java.util.List;

import lbf.bean.Message;

public interface MessageMapper {
      //Ìí¼ÓÁôÑÔ
	Integer insertMessage(Message messagge);
	//²é¿´ÁôÑÔ
	List<Message>selectMessage(Integer receiveid);
	//É¾³ıÁôÑÔ
	Integer deleteMessage(Integer messageid);
}
