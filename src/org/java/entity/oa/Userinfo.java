package org.java.entity.oa;

public class Userinfo {
    private String userid;

    private String username;

    private String password;

    private Long departid;

    private Long gender;

    private Long roleid;

    private Long userstateid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public Long getDepartid() {
        return departid;
    }

    public void setDepartid(Long departid) {
        this.departid = departid;
    }

    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getUserstateid() {
        return userstateid;
    }

    public void setUserstateid(Long userstateid) {
        this.userstateid = userstateid;
    }
}