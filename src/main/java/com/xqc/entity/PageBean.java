package com.xqc.entity;

/**
 * 分页Model类
 * 
 * @author A Cang（xqc）
 *
 */
public class PageBean {

	private int page; // 第几页
	private int pageSize; // 每页记录数
	private int start;  // 起始页
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
}
