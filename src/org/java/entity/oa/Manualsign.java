package org.java.entity.oa;

import java.io.Serializable;
import java.util.Date;

/**
 * «©µΩ¿‡
 * @author Admin
 *
 */
public class Manualsign implements Serializable {
    private Long signid;

    private String userid;

    private String signtime;

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

    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
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

	@Override
	public String toString() {
		return "Manualsign [signid=" + signid + ", userid=" + userid
				+ ", signtime=" + signtime + ", signdesc=" + signdesc
				+ ", signtag=" + signtag + "]";
	}
    
}