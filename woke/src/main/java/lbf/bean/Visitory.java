package lbf.bean;

import java.sql.Date;

public class Visitory {
    private Integer vid;
    private Integer userid;
    private Integer visid;
    private Date creattime;
    private Integer count;
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getVisid() {
		return visid;
	}
	public void setVisid(Integer visid) {
		this.visid = visid;
	}
	public Date getCreattime() {
		return creattime;
	}
	public void setCreattime(Date creattime) {
		this.creattime = creattime;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Visitory(Integer vid, Integer userid, Integer visid, Date creattime, Integer count) {
		super();
		this.vid = vid;
		this.userid = userid;
		this.visid = visid;
		this.creattime = creattime;
		this.count = count;
	}
	public Visitory() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Visitory [vid=" + vid + ", userid=" + userid + ", visid=" + visid + ", creattime=" + creattime
				+ ", count=" + count + "]";
	}
    	
}
