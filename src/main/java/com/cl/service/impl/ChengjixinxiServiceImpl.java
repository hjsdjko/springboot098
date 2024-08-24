package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ChengjixinxiDao;
import com.cl.entity.ChengjixinxiEntity;
import com.cl.service.ChengjixinxiService;
import com.cl.entity.view.ChengjixinxiView;

@Service("chengjixinxiService")
public class ChengjixinxiServiceImpl extends ServiceImpl<ChengjixinxiDao, ChengjixinxiEntity> implements ChengjixinxiService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<ChengjixinxiEntity> wrapper) {
		Page<ChengjixinxiView> page =new Query<ChengjixinxiView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengjixinxiEntity> page = this.selectPage(
                new Query<ChengjixinxiEntity>(params).getPage(),
                new EntityWrapper<ChengjixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengjixinxiEntity> wrapper) {
		  Page<ChengjixinxiView> page =new Query<ChengjixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChengjixinxiView> selectListView(Wrapper<ChengjixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengjixinxiView selectView(Wrapper<ChengjixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ChengjixinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ChengjixinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ChengjixinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> shijuanmingchengkaoshichengjiSectionStat(Map<String, Object> params, Wrapper<ChengjixinxiEntity> wrapper) {
        return baseMapper.shijuanmingchengkaoshichengjiSectionStat(params, wrapper);
    }



}
