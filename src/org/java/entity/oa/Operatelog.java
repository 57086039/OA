package org.java.entity.oa;

import java.util.Date;

public class Operatelog {
    private Long operateid;

    private String userid;

    private String operatename;

    private String objectid;

    private String operatedesc;

    private Date operatetime;

    public Long getOperateid() {
        return operateid;
    }

    public void setOperateid(Long operateid) {
        this.operateid = operateid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getOperatename() {
        return operatename;
    }

    public void setOperatename(String operatename) {
        this.operatename = operatename;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    public String getOperatedesc() {
        return operatedesc;
    }

    public void setOperatedesc(String operatedesc) {
        this.operatedesc = operatedesc;
    }

    public Date getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }
}