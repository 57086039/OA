package org.java.entity.oa;

public class Messagetype {
    private Long messagetypeid;

    private String messagetypename;

    private String messagedesc;

    public Long getMessagetypeid() {
        return messagetypeid;
    }

    public void setMessagetypeid(Long messagetypeid) {
        this.messagetypeid = messagetypeid;
    }

    public String getMessagetypename() {
        return messagetypename;
    }

    public void setMessagetypename(String messagetypename) {
        this.messagetypename = messagetypename;
    }

    public String getMessagedesc() {
        return messagedesc;
    }

    public void setMessagedesc(String messagedesc) {
        this.messagedesc = messagedesc;
    }
}