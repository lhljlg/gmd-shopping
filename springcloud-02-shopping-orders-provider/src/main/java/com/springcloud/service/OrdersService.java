package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;

/**
 * 锟斤拷锟斤拷模锟斤拷模锟酵诧拷慕涌冢锟斤拷锟斤拷诙锟斤拷宥╋拷锟侥ｏ拷锟侥凤拷锟斤拷
 * 
 * @author Lenovo
 *
 */
public interface OrdersService {

	/**
	 * 锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷锟侥讹拷锟斤拷锟斤拷息(锟斤拷页锟斤拷锟斤拷)
	 * 
	 * @param orders 锟斤拷询锟斤拷锟斤拷
	 * @return com.github.pagehelper.PageInfo<Orders>锟斤拷锟酵碉拷实锟斤拷
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders, Integer pageNumber);

	/**
	 * 淇敼鎸囧畾缂栧彿璁㈠崟鐨勭姸鎬�
	 * 
	 * @param orders
	 * @return 鎴愬姛杩斿洖澶т簬0鐨勬暣鏁帮紝鍚﹀垯杩斿洖灏忎簬绛変簬0鐨勬暣鏁�
	 */
	public abstract Integer updateOrdersStatus(Orders orders);

	/**
	 * 查询指定日期范围内的销售额
	 * 
	 * @param orders 查询条件
	 * @return 成功返回List实例，否则返回null
	 */
	public abstract List<Orders> selectGroup(Orders orders);
}
