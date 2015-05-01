package me.move.user.dao;

import me.move.user.bean.User;

public interface UserDao {

	/**
	 * 保存新客户
	 * @param u
	 */
	public void saveUser(User u);
	
}
