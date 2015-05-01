package me.move.order.bean;

import java.util.Date;

/**
 * 订单类
 * @author Thinkpad
 *
 */
public class Order {

	/**
	 * 订单ID
	 */
	private int id;
	
	/**
	 * 客户ID
	 */
	private int userid;
	
	/**
	 * 工人司机ID (ID=1)
	 */
	private int wordid;
	
	/**
	 * 订单预约时间(目前支持3个时间)
	 */
	private Date date;
	
	/**
	 * 起点地址
	 */
	private String fromadd;
	
	/**
	 * 地点爬楼层数
	 */
	private String fromstairs;
	
	/**
	 * 终点地点
	 */
	private String toadd;
	
	/**
	 * 终点爬楼层数
	 */
	private String tostairs;
	
	/**
	 * 类型： 0:个人; 1:公司
	 */
	private String type;
	
	/**
	 * 需要纸箱个数
	 */
	private int carton;
	
	/**
	 * 优惠券号
	 */
	private String coupon;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getWordid() {
		return wordid;
	}

	public void setWordid(int wordid) {
		this.wordid = wordid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFromadd() {
		return fromadd;
	}

	public void setFromadd(String fromadd) {
		this.fromadd = fromadd;
	}

	public String getFromstairs() {
		return fromstairs;
	}

	public void setFromstairs(String fromstairs) {
		this.fromstairs = fromstairs;
	}

	public String getToadd() {
		return toadd;
	}

	public void setToadd(String toadd) {
		this.toadd = toadd;
	}

	public String getTostairs() {
		return tostairs;
	}

	public void setTostairs(String tostairs) {
		this.tostairs = tostairs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCarton() {
		return carton;
	}

	public void setCarton(int carton) {
		this.carton = carton;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	
	
}
