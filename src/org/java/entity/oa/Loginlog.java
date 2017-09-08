package org.java.entity.oa;

import java.util.Date;

public class Loginlog {
    private Long loginid;

    private String userid;

    private Date logintime;

    private Long ifsuccess;

    private String loginuserip;

    private String logindesc;

    public Long getLoginid() {
        return loginid;
    }

    public void setLoginid(Long loginid) {
        this.loginid = loginid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Long getIfsuccess() {
        return ifsuccess;
    }

    public void setIfsuccess(Long ifsuccess) {
        this.ifsuccess = ifsuccess;
    }

    public String getLoginuserip() {
        return loginuserip;
    }

    public void setLoginuserip(String loginuserip) {
        this.loginuserip = loginuserip;
    }

    public String getLogindesc() {
        return logindesc;
    }

    public void setLogindesc(String logindesc) {
        this.logindesc = logindesc;
    }

	@Override
	public String toString() {
		return "Loginlog [loginid=" + loginid + ", userid=" + userid
				+ ", logintime=" + logintime + ", ifsuccess=" + ifsuccess
				+ ", loginuserip=" + loginuserip + ", logindesc=" + logindesc
				+ "]";
	}
    
    

}