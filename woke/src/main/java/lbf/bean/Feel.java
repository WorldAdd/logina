package lbf.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Feel {
   private Integer fid;
   private Integer userid;
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date feeltime;
   private String feelcontent;
   private String pic;
public Integer getFid() {
	return fid;
}
public void setFid(Integer fid) {
	this.fid = fid;
}
public Integer getUserid() {
	return userid;
}
public void setUserid(Integer userid) {
	this.userid = userid;
}
public Date getFeeltime() {
	return feeltime;
}
public void setFeeltime(Date feeltime) {
	this.feeltime = feeltime;
}
public String getFeelcontent() {
	return feelcontent;
}
public void setFeelcontent(String feelcontent) {
	this.feelcontent = feelcontent;
}
public String getPic() {
	return pic;
}
public void setPic(String pic) {
	this.pic = pic;
}
public Feel(Integer fid, Integer userid, Date feeltime, String feelcontent, String pic) {
	super();
	this.fid = fid;
	this.userid = userid;
	this.feeltime = feeltime;
	this.feelcontent = feelcontent;
	this.pic = pic;
}
public Feel() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Feel [fid=" + fid + ", userid=" + userid + ", feeltime=" + feeltime + ", feelcontent=" + feelcontent
			+ ", pic=" + pic + "]";
}

}
