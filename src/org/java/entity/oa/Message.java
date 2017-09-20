package org.java.entity.oa;

import java.util.Date;

public class Message {
    private Long messageid;

    private String title;

    private Long type;

    private String begintime;

    private Date endtime;

    private String fromuserid;

    private Long ifpublish;

    private Date recordtime;

    private String content;

    @Override
	public String toString() {
		return "Message [messageid=" + messageid + ", title=" + title
				+ ", type=" + type + ", begintime=" + begintime + ", endtime="
				+ endtime + ", fromuserid=" + fromuserid + ", ifpublish="
				+ ifpublish + ", recordtime=" + recordtime + ", content="
				+ content + "]";
	}

	public Long getMessageid() {
        return messageid;
    }

    public void setMessageid(Long messageid) {
        this.messageid = messageid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getFromuserid() {
        return fromuserid;
    }

    public void setFromuserid(String fromuserid) {
        this.fromuserid = fromuserid;
    }

    public Long getIfpublish() {
        return ifpublish;
    }

    public void setIfpublish(Long ifpublish) {
        this.ifpublish = ifpublish;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}