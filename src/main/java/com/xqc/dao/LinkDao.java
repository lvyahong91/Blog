package com.xqc.dao;

import java.util.List;
import java.util.Map;

import com.xqc.entity.Link;

/**
 * 友情链接dao接口
 * @author A Cang（xqc）
 *
 */
public interface LinkDao {

	/**
	 * 添加友情链接
	 * @param link
	 * @return
	 */
	int add(Link link);
	
	/**
	 * 修改友情链接
	 * @param link
	 * @return
	 */
	int update(Link link);
	
	/**
	 * 查找友情链接信息
	 * @param map
	 * @return
	 */
	List<Link> list(Map<String,Object> map);	
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	Long getTotal(Map<String,Object> map);
	
	/**
	 * 删除友情链接
	 * @param id
	 * @return
	 */
	Integer delete(Integer id);
}
