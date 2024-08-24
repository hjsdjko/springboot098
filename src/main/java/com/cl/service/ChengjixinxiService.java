package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChengjixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChengjixinxiView;


/**
 * 成绩信息
 *
 * @author 
 * @email 
 * @date 2024-03-23 18:51:54
 */
public interface ChengjixinxiService extends IService<ChengjixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengjixinxiView> selectListView(Wrapper<ChengjixinxiEntity> wrapper);
   	
   	ChengjixinxiView selectView(@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengjixinxiEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> shijuanmingchengkaoshichengjiSectionStat(Map<String, Object> params,Wrapper<ChengjixinxiEntity> wrapper);


}

