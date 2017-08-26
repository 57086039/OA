package org.java.entity.oa;

import java.util.Date;

public class Manualsign {
    private Long signid;

    private String userid;

    private Date signtime;

    private String signdesc;

    private Long signtag;

    public Long getSignid() {
        return signid;
    }

    public void setSignid(Long signid) {
        this.signid = signid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public String getSigndesc() {
        return signdesc;
    }

    public void setSigndesc(String signdesc) {
        this.signdesc = signdesc;
    }

    public Long getSigntag() {
        return signtag;
    }

    public void setSigntag(Long signtag) {
        this.signtag = signtag;
    }
}