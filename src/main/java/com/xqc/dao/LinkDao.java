package com.xqc.dao;

import java.util.List;
import java.util.Map;

import com.xqc.entity.Link;

/**
 * ��������dao�ӿ�
 * @author A Cang��xqc��
 *
 */
public interface LinkDao {

	/**
	 * �����������
	 * @param link
	 * @return
	 */
	int add(Link link);
	
	/**
	 * �޸���������
	 * @param link
	 * @return
	 */
	int update(Link link);
	
	/**
	 * ��������������Ϣ
	 * @param map
	 * @return
	 */
	List<Link> list(Map<String,Object> map);	
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	Long getTotal(Map<String,Object> map);
	
	/**
	 * ɾ����������
	 * @param id
	 * @return
	 */
	Integer delete(Integer id);
}
