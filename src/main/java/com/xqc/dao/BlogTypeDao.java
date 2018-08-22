package com.xqc.dao;

import java.util.List;
import java.util.Map;

import com.xqc.entity.BlogType;

/**
 * ��������Dao�ӿ�
 * 
 * @author A Cang��xqc��
 *
 */
public interface BlogTypeDao {

	/**
	 * ��ѯ���в������� �Լ���Ӧ�Ĳ�������
	 * @return
	 */
	List<BlogType> countList();
	
	/**
	 * ͨ��id��ѯ��������
	 * @param id
	 * @return
	 */
	BlogType findById(Integer id);
	
	/**
	 * ��ҳ��ѯ���������Ϣ
	 * @param map
	 * @return
	 */
	List<BlogType> list(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	Long getTotal(Map<String,Object> map);
	
	/**
	 * ��Ӳ��������Ϣ
	 * @param blogType
	 * @return
	 */
	Integer add(BlogType blogType);
	
	/**
	 * �޸Ĳ��������Ϣ
	 * @param blogType
	 * @return
	 */
	Integer update(BlogType blogType);
	
	/**
	 * ɾ�����������Ϣ
	 * @param id
	 * @return
	 */
	Integer delete(Integer id);
}
