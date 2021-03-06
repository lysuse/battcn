package com.battcn.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

public interface BaseService<T> {

	public String save(T entity);

	public String delete(Object key);

	public String update(T entity);

	public String batchDelete(Object ids[]);

	public T findByPrimaryKey(Object key);

	/**
	 * 查询单个对象：如果多条记录则会抛出异常
	 */
	public T findByObject(T entity);

	public List<T> queryExampleForList(Object example);

	public List<T> queryObjectForList(String order);

	public List<T> queryObjectForList();

	/**
	 * 带条件查询所有
	 * 
	 */
	public List<T> queryObjectForList(T entity);

	//分页
	public PageInfo<T> queryPageForList();
	//带条件分页
	public PageInfo<T> queryPageForList(T entity);

}
