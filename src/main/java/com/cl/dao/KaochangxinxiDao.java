package com.cl.dao;

import com.cl.entity.KaochangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KaochangxinxiView;


/**
 * 考场信息
 * 
 * @author 
 * @email 
 * @date 2024-03-23 18:51:54
 */
public interface KaochangxinxiDao extends BaseMapper<KaochangxinxiEntity> {
	
	List<KaochangxinxiView> selectListView(@Param("ew") Wrapper<KaochangxinxiEntity> wrapper);

	List<KaochangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KaochangxinxiEntity> wrapper);
	
	KaochangxinxiView selectView(@Param("ew") Wrapper<KaochangxinxiEntity> wrapper);
	
	List<KaochangxinxiView> selectGroupBy(Pagination page,@Param("ew") Wrapper<KaochangxinxiEntity> wrapper);

}
