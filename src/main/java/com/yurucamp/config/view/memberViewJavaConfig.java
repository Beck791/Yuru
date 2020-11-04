package com.yurucamp.config.view;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Configuration
public class memberViewJavaConfig {

	@Bean
	public View MemberViewPage() { // 呼叫此方法名稱及導向設定之jsp
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/CampSite/campSiteIndex.jsp"); // 此為範例，自己改路徑，或往下加其他路徑
		return view;
	}

}
