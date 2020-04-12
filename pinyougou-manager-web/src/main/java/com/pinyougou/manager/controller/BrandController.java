package com.pinyougou.manager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Reference
	private BrandService brandService;
	
	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		return brandService.findAll();		
	}
	
	/**
	 * 返回全部列表
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("findPage")
	public PageResult findPage(int page,int rows){
		return brandService.findPage(page, rows);
	}
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbBrand tbBrand){
		try {
			brandService.add(tbBrand);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改品牌
	 * @param tbBrand
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbBrand tbBrand){
		try {
			brandService.update(tbBrand);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}
	
	/**
	 * 根据id获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbBrand findOne(Long id){
		return brandService.findOne(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long ids[]){
		try {
			brandService.delete(ids);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}	
	}
	
	
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbBrand tbBrand, int page, int rows){
		return brandService.findPage(tbBrand, page, rows);
				
	}
	 
}
