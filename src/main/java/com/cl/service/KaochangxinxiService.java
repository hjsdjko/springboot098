package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.KaochangxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KaochangxinxiView;


/**
 * 考场信息
 *
 * @author 
 * @email 
 * @date 2024-03-23 18:51:54
 */
public interface KaochangxinxiService extends IService<KaochangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaochangxinxiView> selectListView(Wrapper<KaochangxinxiEntity> wrapper);
   	
   	KaochangxinxiView selectView(@Param("ew") Wrapper<KaochangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaochangxinxiEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<KaochangxinxiEntity> wrapper);

}

