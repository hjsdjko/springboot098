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


import com.cl.dao.KaochangxinxiDao;
import com.cl.entity.KaochangxinxiEntity;
import com.cl.service.KaochangxinxiService;
import com.cl.entity.view.KaochangxinxiView;

@Service("kaochangxinxiService")
public class KaochangxinxiServiceImpl extends ServiceImpl<KaochangxinxiDao, KaochangxinxiEntity> implements KaochangxinxiService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<KaochangxinxiEntity> wrapper) {
		Page<KaochangxinxiView> page =new Query<KaochangxinxiView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaochangxinxiEntity> page = this.selectPage(
                new Query<KaochangxinxiEntity>(params).getPage(),
                new EntityWrapper<KaochangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaochangxinxiEntity> wrapper) {
		  Page<KaochangxinxiView> page =new Query<KaochangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<KaochangxinxiView> selectListView(Wrapper<KaochangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaochangxinxiView selectView(Wrapper<KaochangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
