package com.springcloud.entity;

import java.util.Date;

import javax.persistence.Column;

/**
 * USERS表对应的实体类:用于封装表中用户的一行信息
 * */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users implements java.io.Serializable{

	private static final long serialVersionUID = 2504015899170623862L;
	
	/**
	 * 用户编号
	 * */
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	/**
	 * 用户姓名
	 * */
	@Column(name = "user_name")
	private String userName;
	
	/**
	 * 用户密码
	 * */
	@Column(name = "user_psw")
	private String userPsw;
	
	/**
	 * 用户性别:0男,1女
	 * */
	@Column(name = "user_sex")
	private Integer userSex;
	
	/**
	 * 身份证号
	 * */
	@Column(name = "user_idnum")
	private String userIdnum;
	
	/**
	 * 联系电话
	 * */
	@Column(name = "user_tel")
	private String userTel;
	/**
	 * 出生日期
	 * */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "user_birthday")
	private Date userBirthday;
	
	/**
	 * 用户邮箱
	 * */
	@Column(name = "user_email")
	private String userEmail;
	
	/**
	 * 用户头像
	 * */
	@Column(name = "user_image")
	private String userImage;
	
	/**
	 * 权限编号
	 * */
	@Column(name = "permission_id")
	private Integer permissionId;
	
	/**
	 * 用户收货地址
	 * */
	@Column(name = "user_addr")
	private String userAddr;
	
	/**
	 * 用户状态:0启用,1禁用
	 * */
	@Column(name = "user_status")
	private Integer userStatus;
	
	
	
}
