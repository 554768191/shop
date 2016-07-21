package wl.pojo;

import java.util.Date;

public class SService {
    private Integer id;

    private Long code;

    private String name;

    private String price;

    private String serviceTime;

    private String tcStyle;

    private String royaltyAmount;

    private String about;

    private Date createtime;

    private Integer isDelete;

    private Integer sShopId;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime == null ? null : serviceTime.trim();
    }

    public String getTcStyle() {
        return tcStyle;
    }

    public void setTcStyle(String tcStyle) {
        this.tcStyle = tcStyle == null ? null : tcStyle.trim();
    }

    public String getRoyaltyAmount() {
        return royaltyAmount;
    }

    public void setRoyaltyAmount(String royaltyAmount) {
        this.royaltyAmount = royaltyAmount == null ? null : royaltyAmount.trim();
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
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

    public Integer getsShopId() {
        return sShopId;
    }

    public void setsShopId(Integer sShopId) {
        this.sShopId = sShopId;
    }
}