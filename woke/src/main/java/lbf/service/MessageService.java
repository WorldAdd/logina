package lbf.service;

import java.util.List;

import lbf.bean.Message;

public interface MessageService {
    public Integer insertMessage(Message message);
    public List<Message>selectMessage(Integer receiveid);
    public Integer deleteMessage(Integer messageid);
}
