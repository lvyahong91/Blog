package com.xqc.service.impl;

import org.springframework.stereotype.Service;

import com.xqc.dao.BloggerDao;
import com.xqc.entity.Blogger;
import com.xqc.service.BloggerService;

/**
 * 博主Service实现类
 * 
 * @author A Cang（xqc）
 *
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {

	private BloggerDao bloggerDao;
	
	public Blogger find() {
		return bloggerDao.find();
	}

	public Blogger getByUserName(String userName) {
		return bloggerDao.getByUserName(userName);
	}

	public Integer update(Blogger blogger) {
		return bloggerDao.update(blogger);
	}

}
