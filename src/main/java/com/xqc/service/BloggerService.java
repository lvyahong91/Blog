package com.xqc.service;

import com.xqc.entity.Blogger;

/**
 * 博主服务层接口
 * 
 * 代码格式:接口类中的方法和属性尽量不要加任何修饰符号
 * 
 * @author A Cang（xqc）
 *
 */
public interface BloggerService {
	
	/**
	 * 查询博主信息
	 * @return
	 */
	Blogger find();
	
	/**
	 * 通过用户名查询用户
	 * @param userName
	 * @return
	 */
	Blogger getByUserName(String userName);
	
	/**
	 * 更新博主信息
	 * @param blogger
	 * @return
	 */
	Integer update(Blogger blogger);

}
