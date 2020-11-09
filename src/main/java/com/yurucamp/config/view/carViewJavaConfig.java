package com.yurucamp.config.view;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Configuration
public class carViewJavaConfig {

	@Bean
	public View CarViewPage() { // 呼叫此方法名稱及導向設定之jsp
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/Car/carIndex.jsp"); // 此為範例，自己改路徑，或往下加其他路徑
		return view;
	}
	
	@Bean
	public View ReservationPage() { 
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/Car/reservation.jsp");
		return view; 
	}
	
	@Bean
	public View ReservationPage2() { 
		InternalResourceView view = new InternalResourceView();
		view.setUrl("/WEB-INF/pages/Car/reservation2.jsp");
		return view; 
	}

}
