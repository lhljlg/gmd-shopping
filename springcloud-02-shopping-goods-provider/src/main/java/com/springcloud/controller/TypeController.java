package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.TypeOne;
import com.springcloud.entity.TypeTwo;
import com.springcloud.service.TypeService;
import com.springcloud.vo.ResultValue;

/**
 * 一级类别与二级类别的控制器
 * @author Lenovo
 *
 */

@RestController
@RequestMapping("type")
public class TypeController {
	
	@Autowired
	private TypeService typeService;
	
	@RequestMapping(value="/selectAll")
	public ResultValue selectAll() {
		ResultValue rv = new ResultValue();
		
		try {
			List<TypeOne> list = this.typeService.selectAllTypeOne();
			if(list != null && list.size() > 0) {
				rv.setCode(0);
				Map<String,Object> map = new HashMap<>();
				map.put("typeOneList", list);
				rv.setDataMap(map);
				
				return rv;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("一级类别没查到，请重新查一遍！！！");
		
		return rv;
	}
	
	@RequestMapping(value="/selectById")
	public ResultValue selectById(@RequestParam("typeOneId") Integer typeOneId) {
		ResultValue rv = new ResultValue();
		
		try {
			List<TypeTwo> list = this.typeService.selectTypeTwoByTypeOneId(typeOneId);
			if(list != null && list.size() > 0) {
				rv.setCode(0);
				Map<String,Object> map = new HashMap<>();
				map.put("typeTwoList", list);
				rv.setDataMap(map);
				return rv;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("没查到一级类别对应的二级类别，请重新查一遍");
		
		return rv;
	}
}
