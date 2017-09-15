package lbf.bean;

import java.util.Date;

public class Friendmap {
    private Integer friendmapid;
    private Integer userid;
    private Integer friendid;
    private Integer state;
    private Date addtime;
	public Integer getFriendmapid() {
		return friendmapid;
	}
	public void setFriendmapid(Integer friendmapid) {
		this.friendmapid = friendmapid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getFriendid() {
		return friendid;
	}
	public void setFriendid(Integer friendid) {
		this.friendid = friendid;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	@Override
	public String toString() {
		return "Friendmap [friendmapid=" + friendmapid + ", userid=" + userid + ", friendid=" + friendid + ", state="
				+ state + ", addtime=" + addtime + "]";
	}
	public Friendmap(Integer friendmapid, Integer userid, Integer friendid, Integer state, Date addtime) {
		super();
		this.friendmapid = friendmapid;
		this.userid = userid;
		this.friendid = friendid;
		this.state = state;
		this.addtime = addtime;
	}
	public Friendmap() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
