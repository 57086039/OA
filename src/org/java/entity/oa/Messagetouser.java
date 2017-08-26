package org.java.entity.oa;

public class Messagetouser {
    private Long id;

    private Long messageid;

    private String touserid;

    private Long ifread;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMessageid() {
        return messageid;
    }

    public void setMessageid(Long messageid) {
        this.messageid = messageid;
    }

    public String getTouserid() {
        return touserid;
    }

    public void setTouserid(String touserid) {
        this.touserid = touserid;
    }

    public Long getIfread() {
        return ifread;
    }

    public void setIfread(Long ifread) {
        this.ifread = ifread;
    }
}