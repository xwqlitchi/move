package me.move.worker.bean;

/**
 * ������
 * @author Thinkpad
 *
 */
public class Worker {

	/**
	 * ����ID
	 */
	private int id;
	
	/**
	 * ��������
	 */
	private String name;
	
	/**
	 * �����Ա�
	 */
	private String gender;
	
	/**
	 * ��������
	 */
	private String birthday;
	
	/**
	 * �������֤��
	 */
	private String identification;
	
	/**
	 * ���˼���	0������; 1��˾��; 2���ӳ�
	 */
	private String level;
	
	/**
	 * �������ڳ������ƺ�
	 */
	private String carnumber;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	
}
