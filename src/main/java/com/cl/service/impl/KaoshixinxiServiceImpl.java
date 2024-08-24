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


import com.cl.dao.KaoshixinxiDao;
import com.cl.entity.KaoshixinxiEntity;
import com.cl.service.KaoshixinxiService;
import com.cl.entity.view.KaoshixinxiView;

@Service("kaoshixinxiService")
public class KaoshixinxiServiceImpl extends ServiceImpl<KaoshixinxiDao, KaoshixinxiEntity> implements KaoshixinxiService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<KaoshixinxiEntity> wrapper) {
		Page<KaoshixinxiView> page =new Query<KaoshixinxiView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshixinxiEntity> page = this.selectPage(
                new Query<KaoshixinxiEntity>(params).getPage(),
                new EntityWrapper<KaoshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshixinxiEntity> wrapper) {
		  Page<KaoshixinxiView> page =new Query<KaoshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<KaoshixinxiView> selectListView(Wrapper<KaoshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshixinxiView selectView(Wrapper<KaoshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
