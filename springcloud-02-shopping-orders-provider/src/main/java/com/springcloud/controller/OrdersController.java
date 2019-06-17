package com.springcloud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.entity.Orders;
import com.springcloud.service.OrdersService;
import com.springcloud.vo.ResultValue;

/**
 * 锟斤拷锟斤拷模锟斤拷目锟斤拷撇锟�
 * 
 * @author Lenovo
 *
 */
@RestController
@RequestMapping("orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;

	@RequestMapping(value = "/selectOrders")
	public ResultValue selectOrders(Orders orders, @RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();

		try {
			PageInfo<Orders> pageInfo = this.ordersService.selectOrders(orders, pageNumber);
			List<Orders> list = pageInfo.getList();
			if (list != null && list.size() > 0) {
				rv.setCode(0);
				Map<String, Object> map = new HashMap<>();
				map.put("ordersList", list);

				PageUtils pageUtils = new PageUtils(pageInfo.getPages() * PageUtils.PAGE_ROW_COUNT);
				pageUtils.setPageNumber(pageNumber);
				map.put("pageUtils", pageUtils);
				rv.setDataMap(map);
				return rv;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("锟斤拷询失锟杰ｏ拷锟斤拷锟斤拷");

		return rv;

	}

	/**
	 * 淇敼鎸囧畾缂栧彿璁㈠崟鐨勮鍗曠姸鎬�
	 * 
	 * @param orders 淇敼鐨勮鍗曚俊鎭�
	 * @return
	 */
	@RequestMapping(value = "/updateOrdersStatus")
	public ResultValue updateOrdersStatus(Orders orders) {
		ResultValue rv = new ResultValue();

		try {

			Integer status = this.ordersService.updateOrdersStatus(orders);

			if (status > 0) {
				rv.setCode(0);
				rv.setMessage("璁㈠崟鐘舵�佷慨鏀规垚鍔燂紒锛侊紒");
				return rv;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("璁㈠崟鐘舵�佷慨鏀瑰け璐ワ紒锛侊紒");

		return rv;
	}
	
	/**
	 * 查询指定时间范围内的销售额
	 * @param orders 查询条件
	 * @return
	 */
	@RequestMapping(value = "/selectGroup")
	public ResultValue selectGroup(Orders orders) {
		ResultValue rv = new ResultValue();
		
		try {
			List<Orders> list = this.ordersService.selectGroup(orders);
			if(list != null && list.size() > 0) { //size为集合中的元素个数的,size()方法为判断元素的个数
				rv.setCode(0);
				List<String> x = new ArrayList<>();
				List<Double> y = new ArrayList<>();
				for (Orders o : list) {
					x.add(o.getOrderMonth());
					y.add(o.getOrderPrice());
				}
				Map<String,Object> map = new HashMap<>();
				map.put("x",x);
				map.put("y",y);
				rv.setDataMap(map);
				return rv;
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}
}
