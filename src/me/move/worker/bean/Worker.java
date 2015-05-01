package me.move.worker.bean;

/**
 * 工人类
 * @author Thinkpad
 *
 */
public class Worker {

	/**
	 * 工人ID
	 */
	private int id;
	
	/**
	 * 工人姓名
	 */
	private String name;
	
	/**
	 * 工人性别
	 */
	private String gender;
	
	/**
	 * 工人生日
	 */
	private String birthday;
	
	/**
	 * 工人身份证号
	 */
	private String identification;
	
	/**
	 * 工人级别：	0：搬运; 1：司机; 2：队长
	 */
	private String level;
	
	/**
	 * 工人所在车辆车牌号
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
