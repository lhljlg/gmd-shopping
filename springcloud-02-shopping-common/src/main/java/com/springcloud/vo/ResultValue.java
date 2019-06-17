package com.springcloud.vo;

import java.util.Map;

import lombok.Data;

/**
 * 定义本项目中所有Controller返回的结果类型,返回的是该类的对象。
 * */
@Data
public class ResultValue implements java.io.Serializable{

	private static final long serialVersionUID = -7333058567132357663L;
	
	/**
	 * 设置当前返回结果的状态:0表示成功，1表示失败
	 * */
	private Integer code;
	
	/**
	 * 设置返回的信息:是增删改查的哪一种失败或者成功
	 * */
	private String message;
	
	/**
	 * 设置返回的数据:包括了分页的信息
	 * */
	private Map<String,Object> dataMap;
}
