package com.xqc.dao;

import java.util.List;
import java.util.Map;

import com.xqc.entity.Comment;

/**
 * ����Dao�ӿ�
 * 
 * @author A Cang��xqc��
 *
 */
public interface CommentDao {

	/**
	 * �������
	 * @param comment
	 * @return
	 */
	int add(Comment comment);
	
	/**
	 * �޸�����
	 * @param comment
	 * @return
	 */
	int update(Comment comment);
	
	/**
	 * �����û�������Ϣ
	 * @param map
	 * @return
	 */
	List<Comment> list(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	Long getTotal(Map<String,Object> map);
	
	/**
	 * ɾ��������Ϣ
	 * @param id
	 * @return
	 */
	Integer delete(Integer id);
	
	
}
