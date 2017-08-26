package org.java.entity.oa;

import java.util.Date;

public class Accessoryfile {
    private Long accessoryid;

    private Long fileid;

    private String accessoryname;

    private Long accessorysize;

    private Long accessorytype;

    private Date createdate;

    private String accessorypath;

    public Long getAccessoryid() {
        return accessoryid;
    }

    public void setAccessoryid(Long accessoryid) {
        this.accessoryid = accessoryid;
    }

    public Long getFileid() {
        return fileid;
    }

    public void setFileid(Long fileid) {
        this.fileid = fileid;
    }

    public String getAccessoryname() {
        return accessoryname;
    }

    public void setAccessoryname(String accessoryname) {
        this.accessoryname = accessoryname;
    }

    public Long getAccessorysize() {
        return accessorysize;
    }

    public void setAccessorysize(Long accessorysize) {
        this.accessorysize = accessorysize;
    }

    public Long getAccessorytype() {
        return accessorytype;
    }

    public void setAccessorytype(Long accessorytype) {
        this.accessorytype = accessorytype;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getAccessorypath() {
        return accessorypath;
    }

    public void setAccessorypath(String accessorypath) {
        this.accessorypath = accessorypath;
    }
}