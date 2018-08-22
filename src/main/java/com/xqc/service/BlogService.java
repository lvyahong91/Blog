package com.xqc.service;

import java.util.List;
import java.util.Map;

import com.xqc.entity.Blog;

/**
 * ����Service�ӿ�
 * 
 * @author A Cang��xqc��
 *
 */
public interface BlogService {
	
	/**
	 * ���������·ݷ����ѯ
	 * @return
	 */
	List<Blog> countList(); 
	
	/**
	 * ��ҳ��ѯ����
	 * @return
	 */
	List<Blog> list(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	Long getTotal(Map<String,Object> map);
	
	/**
	 * ͨ��Id����ʵ��
	 * @param id
	 * @return
	 */
	Blog findById(Integer id);
	
	/**
	 * ���²�����Ϣ
	 * @param blog
	 * @return
	 */
	Integer update(Blog blog); 
	
	/**
	 * ��ȡ��һ������
	 * @param id
	 * @return
	 */
	Blog getLastBlog(Integer id);
	
	/**
	 * ��ȡ��һ������
	 * @param id
	 * @return
	 */
	Blog getNextBlog(Integer id);
	
	/**
	 * ��Ӳ�����Ϣ
	 * @param blog
	 * @return
	 */
	Integer add(Blog blog);
	
	/**
	 * ɾ��������Ϣ
	 * @param id
	 * @return
	 */
	Integer delete(Integer id);
	
	/**
	 * ��ѯָ���Ĳ�������µĲ�������
	 * @param typeId
	 * @return
	 */
	Integer getBlogByTypeId(Integer typeId);

}
