package com.shc.work;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/joinpage", method = RequestMethod.GET)
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "/join2", method = RequestMethod.GET)
	public String join2() {
		return "join2";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String memberjoin(Model model, @RequestParam("id") String id,
			@RequestParam("pw") String pw,
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("gender") String gender) {
		
		MemberDTO a = new MemberDTO();
		System.out.println(a);
				
		model.addAttribute("idValue", id);
		model.addAttribute("pwValue", pw);
		model.addAttribute("nameValue", name);
		model.addAttribute("emailValue", email);
		model.addAttribute("genderValue", gender);
		
		return "memberjoin";
		
	}
	@RequestMapping(value = "/join2", method = RequestMethod.POST)
	public String memberjoin2(@ModelAttribute MemberDTO member) {
		
		System.out.println("memberJoin2: " + member);
		
		return "join";
	}
}
