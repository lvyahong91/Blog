package com.xqc.dao;

import java.util.List;

import java.util.Map;

import com.xqc.entity.Blog;


/**
 * 博客Dao接口
 * 
 * @author A Cang（xqc）
 *
 */
public interface BlogDao {

	/**
	 * 根据日期月份分组查询
	 * @return
	 */
	List<Blog> countList();
	
	/**
	 * 分页查询博客
	 * @return
	 */
	List<Blog> list(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	Long getTotal(Map<String,Object> map);
	
	/**
	 * 通过Id查找实体
	 * @param id
	 * @return
	 */
	Blog findById(Integer id);
	
	/**
	 * 更新博客信息
	 * @param blog
	 * @return
	 */
	Integer update(Blog blog); 
	
	/**
	 * 获取上一个博客
	 * @param id
	 * @return
	 */
	Blog getLastBlog(Integer id);
	
	/**
	 * 获取下一个博客
	 * @param id
	 * @return
	 */
	Blog getNextBlog(Integer id);
	
	/**
	 * 添加博客信息
	 * @param blog
	 * @return
	 */
	Integer add(Blog blog);
	
	/**
	 * 删除博客信息
	 * @param id
	 * @return
	 */
	 Integer delete(Integer id);
	
	/**
	 * 查询指定的博客类别下的博客数量
	 * @param typeId
	 * @return
	 */
	 Integer getBlogByTypeId(Integer typeId);
	
	
}
