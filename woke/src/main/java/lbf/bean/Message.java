package lbf.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Message {
     private Integer messageid;
     private Integer receiveid;
     private Integer senderid;
     @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date messagetime;
     private String content;
     private Integer parentmessageid;
     private String pic;
	public Integer getMessageid() {
		return messageid;
	}
	public void setMessageid(Integer messageid) {
		this.messageid = messageid;
	}
	public Integer getReceiveid() {
		return receiveid;
	}
	public void setReceiveid(Integer receiveid) {
		this.receiveid = receiveid;
	}
	public Integer getSenderid() {
		return senderid;
	}
	public void setSenderid(Integer senderid) {
		this.senderid = senderid;
	}
	public Date getMessagetime() {
		return messagetime;
	}
	public void setMessagetime(Date messagetime) {
		this.messagetime = messagetime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getParentmessageid() {
		return parentmessageid;
	}
	public void setParentmessageid(Integer parentmessageid) {
		this.parentmessageid = parentmessageid;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Message(Integer messageid, Integer receiveid, Integer senderid, Date messagetime, String content,
			Integer parentmessageid, String pic) {
		super();
		this.messageid = messageid;
		this.receiveid = receiveid;
		this.senderid = senderid;
		this.messagetime = messagetime;
		this.content = content;
		this.parentmessageid = parentmessageid;
		this.pic = pic;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Message [messageid=" + messageid + ", receiveid=" + receiveid + ", senderid=" + senderid
				+ ", messagetime=" + messagetime + ", content=" + content + ", parentmessageid=" + parentmessageid
				+ ", pic=" + pic + "]";
	}
     
}
