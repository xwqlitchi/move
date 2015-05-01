package me.move.user.bean;

/**
 * 客户类
 * @author Thinkpad
 *
 */
public class User {

	/**
	 * 客户ID
	 */
	private int id;
	
	/**
	 * 客户姓名
	 */
	private String name;
	
	/**
	 * 客户电话
	 */
	private String phone;
	
	/**
	 * 客户性别
	 */
	private int gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	
	
}
