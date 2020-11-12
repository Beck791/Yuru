package com.yurucamp.config.view;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Configuration
public class mallSystemViewJavaConfig {

	@Bean
	public View mallSystemViewPage() { // 呼叫此方法名稱及導向設定之jsp
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/Product/BackStageIndex.jsp"); // 此為範例，自己改路徑，或往下加其他路徑
		return view;
	}
	
	@Bean
	public View mallSystemIndex() { 
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/Product/MallSystemIndex.jsp"); 
		return view;
	}
	
	@Bean
	public View mallSystemGetAllProduct() { 
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/Product/GetAllProduct.jsp"); 
		return view;
	}
	
	@Bean
	public View mallSystemInsertProduct() { 
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/Product/InsertProduct.jsp"); 
		return view;
	}
	
	@Bean
	public View mallSystemUpdateProduct() { 
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/Product/UpdateProduct.jsp"); 
		return view;
	}
	
	@Bean
	public View mallSystemGetAllBrand() { 
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/Product/GetAllBrand.jsp"); 
		return view;
	}
	
	@Bean
	public View mallSystemInsertBrand() { 
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/Product/InsertBrand.jsp"); 
		return view;
	}
	
	@Bean
	public View mallSystemUpdateBrand() { 
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/Product/UpdateBrand.jsp"); 
		return view;
	}

	
	
	
}
