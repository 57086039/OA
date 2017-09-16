package org.java.entity.oa;

public class Branchinfo {
    private Long branchid;

    private String branchname;

    @Override
	public String toString() {
		return "Branchinfo [branchid=" + branchid + ", branchname="
				+ branchname + ", branchshortname=" + branchshortname + "]";
	}

	private String branchshortname;

    public Long getBranchid() {
        return branchid;
    }

    public void setBranchid(Long branchid) {
        this.branchid = branchid;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getBranchshortname() {
        return branchshortname;
    }

    public void setBranchshortname(String branchshortname) {
        this.branchshortname = branchshortname;
    }
}