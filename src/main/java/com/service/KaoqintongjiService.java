package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoqintongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoqintongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoqintongjiView;


/**
 * 考勤统计
 *
 * @author 
 * @email 
 * @date 2022-03-28 16:41:16
 */
public interface KaoqintongjiService extends IService<KaoqintongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoqintongjiVO> selectListVO(Wrapper<KaoqintongjiEntity> wrapper);
   	
   	KaoqintongjiVO selectVO(@Param("ew") Wrapper<KaoqintongjiEntity> wrapper);
   	
   	List<KaoqintongjiView> selectListView(Wrapper<KaoqintongjiEntity> wrapper);
   	
   	KaoqintongjiView selectView(@Param("ew") Wrapper<KaoqintongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoqintongjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KaoqintongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KaoqintongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KaoqintongjiEntity> wrapper);
}

