package com.yurucamp.config.view;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Configuration
public class campViewJavaConfig {

	@Bean
	public View CampSiteIndex() { // 回首頁
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/CampSite/campSiteIndex.jsp"); // 此為範例，自己改路徑，或往下加其他路徑
		return view;
	}
	
	@Bean
	public View fy374() { // 鳳凰谷 頁面
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/CampSite/fy374.jsp"); // 此為範例，自己改路徑，或往下加其他路徑
		return view;
	}
	@Bean
	public View Test() { // 測試用
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/CampSite/Test.jsp"); // 此為範例，自己改路徑，或往下加其他路徑
		return view;
	}
	
	@Bean
	public View TestOne() { // 測試用
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/CampSite/TestOne.jsp"); // 此為範例，自己改路徑，或往下加其他路徑
		return view;
	}

	@Bean
	public View reCAPTCHA_v2() { // reCAPTCHA_v2
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/CampSite/reCAPTCHA_v2.jsp"); // 此為範例，自己改路徑，或往下加其他路徑
		return view;
	}
	
	@Bean
	public View reCAPTCHA_v3() { // reCAPTCHA_v3
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/CampSite/reCAPTCHA_v3.jsp"); // 此為範例，自己改路徑，或往下加其他路徑
		return view;
	}
	
	@Bean
	public View InsertCamp() { // 新增
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/CampSite/InsertCamp.jsp");
		return view;
	}
	
	@Bean
	public View QueryOneCamp() { // 查詢單一營地
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/CampSite/UpdateCamp.jsp");
		return view;
	}
	
	@Bean
	public View QueryAllCamp() { // 查詢全部
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/CampSite/UpdateCamp.jsp");
		return view;
	}
	
	
}
