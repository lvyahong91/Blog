package com.xqc.dao;

import com.xqc.entity.Blogger;

/**
 * ����Dao�ӿ�
 * 
 * �����ʽ:�ӿ����еķ��������Ծ�����Ҫ���κ����η���
 * 
 * @author A Cang��xqc��
 *
 */
public interface BloggerDao {
	
	/**
	 * ��ѯ������Ϣ
	 * @return
	 */
	Blogger find();
	
	/**
	 * ͨ���û�����ѯ�û�
	 * @param userName
	 * @return
	 */
	Blogger getByUserName(String userName);
	
	/**
	 * ���²�����Ϣ
	 * @param blogger
	 * @return
	 */
	Integer update(Blogger blogger);
	
}
