package wl.pojo;

import java.util.Date;

public class SCustomerChildren {
    private Integer id;

    private String name;

    private Date birthday;

    private Integer sCustomerId;

    private String sCustomerName;

    private String isSc;

    private String weeks;

    private String isFullterm;

    private String isYuntu;

    private String isRenshen;

    private Date createtime;

    private String isDelete;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getsCustomerId() {
        return sCustomerId;
    }

    public void setsCustomerId(Integer sCustomerId) {
        this.sCustomerId = sCustomerId;
    }

    public String getsCustomerName() {
        return sCustomerName;
    }

    public void setsCustomerName(String sCustomerName) {
        this.sCustomerName = sCustomerName == null ? null : sCustomerName.trim();
    }

    public String getIsSc() {
        return isSc;
    }

    public void setIsSc(String isSc) {
        this.isSc = isSc == null ? null : isSc.trim();
    }

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks == null ? null : weeks.trim();
    }

    public String getIsFullterm() {
        return isFullterm;
    }

    public void setIsFullterm(String isFullterm) {
        this.isFullterm = isFullterm == null ? null : isFullterm.trim();
    }

    public String getIsYuntu() {
        return isYuntu;
    }

    public void setIsYuntu(String isYuntu) {
        this.isYuntu = isYuntu == null ? null : isYuntu.trim();
    }

    public String getIsRenshen() {
        return isRenshen;
    }

    public void setIsRenshen(String isRenshen) {
        this.isRenshen = isRenshen == null ? null : isRenshen.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }
}