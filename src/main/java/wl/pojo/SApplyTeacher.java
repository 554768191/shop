package wl.pojo;

import java.util.Date;

public class SApplyTeacher {
    private Integer id;

    private Integer sShopId;

    private String sShopName;

    private Integer sBossId;

    private String sBossName;

    private Date createtime;

    private String startendtime;

    private String reason;

    private String count;

    private Integer deptId;

    private Integer status;

    private Integer step;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getsShopId() {
        return sShopId;
    }

    public void setsShopId(Integer sShopId) {
        this.sShopId = sShopId;
    }

    public String getsShopName() {
        return sShopName;
    }

    public void setsShopName(String sShopName) {
        this.sShopName = sShopName == null ? null : sShopName.trim();
    }

    public Integer getsBossId() {
        return sBossId;
    }

    public void setsBossId(Integer sBossId) {
        this.sBossId = sBossId;
    }

    public String getsBossName() {
        return sBossName;
    }

    public void setsBossName(String sBossName) {
        this.sBossName = sBossName == null ? null : sBossName.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getStartendtime() {
        return startendtime;
    }

    public void setStartendtime(String startendtime) {
        this.startendtime = startendtime == null ? null : startendtime.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}