package lbf.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private Integer userid;
	private Integer qq;
	private String username;
	private String password;
	private String headpic;
	private Integer sex;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	private String birthdayString;
	private Integer state;
	private String nowaddress;
	private String hometown;
	private Integer ismarry;
	private Date lastvisit;
	private String lastvisitString;
	@Override
	public String toString() {
		return "User [userid=" + userid + ", qq=" + qq + ", username=" + username + ", password=" + password
				+ ", headpic=" + headpic + ", sex=" + sex + ", birthday=" + birthday + ", birthdayString="
				+ birthdayString + ", state=" + state + ", nowaddress=" + nowaddress + ", hometown=" + hometown
				+ ", ismarry=" + ismarry + ", lastvisit=" + lastvisit + ", lastvisitString=" + lastvisitString + "]";
	}


	public Integer getUserid() {
		return userid;
	}


	public void setUserid(Integer userid) {
		this.userid = userid;
	}


	public Integer getQq() {
		return qq;
	}


	public void setQq(Integer qq) {
		this.qq = qq;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getHeadpic() {
		return headpic;
	}


	public void setHeadpic(String headpic) {
		this.headpic = headpic;
	}


	public Integer getSex() {
		return sex;
	}


	public void setSex(Integer sex) {
		this.sex = sex;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getBirthdayString() {
		return birthdayString;
	}


	public void setBirthdayString(String birthdayString) {
		this.birthdayString = birthdayString;
	}


	public Integer getState() {
		return state;
	}


	public void setState(Integer state) {
		this.state = state;
	}


	public String getNowaddress() {
		return nowaddress;
	}


	public void setNowaddress(String nowaddress) {
		this.nowaddress = nowaddress;
	}


	public String getHometown() {
		return hometown;
	}


	public void setHometown(String hometown) {
		this.hometown = hometown;
	}


	public Integer getIsmarry() {
		return ismarry;
	}


	public void setIsmarry(Integer ismarry) {
		this.ismarry = ismarry;
	}


	public Date getLastvisit() {
		return lastvisit;
	}


	public void setLastvisit(Date lastvisit) {
		this.lastvisit = lastvisit;
	}


	public String getLastvisitString() {
		return lastvisitString;
	}


	public void setLastvisitString(String lastvisitString) {
		this.lastvisitString = lastvisitString;
	}


	public User(Integer userid, Integer qq, String username, String password, String headpic, Integer sex,
			Date birthday, String birthdayString, Integer state, String nowaddress, String hometown, Integer ismarry,
			Date lastvisit, String lastvisitString) {
		super();
		this.userid = userid;
		this.qq = qq;
		this.username = username;
		this.password = password;
		this.headpic = headpic;
		this.sex = sex;
		this.birthday = birthday;
		this.birthdayString = birthdayString;
		this.state = state;
		this.nowaddress = nowaddress;
		this.hometown = hometown;
		this.ismarry = ismarry;
		this.lastvisit = lastvisit;
		this.lastvisitString = lastvisitString;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
