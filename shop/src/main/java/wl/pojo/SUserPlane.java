package wl.pojo;

import java.util.Date;

public class SUserPlane {
    private Integer id;

    private Integer sUserId;

    private String sUserName;

    private String title;

    private String completeCycle;

    private String startandendtime;

    private String about;

    private Integer shopId;

    private Date createtime;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCompleteCycle() {
        return completeCycle;
    }

    public void setCompleteCycle(String completeCycle) {
        this.completeCycle = completeCycle == null ? null : completeCycle.trim();
    }

    public String getStartandendtime() {
        return startandendtime;
    }

    public void setStartandendtime(String startandendtime) {
        this.startandendtime = startandendtime == null ? null : startandendtime.trim();
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
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