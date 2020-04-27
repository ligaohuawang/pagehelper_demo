package com.lgh.entity;

import com.github.pagehelper.Page;

import java.util.List;
/*TODO A3 自定义一个实体 用来装 分页参数。 提供一个构造方法 用于 给 这个实体类 赋予查询出来的分页参数*/
public class PageBean {
	private int currentPage = 1;// 当前页
	private int pageSize = 5; // 每页显示的条数
	private int totalPage;// 总页数
	private int totalCount;// 总条数
	private List<?> list;// 分页的集合数据
	private String url;// 分页的跳转地址

	/*TODO A4 对象初始的流程：1.父类构造方法--》2.默认初始化成员变量，给默认值--》3.手动初始化成员变量（直接赋值和静态代码块，他们的顺序是从上到下）--》4.本类的构造方法*/
	public PageBean(List<?> list) {
		/*TODO A5 这个Page是pagehelper的Page*/
		Page<?> page = (Page<?>) list;
		this.currentPage = page.getPageNum();
		this.pageSize = page.getPageSize();
		this.totalCount = (int)page.getTotal();
		this.list = page.getResult();
	}
	
	public PageBean() {
	}

	@Override
	public String toString() {
		return "PageBean{" +
				"currentPage=" + currentPage +
				", pageSize=" + pageSize +
				", totalPage=" + totalPage +
				", totalCount=" + totalCount +
				", list=" + list +
				", url='" + url + '\'' +
				'}';
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
