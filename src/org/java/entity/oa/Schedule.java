package org.java.entity.oa;

public class Schedule {
    private Long scheduleid;

    private String title;

    private String address;

    private Long meetingid;

    public Long getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Long scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(Long meetingid) {
        this.meetingid = meetingid;
    }
}