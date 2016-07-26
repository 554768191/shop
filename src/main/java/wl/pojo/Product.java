package wl.pojo;

import java.util.Date;

public class Product {
    private Integer id;

    private String style;

    private String name;

    private String gg;

    private String djsPrice;

    private String ybsPrice;

    private String txPrice;

    private Date createtime;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg == null ? null : gg.trim();
    }

    public String getDjsPrice() {
        return djsPrice;
    }

    public void setDjsPrice(String djsPrice) {
        this.djsPrice = djsPrice == null ? null : djsPrice.trim();
    }

    public String getYbsPrice() {
        return ybsPrice;
    }

    public void setYbsPrice(String ybsPrice) {
        this.ybsPrice = ybsPrice == null ? null : ybsPrice.trim();
    }

    public String getTxPrice() {
        return txPrice;
    }

    public void setTxPrice(String txPrice) {
        this.txPrice = txPrice == null ? null : txPrice.trim();
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