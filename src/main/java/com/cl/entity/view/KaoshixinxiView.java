package com.cl.entity.view;

import com.cl.entity.KaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 考试信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-23 18:51:54
 */
@TableName("kaoshixinxi")
public class KaoshixinxiView  extends KaoshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoshixinxiView(){
	}
 
 	public KaoshixinxiView(KaoshixinxiEntity kaoshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, kaoshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}