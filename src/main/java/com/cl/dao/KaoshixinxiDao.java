package com.cl.dao;

import com.cl.entity.KaoshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KaoshixinxiView;


/**
 * 考试信息
 * 
 * @author 
 * @email 
 * @date 2024-03-23 18:51:54
 */
public interface KaoshixinxiDao extends BaseMapper<KaoshixinxiEntity> {
	
	List<KaoshixinxiView> selectListView(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);

	List<KaoshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);
	
	KaoshixinxiView selectView(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);
	
	List<KaoshixinxiView> selectGroupBy(Pagination page,@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);

}
