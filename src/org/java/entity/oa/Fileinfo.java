package org.java.entity.oa;

import java.util.Date;

public class Fileinfo {
    private Long fileid;

    private String filename;

    private Long filetypeid;

    private String remark;

    private String fileowner;

    private Date createdate;

    private Long parentid;

    private String filepath;

    private Long ifdelete;

    public Long getFileid() {
        return fileid;
    }

    public void setFileid(Long fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Long getFiletypeid() {
        return filetypeid;
    }

    public void setFiletypeid(Long filetypeid) {
        this.filetypeid = filetypeid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFileowner() {
        return fileowner;
    }

    public void setFileowner(String fileowner) {
        this.fileowner = fileowner;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Long getIfdelete() {
        return ifdelete;
    }

    public void setIfdelete(Long ifdelete) {
        this.ifdelete = ifdelete;
    }
}