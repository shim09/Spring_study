package com.shc.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shc.ex.dto.TraineeDTO;
import com.shc.ex.service.TraineeService;


@Controller
public class HomeController {
	// 스프링이 관리하는 객체를 사용하기
	// 의존성 주입(DI, Dependency Injection)
	@Autowired
	private TraineeService ts;
//	TraineeService a = new TraineeService();
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
@RequestMapping(value = "/insertform", method = RequestMethod.GET)
	public String insertform() {
		return "insert";
	}
	
@RequestMapping(value = "/insert", method = RequestMethod.POST)
public String insert(@ModelAttribute TraineeDTO trainee) {
	
	System.out.println("member insert : " + trainee);
	
	// TraineeService에 있는 insert 메서드 호출하면서 trainee 객체를 넘긴다면
		ts.insert(trainee);
		
	return "success";
}



}
