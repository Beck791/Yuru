package com.yurucamp.car.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.yurucamp.car.model.ReservationBean;
import com.yurucamp.car.model.CarBean;
import com.yurucamp.car.model.service.CarService;

@Controller
public class CarController {
	@Autowired
	CarService carService;

	@GetMapping("/Car/Index")
	public String carIndex() {
		return "CarViewPage";
	}
	
	@RequestMapping(value = "/Car/reservation", method = RequestMethod.POST,
			params = { "dept", "ret", "deptDate", "deptTime", "returnDate", "returnTime" })
	public String goodLuck(Model model, 		
			@RequestParam(value = "dept") String dept,
			@RequestParam(value = "ret") String ret,
			@RequestParam(value = "deptDate") String deptDate,
			@RequestParam(value = "deptTime") String deptTime,
			@RequestParam(value = "returnDate") String returnDate,
			@RequestParam(value = "returnTime") String returnTime) {
		// 検索条件
				ReservationBean carBean = new ReservationBean();
//				carBean.setDept(Integer.valueOf(dept));
//				carBean.setRet(Integer.valueOf(ret));
//				carBean.setDeptDate(Date.valueOf(deptDate));
//				carBean.setDeptTime(Integer.valueOf(deptTime));
//				carBean.setReturnDate(Date.valueOf(returnDate));
//				carBean.setReturnTime(Integer.valueOf(returnTime));

				// 検索結果List（Items）
				List<CarBean> planList = carService.getList(carBean);

				model.addAttribute("dept", dept);	// 將第一項資訊放入model物件內
				model.addAttribute("ret", ret); 		// 將第二項資訊放入model物件內
				model.addAttribute("deptDate", deptDate);
				model.addAttribute("deptTime", deptTime);
				model.addAttribute("returnDate", returnDate);
				model.addAttribute("returnTime", returnTime);
				model.addAttribute("planList",planList);
				return "ReservationPage";
			}

			@RequestMapping(value = "/Car/reservation2",
					params = { "dept", "ret", "deptDate", "deptTime", "returnDate", "returnTime" })
			public String car(Model model,
					@RequestParam(value = "dept") String dept,
					@RequestParam(value = "ret") String ret,
					@RequestParam(value = "deptDate") String deptDate,
					@RequestParam(value = "deptTime") String deptTime,
					@RequestParam(value = "returnDate") String returnDate,
					@RequestParam(value = "returnTime") String returnTime) {
				model.addAttribute("dept", dept);	// 將第一項資訊放入model物件內
				model.addAttribute("ret", ret); 		// 將第二項資訊放入model物件內
				model.addAttribute("deptDate", deptDate);
				model.addAttribute("deptTime", deptTime);
				model.addAttribute("returnDate", returnDate);
				model.addAttribute("returnTime", returnTime);
				return "ReservationPage2";
		 	}

			@RequestMapping(value = "/Car/reservation3",
					params = { "dept", "ret", "deptDate", "deptTime", "returnDate", "returnTime", "device", "discount" })
			public String carcar(Model model,
					@RequestParam(value = "dept") String dept,
					@RequestParam(value = "ret") String ret,
					@RequestParam(value = "deptDate") String deptDate,
					@RequestParam(value = "deptTime") String deptTime,
					@RequestParam(value = "returnDate") String returnDate,
					@RequestParam(value = "returnTime") String returnTime,
					@RequestParam(value = "device") String device,
					@RequestParam(value = "discount") String discount) {
				model.addAttribute("dept", dept);	// 將第一項資訊放入model物件內
				model.addAttribute("ret", ret); 		// 將第二項資訊放入model物件內
				model.addAttribute("deptDate", deptDate);
				model.addAttribute("deptTime", deptTime);
				model.addAttribute("returnDate", returnDate);
				model.addAttribute("returnTime", returnTime);
				model.addAttribute("device", device);
				model.addAttribute("discount", discount);
				return "ReservationPage3";
		 	}
		}


	
		
//		List<Map<String,Object>> planList = new ArrayList<Map<String,Object>>();//FROM DB DATA
//		Map<String,Object> planMap = new HashMap<String,Object>();
//		planMap.put("imgUrl","../img/car/typeAcar.png");
//		planMap.put("type", "A");
//		planMap.put("price", "6500(一日)");
//		planMap.put("threedaysdiscount", "5% OFF");
//		planMap.put("fivedaysdiscount", "10% OFF");
//		planList.add(planMap);
//		planMap = new HashMap<String,Object>();
//		planMap.put("imgUrl","../img/car/typeBcar.png");
//		planMap.put("type", "B");
//		planMap.put("price", "7000(一日)");
//		planMap.put("threedaysdiscount", "5% OFF");
//		planMap.put("fivedaysdiscount", "10% OFF");
//		planList.add(planMap);
//		planMap = new HashMap<String,Object>();
//		planMap.put("imgUrl","../img/car/typeCcar.png");
//		planMap.put("type", "C");
//		planMap.put("price", "7500(一日)");
//		planMap.put("threedaysdiscount", "5% OFF");
//		planMap.put("fivedaysdiscount", "10% OFF");
//		planList.add(planMap);
//		
//		model.addAttribute("dept", dept);	// 將第一項資訊放入model物件內
//		model.addAttribute("ret", ret); 		// 將第二項資訊放入model物件內
//		model.addAttribute("deptDate", deptDate); 
//		model.addAttribute("deptTime", deptTime); 
//		model.addAttribute("returnDate", returnDate); 
//		model.addAttribute("returnTime", returnTime); 
//		model.addAttribute("planList",planList);
//		return "ReservationPage";	
//	}
//
//	@RequestMapping(value = "/Car/reservation2", 
//			params = { "dept", "ret", "deptDate", "deptTime", "returnDate", "returnTime", "amount", "type" })
//	public String car(Model model, 
//			@RequestParam(value = "dept") String dept,
//			@RequestParam(value = "ret") String ret,
//			@RequestParam(value = "deptDate") String deptDate,
//			@RequestParam(value = "deptTime") String deptTime,
//			@RequestParam(value = "returnDate") String returnDate,
//			@RequestParam(value = "returnTime") String returnTime,
//			@RequestParam(value = "amount") String amount,
//			@RequestParam(value = "type") String type) {
//		model.addAttribute("dept", dept);	// 將第一項資訊放入model物件內
//		model.addAttribute("ret", ret); 		// 將第二項資訊放入model物件內
//		model.addAttribute("deptDate", deptDate); 
//		model.addAttribute("deptTime", deptTime); 
//		model.addAttribute("returnDate", returnDate); 
//		model.addAttribute("returnTime", returnTime); 
//		model.addAttribute("amount", amount); 
//		model.addAttribute("type", type); 
//		return "ReservationPage2";
// 	}
//	
//	@RequestMapping(value = "/Car/reservation3", 
//			params = { "dept", "ret", "deptDate", "deptTime", "returnDate", "returnTime", "device", "discount" })
//	public String carcar(Model model, 
//			@RequestParam(value = "dept") String dept,
//			@RequestParam(value = "ret") String ret,
//			@RequestParam(value = "deptDate") String deptDate,
//			@RequestParam(value = "deptTime") String deptTime,
//			@RequestParam(value = "returnDate") String returnDate,
//			@RequestParam(value = "returnTime") String returnTime,
//			@RequestParam(value = "device") String device,
//			@RequestParam(value = "discount") String discount) {
//		model.addAttribute("dept", dept);	// 將第一項資訊放入model物件內
//		model.addAttribute("ret", ret); 		// 將第二項資訊放入model物件內
//		model.addAttribute("deptDate", deptDate); 
//		model.addAttribute("deptTime", deptTime); 
//		model.addAttribute("returnDate", returnDate); 
//		model.addAttribute("returnTime", returnTime); 
//		model.addAttribute("device", device); 
//		model.addAttribute("discount", discount);
//		return "ReservationPage3";
// 	}
//}
//
