package com.cl.dao;

import com.cl.entity.ChengjixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChengjixinxiView;


/**
 * 成绩信息
 * 
 * @author 
 * @email 
 * @date 2024-03-23 18:51:54
 */
public interface ChengjixinxiDao extends BaseMapper<ChengjixinxiEntity> {
	
	List<ChengjixinxiView> selectListView(@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);

	List<ChengjixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);
	
	ChengjixinxiView selectView(@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);
	
	List<ChengjixinxiView> selectGroupBy(Pagination page,@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> shijuanmingchengkaoshichengjiSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);


}
