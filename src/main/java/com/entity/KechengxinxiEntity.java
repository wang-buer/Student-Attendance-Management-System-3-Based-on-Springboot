package com.entity;

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
 * 课程信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-28 16:41:16
 */
@TableName("kechengxinxi")
public class KechengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KechengxinxiEntity() {
		
	}
	
	public KechengxinxiEntity(T t) {
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
	 * 班级名称
	 */
					
	private String banjimingcheng;
	
	/**
	 * 课程号
	 */
					
	private String kechenghao;
	
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 课程类别
	 */
					
	private String kechengleibie;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 周次
	 */
					
	private String zhouci;
	
	/**
	 * 上课日
	 */
					
	private String shangkeri;
	
	/**
	 * 节次
	 */
					
	private String jieci;
	
	
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
	 * 设置：班级名称
	 */
	public void setBanjimingcheng(String banjimingcheng) {
		this.banjimingcheng = banjimingcheng;
	}
	/**
	 * 获取：班级名称
	 */
	public String getBanjimingcheng() {
		return banjimingcheng;
	}
	/**
	 * 设置：课程号
	 */
	public void setKechenghao(String kechenghao) {
		this.kechenghao = kechenghao;
	}
	/**
	 * 获取：课程号
	 */
	public String getKechenghao() {
		return kechenghao;
	}
	/**
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
	/**
	 * 设置：课程类别
	 */
	public void setKechengleibie(String kechengleibie) {
		this.kechengleibie = kechengleibie;
	}
	/**
	 * 获取：课程类别
	 */
	public String getKechengleibie() {
		return kechengleibie;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：周次
	 */
	public void setZhouci(String zhouci) {
		this.zhouci = zhouci;
	}
	/**
	 * 获取：周次
	 */
	public String getZhouci() {
		return zhouci;
	}
	/**
	 * 设置：上课日
	 */
	public void setShangkeri(String shangkeri) {
		this.shangkeri = shangkeri;
	}
	/**
	 * 获取：上课日
	 */
	public String getShangkeri() {
		return shangkeri;
	}
	/**
	 * 设置：节次
	 */
	public void setJieci(String jieci) {
		this.jieci = jieci;
	}
	/**
	 * 获取：节次
	 */
	public String getJieci() {
		return jieci;
	}

}
