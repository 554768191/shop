package wl.pojo;

import java.util.Date;

public class SShop {
    private Integer id;

    private String name;

    private Long code;

    private Integer sBossId;

    private String sBossName;

    private String sBossPhone;

    private String sBossEmail;

    private String sBossTel;

    private String address;

    private String sBossAddress;

    private String about;

    private String dq;

    private Date createtime;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
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

    public String getsBossPhone() {
        return sBossPhone;
    }

    public void setsBossPhone(String sBossPhone) {
        this.sBossPhone = sBossPhone == null ? null : sBossPhone.trim();
    }

    public String getsBossEmail() {
        return sBossEmail;
    }

    public void setsBossEmail(String sBossEmail) {
        this.sBossEmail = sBossEmail == null ? null : sBossEmail.trim();
    }

    public String getsBossTel() {
        return sBossTel;
    }

    public void setsBossTel(String sBossTel) {
        this.sBossTel = sBossTel == null ? null : sBossTel.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getsBossAddress() {
        return sBossAddress;
    }

    public void setsBossAddress(String sBossAddress) {
        this.sBossAddress = sBossAddress == null ? null : sBossAddress.trim();
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }

    public String getDq() {
        return dq;
    }

    public void setDq(String dq) {
        this.dq = dq == null ? null : dq.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}