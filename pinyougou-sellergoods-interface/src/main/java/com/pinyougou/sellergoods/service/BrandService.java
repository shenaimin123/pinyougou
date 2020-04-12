package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	/**
	 * 查询品牌
	 * @return
	 */
	public List<TbBrand> findAll();
	
	/**
	 * 返回分页列表
	 * @param pageNum 当前页码
	 * @param pageSize 当前记录数
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	/**
	 * 品牌增加
	 * @param tbBrand
	 */
	public void add(TbBrand tbBrand);
	
	/**
	 * 查询单个实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	
	/**
	 * 品牌修改
	 * @param tbBrand
	 */
	public void update(TbBrand tbBrand);
	
	/**
	 * 品牌删除
	 * @param ids
	 */
	public void delete(Long[] ids);
	
	/**
	 * 返回分页列表
	 * @param tbBrand 
	 * @param pageNum 当前页码
	 * @param pageSize 当前记录数
	 * @return
	 */
	public PageResult findPage(TbBrand tbBrand, int pageNum,int pageSize);
}
