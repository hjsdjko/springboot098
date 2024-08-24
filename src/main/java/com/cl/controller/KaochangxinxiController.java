package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.KaochangxinxiEntity;
import com.cl.entity.view.KaochangxinxiView;

import com.cl.service.KaochangxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 考场信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-23 18:51:54
 */
@RestController
@RequestMapping("/kaochangxinxi")
public class KaochangxinxiController {
    @Autowired
    private KaochangxinxiService kaochangxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaochangxinxiEntity kaochangxinxi,
		HttpServletRequest request){
        EntityWrapper<KaochangxinxiEntity> ew = new EntityWrapper<KaochangxinxiEntity>();

		PageUtils page = kaochangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaochangxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaochangxinxiEntity kaochangxinxi, 
		HttpServletRequest request){
        EntityWrapper<KaochangxinxiEntity> ew = new EntityWrapper<KaochangxinxiEntity>();

		PageUtils page = kaochangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaochangxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaochangxinxiEntity kaochangxinxi){
       	EntityWrapper<KaochangxinxiEntity> ew = new EntityWrapper<KaochangxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaochangxinxi, "kaochangxinxi")); 
        return R.ok().put("data", kaochangxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaochangxinxiEntity kaochangxinxi){
        EntityWrapper< KaochangxinxiEntity> ew = new EntityWrapper< KaochangxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaochangxinxi, "kaochangxinxi")); 
		KaochangxinxiView kaochangxinxiView =  kaochangxinxiService.selectView(ew);
		return R.ok("查询考场信息成功").put("data", kaochangxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaochangxinxiEntity kaochangxinxi = kaochangxinxiService.selectById(id);
		kaochangxinxi = kaochangxinxiService.selectView(new EntityWrapper<KaochangxinxiEntity>().eq("id", id));
        return R.ok().put("data", kaochangxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaochangxinxiEntity kaochangxinxi = kaochangxinxiService.selectById(id);
		kaochangxinxi = kaochangxinxiService.selectView(new EntityWrapper<KaochangxinxiEntity>().eq("id", id));
        return R.ok().put("data", kaochangxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaochangxinxiEntity kaochangxinxi, HttpServletRequest request){
    	kaochangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaochangxinxi);
        kaochangxinxiService.insert(kaochangxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaochangxinxiEntity kaochangxinxi, HttpServletRequest request){
    	kaochangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaochangxinxi);
        kaochangxinxiService.insert(kaochangxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KaochangxinxiEntity kaochangxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaochangxinxi);
        kaochangxinxiService.updateById(kaochangxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaochangxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
