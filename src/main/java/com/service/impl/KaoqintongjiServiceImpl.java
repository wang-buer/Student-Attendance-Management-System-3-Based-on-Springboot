package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KaoqintongjiDao;
import com.entity.KaoqintongjiEntity;
import com.service.KaoqintongjiService;
import com.entity.vo.KaoqintongjiVO;
import com.entity.view.KaoqintongjiView;

@Service("kaoqintongjiService")
public class KaoqintongjiServiceImpl extends ServiceImpl<KaoqintongjiDao, KaoqintongjiEntity> implements KaoqintongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoqintongjiEntity> page = this.selectPage(
                new Query<KaoqintongjiEntity>(params).getPage(),
                new EntityWrapper<KaoqintongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoqintongjiEntity> wrapper) {
		  Page<KaoqintongjiView> page =new Query<KaoqintongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoqintongjiVO> selectListVO(Wrapper<KaoqintongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoqintongjiVO selectVO(Wrapper<KaoqintongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoqintongjiView> selectListView(Wrapper<KaoqintongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoqintongjiView selectView(Wrapper<KaoqintongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KaoqintongjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KaoqintongjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KaoqintongjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
