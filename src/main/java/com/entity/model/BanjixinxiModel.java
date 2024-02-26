package com.entity.model;

import com.entity.BanjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 班级信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-28 16:41:16
 */
public class BanjixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班级名称
	 */
	
	private String banjimingcheng;
		
	/**
	 * 班级图片
	 */
	
	private String banjitupian;
		
	/**
	 * 所属院系
	 */
	
	private String suoshuyuanxi;
		
	/**
	 * 所属专业
	 */
	
	private String suoshuzhuanye;
		
	/**
	 * 班主任
	 */
	
	private String banzhuren;
		
	/**
	 * 班级人数
	 */
	
	private Integer banjirenshu;
				
	
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
	 * 设置：班级图片
	 */
	 
	public void setBanjitupian(String banjitupian) {
		this.banjitupian = banjitupian;
	}
	
	/**
	 * 获取：班级图片
	 */
	public String getBanjitupian() {
		return banjitupian;
	}
				
	
	/**
	 * 设置：所属院系
	 */
	 
	public void setSuoshuyuanxi(String suoshuyuanxi) {
		this.suoshuyuanxi = suoshuyuanxi;
	}
	
	/**
	 * 获取：所属院系
	 */
	public String getSuoshuyuanxi() {
		return suoshuyuanxi;
	}
				
	
	/**
	 * 设置：所属专业
	 */
	 
	public void setSuoshuzhuanye(String suoshuzhuanye) {
		this.suoshuzhuanye = suoshuzhuanye;
	}
	
	/**
	 * 获取：所属专业
	 */
	public String getSuoshuzhuanye() {
		return suoshuzhuanye;
	}
				
	
	/**
	 * 设置：班主任
	 */
	 
	public void setBanzhuren(String banzhuren) {
		this.banzhuren = banzhuren;
	}
	
	/**
	 * 获取：班主任
	 */
	public String getBanzhuren() {
		return banzhuren;
	}
				
	
	/**
	 * 设置：班级人数
	 */
	 
	public void setBanjirenshu(Integer banjirenshu) {
		this.banjirenshu = banjirenshu;
	}
	
	/**
	 * 获取：班级人数
	 */
	public Integer getBanjirenshu() {
		return banjirenshu;
	}
			
}
