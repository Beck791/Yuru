package com.yurucamp.general.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ecpay.payment.integration.AllInOne;
import ecpay.payment.integration.domain.AioCheckOutOneTime;
import ecpay.payment.integration.domain.InvoiceObj;
import ecpay.payment.integration.exception.EcpayException;

@Controller
public class EcPayController {

	@ResponseBody
	@PostMapping(value = "/EcPay/MemberUpgrade", produces = "text/html;charset=UTF-8")
	public String authorityEcPayPM(HttpServletRequest req) {

		String baseURL = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort()
				+ req.getContextPath();
		System.out.println("baseURL: " + baseURL);
		AioCheckOutOneTime aio = new AioCheckOutOneTime();
		AllInOne all = new AllInOne("");

		// without invoice
		InvoiceObj invoice = null;

		aio.setMerchantTradeNo(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 15));
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		aio.setMerchantTradeDate(sdf.format(date));
		aio.setItemName("YuruCamp白金會員升級");
		aio.setTotalAmount("500");
		aio.setTradeDesc("YuruCamp");
		aio.setReturnURL("https://joycart.azurewebsites.net/testAIO"); // need to modify
		aio.setClientBackURL(baseURL);

		try {
			String html = all.aioCheckOut(aio, invoice);
			return html;
		} catch (EcpayException e) {
			throw new Error(e.getNewExceptionMessage());
		}
	}

	@PostMapping(value = "/EcPay/Orders/{userNo}", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String payment(@PathVariable Integer userNo, HttpServletRequest req) {
		String baseURL = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort()
				+ req.getContextPath();

		// get specific cart list by userNo
//		List<ProductCartViewBean> list = autoBuyService.getAllViewProductFromCart(userNo);
		Integer sum = 0;

		// build string for multiple items
		StringBuilder stb = new StringBuilder();
//		for (ProductCartViewBean bean : list) {
//			stb.append(bean.getName());
//			stb.append(" x ");
//			stb.append(bean.getQuantity());
//			stb.append(" = ");
//			stb.append(bean.getTotal());
//			stb.append(" 元#");
//
//			sum += bean.getTotal();
//		}

		// remove last # mark
//		stb.deleteCharAt(stb.length() - 1);

		AioCheckOutOneTime aio = new AioCheckOutOneTime();
		AllInOne all = new AllInOne("");
		InvoiceObj invoice = null;

		aio.setMerchantTradeNo(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 15));
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		aio.setMerchantTradeDate(sdf.format(date));

		aio.setItemName(stb.toString());
		aio.setTotalAmount(sum.toString());
		aio.setTradeDesc("YuruCamp");
		aio.setReturnURL("https://d0af4f137053.ngrok.io/testAIO"); // need to modify
		aio.setClientBackURL(baseURL + userNo);

		try {
			String html = all.aioCheckOut(aio, invoice);
			System.out.println(html);
			return html;
		} catch (EcpayException e) {
			throw new Error(e.getNewExceptionMessage());
		}
	}
}
