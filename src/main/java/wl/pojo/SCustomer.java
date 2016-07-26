package wl.pojo;

import java.util.Date;

public class SCustomer {
    private Integer id;

    private String name;

    private Long code;

    private String sex;

    private Integer attrId;

    private String attrUrl;

    private String like;

    private String tel;

    private String phone;

    private String address;

    private String email;

    private Integer sMemberId;

    private String sMemberName;

    private Integer sUserId;

    private String sUserName;

    private Integer sShopId;

    private String source;

    private String servicecount;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getAttrUrl() {
        return attrUrl;
    }

    public void setAttrUrl(String attrUrl) {
        this.attrUrl = attrUrl == null ? null : attrUrl.trim();
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like == null ? null : like.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getsMemberId() {
        return sMemberId;
    }

    public void setsMemberId(Integer sMemberId) {
        this.sMemberId = sMemberId;
    }

    public String getsMemberName() {
        return sMemberName;
    }

    public void setsMemberName(String sMemberName) {
        this.sMemberName = sMemberName == null ? null : sMemberName.trim();
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

    public Integer getsShopId() {
        return sShopId;
    }

    public void setsShopId(Integer sShopId) {
        this.sShopId = sShopId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getServicecount() {
        return servicecount;
    }

    public void setServicecount(String servicecount) {
        this.servicecount = servicecount == null ? null : servicecount.trim();
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