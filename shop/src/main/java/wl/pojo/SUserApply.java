package wl.pojo;

import java.util.Date;

public class SUserApply {
    private Integer id;

    private Integer sUserId;

    private String sUserName;

    private String reason;

    private String qjStartendtime;

    private String sApplyType;

    private Date oldWorktime;

    private Date newWorktime;

    private String hbStartendtime;

    private Integer hbUserId;

    private Integer isPass;

    private Date createtime;

    private Integer sShopId;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getsUserId() {
        return sUserId;
    }

    public void setsUserId(Integer sUserId) {
        this.sUserId = sUserId;
    }

    public String getsUserName() {
        return sUserName;
    }

    public void setsUserName(String sUserName) {
        this.sUserName = sUserName == null ? null : sUserName.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getQjStartendtime() {
        return qjStartendtime;
    }

    public void setQjStartendtime(String qjStartendtime) {
        this.qjStartendtime = qjStartendtime == null ? null : qjStartendtime.trim();
    }

    public String getsApplyType() {
        return sApplyType;
    }

    public void setsApplyType(String sApplyType) {
        this.sApplyType = sApplyType == null ? null : sApplyType.trim();
    }

    public Date getOldWorktime() {
        return oldWorktime;
    }

    public void setOldWorktime(Date oldWorktime) {
        this.oldWorktime = oldWorktime;
    }

    public Date getNewWorktime() {
        return newWorktime;
    }

    public void setNewWorktime(Date newWorktime) {
        this.newWorktime = newWorktime;
    }

    public String getHbStartendtime() {
        return hbStartendtime;
    }

    public void setHbStartendtime(String hbStartendtime) {
        this.hbStartendtime = hbStartendtime == null ? null : hbStartendtime.trim();
    }

    public Integer getHbUserId() {
        return hbUserId;
    }

    public void setHbUserId(Integer hbUserId) {
        this.hbUserId = hbUserId;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getsShopId() {
        return sShopId;
    }

    public void setsShopId(Integer sShopId) {
        this.sShopId = sShopId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}