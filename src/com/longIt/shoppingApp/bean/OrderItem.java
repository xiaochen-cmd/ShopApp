package com.longIt.shoppingApp.bean;

/**
 * OrderItem 数据传输类
 * 
 * @author CHUNLONG.LUO
 * @email 584614151@qq.com
 * @date 2019-08-04 22:03:23
 * @version 1.0
 */
public class OrderItem implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int orderId;// 订单id
	private int articleId;// 商品id
	private int orderNum;// 购买数量

	private Article article;

	/** setter and getter method */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public int getArticleId() {
		return this.articleId;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public int getOrderNum() {
		return this.orderNum;
	}

	/**
	 * @return the article
	 */
	public Article getArticle() {
		return article;
	}

	/**
	 * @param article the article to set
	 */
	public void setArticle(Article article) {
		this.article = article;
	}

}