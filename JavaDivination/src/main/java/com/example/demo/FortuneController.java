package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author tasiei_Iphone
 *
 */
@Controller
public class FortuneController {
//    @Autowired 
//    FortuneService fortuneService;
    
	@RequestMapping("/fortune")
	public String start(Model model) {
	    FortuneService fortuneService = new FortuneService();
		final double fn = Math.random(); // 0.0 ~ 1.0の乱数
		model.addAttribute("fortune", fortuneService.getFortune(fn));
		return "fortune";
	}
}
