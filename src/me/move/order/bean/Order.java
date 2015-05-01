package me.move.order.bean;

import java.util.Date;

/**
 * ������
 * @author Thinkpad
 *
 */
public class Order {

	/**
	 * ����ID
	 */
	private int id;
	
	/**
	 * �ͻ�ID
	 */
	private int userid;
	
	/**
	 * ����˾��ID (ID=1)
	 */
	private int wordid;
	
	/**
	 * ����ԤԼʱ��(Ŀǰ֧��3��ʱ��)
	 */
	private Date date;
	
	/**
	 * ����ַ
	 */
	private String fromadd;
	
	/**
	 * �ص���¥����
	 */
	private String fromstairs;
	
	/**
	 * �յ�ص�
	 */
	private String toadd;
	
	/**
	 * �յ���¥����
	 */
	private String tostairs;
	
	/**
	 * ���ͣ� 0:����; 1:��˾
	 */
	private String type;
	
	/**
	 * ��Ҫֽ�����
	 */
	private int carton;
	
	/**
	 * �Ż�ȯ��
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
