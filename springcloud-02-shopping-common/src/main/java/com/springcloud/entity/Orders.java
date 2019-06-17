package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDERS���Ӧ��ʵ���࣬���ڷ�װһ�ж�����Ϣ
 * @author Lenovo
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements java.io.Serializable{

	private static final long serialVersionUID = 3791151266933825383L;

	/**
	 * �������
	 */
	private Integer orderId;

	/**
	 * ��ǰ������Ӧ���û���Ϣ
	 */
	private Users user;

	/**
	 * �ջ�������,���ʡ��Ĭ��Ϊ�û����е��û�����
	 */
	private String receiverName;

	/**
	 * �ջ��˵绰,���ʡ��Ĭ��Ϊ�û����е���ϵ�绰
	 */
	private String recevierTel;

	/**
	 * �ջ��˵�ַ,���ʡ��Ĭ��Ϊ�û����е��ջ���ַ
	 */
	private String receiverAddr;

	/**
	 * 下单时间,默认为当前时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderTime;

	/**
	 * 订单总额
	 */
	private Double orderTotal;

	/**
	 * ����״̬:0������,1������,2���ջ�,3�Ѹ���,4���˻�
	 */
	private Integer orderStatus;
	
	/**
	 * 订单起始时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMin;
	
	/**
	 * 订单终止时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDateMax;
	
	/**
	 * 查询条件：起始年月
	 */
	private String startMonth;
	
	/**
	 * 查询条件:终止年月
	 */
	private String endMonth;
	
	/**
	 * 统计结果的年月
	 */
	private Double orderPrice;
	
	/**
	 * 统计结果的销售额
	 */
	private String orderMonth; 
	
}