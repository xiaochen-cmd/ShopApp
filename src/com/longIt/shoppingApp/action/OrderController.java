/**
 * 
 */
package com.longIt.shoppingApp.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.longIt.shoppingApp.bean.Order;
import com.longIt.shoppingApp.service.OrderServiceI;
import com.longIt.util.pager.PageModel;

/**
 */
@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderServiceI orderService;

	// 订单分页查询
	@RequestMapping("/getAll.action")
	public String getAll(PageModel pageModel, Model model) {

		List<Order> orders = orderService.getAll(pageModel);
		model.addAttribute("orders", orders);
		return "order/list";

	}

	// 确认发送订单
	@RequestMapping("/checkOrder.action")
	public String checkOrder(Order order) {
		orderService.checkOrder(order);

		return "redirect:/order/getAll.action";

	}

}
