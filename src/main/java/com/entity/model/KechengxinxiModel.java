package com.entity.model;

import com.entity.KechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课程信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-28 16:41:16
 */
public class KechengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
