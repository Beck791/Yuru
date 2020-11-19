package com.yurucamp.mallsystem.model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {   
	
	private Map<Integer, OrderBean> cart = new LinkedHashMap< >();
	
	public ShoppingCart() {
	}
	
	public Map<Integer, OrderBean> getContent() { // ${ShoppingCart.content}
		return cart;
	}
	public void addToCart(int productId, OrderBean  orderbean) {
		if (orderbean.getQuantity() <= 0 ) {
			return;
		}
		// 如果客戶在伺服器端沒有此項商品的資料，則客戶第一次購買此項商品
		if ( cart.get(productId) == null ) {
		    cart.put(productId, orderbean);
		} else {
	        // 如果客戶在伺服器端已有此項商品的資料，則客戶『加購』此項商品
			OrderBean oBean = cart.get(productId);
			// 加購的數量：bean.getQuantity()
			// 原有的數量：oBean.getQuantity()			
			oBean.setQuantity(orderbean.getQuantity() + oBean.getQuantity());
		}
	}

	public boolean modifyQty(int productId, int newQty) {
		if ( cart.get(productId) != null ) {
		   OrderBean  orderbean = cart.get(productId);
		   orderbean.setQuantity(newQty);
	       return true;
		} else {
		   return false;
		}
	}
	// 刪除某項商品
	public int deleteProduct(Integer productId) {
		if ( cart.get(productId) != null ) {
	       cart.remove(productId);  // Map介面的remove()方法
	       return 1;
		} else {
		   return 0;
		}
	}
	public int getItemNumber(){   // ShoppingCart.itemNumber
		return cart.size();
	}
	//計算購物車內所有商品的合計金額(每項商品的單價*數量的總和)
	public Integer getSubtotal(){
		Integer subTotal = 0 ;
		Set<Integer> set = cart.keySet();
		for(int n : set){
			OrderBean orderbean = cart.get(n);
			Integer price    = orderbean.getPrice();
			Integer fee = orderbean.getFee();
			int quantity      = orderbean.getQuantity();
			subTotal +=  price * quantity + fee;
		}
		return subTotal;
	}

}
