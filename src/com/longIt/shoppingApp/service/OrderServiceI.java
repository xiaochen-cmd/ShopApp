/**
 * 
 */
package com.longIt.shoppingApp.service;

import java.util.List;

import com.longIt.shoppingApp.bean.Order;
import com.longIt.util.pager.PageModel;

/**
 */
public interface OrderServiceI {

	/**
	 * @param pageModel
	 * @return //订单分页查询
	 */
	List<Order> getAll(PageModel pageModel);

	/**
	 * @param order //确认发送订单
	 */
	void checkOrder(Order order);

}
