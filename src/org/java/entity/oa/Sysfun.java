package org.java.entity.oa;

public class Sysfun {
    private Long nodeid;

    private String displayname;

    private String nodeurl;

    private Long displayorder;

    private Long parentnodeid;

    public Long getNodeid() {
        return nodeid;
    }

    public void setNodeid(Long nodeid) {
        this.nodeid = nodeid;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getNodeurl() {
        return nodeurl;
    }

    public void setNodeurl(String nodeurl) {
        this.nodeurl = nodeurl;
    }

    public Long getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Long displayorder) {
        this.displayorder = displayorder;
    }

    public Long getParentnodeid() {
        return parentnodeid;
    }

    public void setParentnodeid(Long parentnodeid) {
        this.parentnodeid = parentnodeid;
    }
}