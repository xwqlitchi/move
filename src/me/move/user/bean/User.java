package me.move.user.bean;

/**
 * �ͻ���
 * @author Thinkpad
 *
 */
public class User {

	/**
	 * �ͻ�ID
	 */
	private int id;
	
	/**
	 * �ͻ�����
	 */
	private String name;
	
	/**
	 * �ͻ��绰
	 */
	private String phone;
	
	/**
	 * �ͻ��Ա�
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
