package wl.pojo;

import java.util.Date;

public class SUser {
    private Integer id;

    private Long code;

    private String name;

    private Integer sShopId;

    private String sShopName;

    private Integer sRoleId;

    private String sRoleName;

    private String title;

    private Integer attachId;

    private String attachUrl;

    private String tel;

    private String selftel;

    private String password;

    private String emergencyTel;

    private String email;

    private String sex;

    private Date birthday;

    private String phone;

    private String address;

    private String about;

    private String stratEndTime;

    private String basepay;

    private String achievement;

    private String notes;

    private Date createtime;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getsRoleId() {
        return sRoleId;
    }

    public void setsRoleId(Integer sRoleId) {
        this.sRoleId = sRoleId;
    }

    public String getsRoleName() {
        return sRoleName;
    }

    public void setsRoleName(String sRoleName) {
        this.sRoleName = sRoleName == null ? null : sRoleName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getAttachId() {
        return attachId;
    }

    public void setAttachId(Integer attachId) {
        this.attachId = attachId;
    }

    public String getAttachUrl() {
        return attachUrl;
    }

    public void setAttachUrl(String attachUrl) {
        this.attachUrl = attachUrl == null ? null : attachUrl.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getSelftel() {
        return selftel;
    }

    public void setSelftel(String selftel) {
        this.selftel = selftel == null ? null : selftel.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmergencyTel() {
        return emergencyTel;
    }

    public void setEmergencyTel(String emergencyTel) {
        this.emergencyTel = emergencyTel == null ? null : emergencyTel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }

    public String getStratEndTime() {
        return stratEndTime;
    }

    public void setStratEndTime(String stratEndTime) {
        this.stratEndTime = stratEndTime == null ? null : stratEndTime.trim();
    }

    public String getBasepay() {
        return basepay;
    }

    public void setBasepay(String basepay) {
        this.basepay = basepay == null ? null : basepay.trim();
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement == null ? null : achievement.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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