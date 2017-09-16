package org.java.entity.oa;

public class Departinfo {
    @Override
	public String toString() {
		return "Departinfo [departid=" + departid + ", departname="
				+ departname + ", userid=" + userid + ", connecttelno="
				+ connecttelno + ", connectmobiletelno=" + connectmobiletelno
				+ ", faxes=" + faxes + ", branchid=" + branchid + "]";
	}

	private Long departid;

    private String departname;

    private String userid;

    private String connecttelno;

    private String connectmobiletelno;

    private String faxes;

    private Long branchid;

    public Long getDepartid() {
        return departid;
    }

    public void setDepartid(Long departid) {
        this.departid = departid;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getConnecttelno() {
        return connecttelno;
    }

    public void setConnecttelno(String connecttelno) {
        this.connecttelno = connecttelno;
    }

    public String getConnectmobiletelno() {
        return connectmobiletelno;
    }

    public void setConnectmobiletelno(String connectmobiletelno) {
        this.connectmobiletelno = connectmobiletelno;
    }

    public String getFaxes() {
        return faxes;
    }

    public void setFaxes(String faxes) {
        this.faxes = faxes;
    }

    public Long getBranchid() {
        return branchid;
    }

    public void setBranchid(Long branchid) {
        this.branchid = branchid;
    }
}