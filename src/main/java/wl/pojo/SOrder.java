package wl.pojo;

import java.util.Date;
import java.util.List;

public class SOrder {
    private Integer id;

    private Long code;

    private Integer sUserId;

    private String sUserName;

    private String address;

    private String startendtime;

    private String name;

    private String tel;

    private String money;

    private Date qdTime;

    private String qdAddress;

    private Integer isOver;

    private Date createtime;

    private Integer isDelete;

    private Integer sShopId;
    
    private SUser user;
    
    public SUser getUser() {
		return user;
	}

	public void setUser(SUser user) {
		this.user = user;
	}
	
	private List<SService> serviceList;
	
	public List<SService> getServiceList() {
		return serviceList;
	}

	public void setServiceList(List<SService> serviceList) {
		this.serviceList = serviceList;
	}
	
	private SShop shop;
	
	public SShop getShop() {
		return shop;
	}

	public void setShop(SShop shop) {
		this.shop = shop;
	}

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getStartendtime() {
        return startendtime;
    }

    public void setStartendtime(String startendtime) {
        this.startendtime = startendtime == null ? null : startendtime.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public Date getQdTime() {
        return qdTime;
    }

    public void setQdTime(Date qdTime) {
        this.qdTime = qdTime;
    }

    public String getQdAddress() {
        return qdAddress;
    }

    public void setQdAddress(String qdAddress) {
        this.qdAddress = qdAddress == null ? null : qdAddress.trim();
    }

    public Integer getIsOver() {
        return isOver;
    }

    public void setIsOver(Integer isOver) {
        this.isOver = isOver;
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