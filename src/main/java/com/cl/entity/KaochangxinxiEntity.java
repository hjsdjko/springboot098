package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 考场信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-23 18:51:54
 */
@TableName("kaochangxinxi")
public class KaochangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaochangxinxiEntity() {
		
	}
	
	public KaochangxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 考场号
	 */
					
	private String kaochanghao;
	
	/**
	 * 考场人数
	 */
					
	private String kaochangrenshu;
	
	/**
	 * 场次
	 */
					
	private String changci;
	
	/**
	 * 监考老师
	 */
					
	private String jiankaolaoshi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：考场号
	 */
	public void setKaochanghao(String kaochanghao) {
		this.kaochanghao = kaochanghao;
	}
	/**
	 * 获取：考场号
	 */
	public String getKaochanghao() {
		return kaochanghao;
	}
	/**
	 * 设置：考场人数
	 */
	public void setKaochangrenshu(String kaochangrenshu) {
		this.kaochangrenshu = kaochangrenshu;
	}
	/**
	 * 获取：考场人数
	 */
	public String getKaochangrenshu() {
		return kaochangrenshu;
	}
	/**
	 * 设置：场次
	 */
	public void setChangci(String changci) {
		this.changci = changci;
	}
	/**
	 * 获取：场次
	 */
	public String getChangci() {
		return changci;
	}
	/**
	 * 设置：监考老师
	 */
	public void setJiankaolaoshi(String jiankaolaoshi) {
		this.jiankaolaoshi = jiankaolaoshi;
	}
	/**
	 * 获取：监考老师
	 */
	public String getJiankaolaoshi() {
		return jiankaolaoshi;
	}

}
