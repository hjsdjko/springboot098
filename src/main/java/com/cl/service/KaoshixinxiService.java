package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.KaoshixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KaoshixinxiView;


/**
 * 考试信息
 *
 * @author 
 * @email 
 * @date 2024-03-23 18:51:54
 */
public interface KaoshixinxiService extends IService<KaoshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshixinxiView> selectListView(Wrapper<KaoshixinxiEntity> wrapper);
   	
   	KaoshixinxiView selectView(@Param("ew") Wrapper<KaoshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshixinxiEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<KaoshixinxiEntity> wrapper);

}

