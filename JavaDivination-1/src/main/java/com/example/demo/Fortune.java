package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class Fortune {
	@RequestMapping("/fortune")
	public String start() {
		final double fn = Math.random(); // 0.0 ~ 1.0の乱数
		if (fn >= 0.7) {
			return "greateFortune.html";
		} else if (fn >= 0.4) {
			return "middleFortune.html";
		} else if (fn >= 0.1) {
			return "smallFortune.html";
		} else {
			return "misFortune.html";
		}
	}
}
