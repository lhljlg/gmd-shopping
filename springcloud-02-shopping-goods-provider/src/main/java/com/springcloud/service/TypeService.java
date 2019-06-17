package com.springcloud.service;

import java.util.List;


import com.springcloud.entity.TypeOne;
import com.springcloud.entity.TypeTwo;

/**
 * ���ڶ���һ�������������ģ��ķ���
 * @author Lenovo
 *
 */
public interface TypeService {
	
	/**
	 * ��ѯ����һ��������Ϣ
	 * @return
	 */
	public abstract List<TypeOne> selectAllTypeOne();
	
	/**
	 * ����һ������Ų�ѯ��Ӧ�Ķ������
	 * @param TypeOneId һ�������
	 * @return �ɹ�����List��ʵ�������򷵻�null
	 */
	public abstract List<TypeTwo> selectTypeTwoByTypeOneId(Integer typeOneId);
	
}
