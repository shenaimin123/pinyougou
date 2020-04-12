package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService01 {

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
	 * 增加品牌
	 * @param tbBrand
	 */
	public void add(TbBrand tbBrand);
	
	/**
	 * 根据id获取实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	
	/**
	 * 修改品牌
	 * @param tbBrand
	 */
	public void update(TbBrand tbBrand);
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long ids[]);
	
	/**
	 * 分页
	 * @param brand
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	
	public PageResult findPage(TbBrand brand, int pageNum,int pageSize);
	
}
