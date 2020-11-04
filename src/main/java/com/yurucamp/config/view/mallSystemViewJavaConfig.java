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
<<<<<<< HEAD
		view.setUrl("/WEB-INF/pages/Product/ProductIndex.jsp"); //此為範例，自己改路徑，或往下加其他路徑
=======
		view.setUrl("/WEB-INF/pages/mallSystem.jsp"); // 此為範例，自己改路徑，或往下加其他路徑
>>>>>>> 1a8af6a317be3fe825bb1286bbc43c25ef8ad2a0
		return view;
	}

}
