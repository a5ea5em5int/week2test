package com.software.week2.controller;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.software.week2.entity.Employee;

@Controller
public class AppController {
	
	@GetMapping("/hello")
	public String helloWorld(Model model)
	{
		
		List<Employee> emps = Arrays.asList(
				new Employee(1,"swe","BE",LocalDateTime.of(2000, Month.of(10),10,12,12,12)),
				new Employee(2,"myat","BSc",LocalDateTime.of(2001, Month.of(10),10,12,12,12)),
				new Employee(3,"lwin","MSc",LocalDateTime.of(2002, Month.of(9),10,12,12,12)),
				new Employee(4,"Khine","MSc",LocalDateTime.of(2002, Month.of(7),10,12,12,12))
				);
		for (Employee e:emps)
			System.out.println(e.getName());
		Employee e1 = new Employee(5,"Khine","ME",LocalDateTime.of(1992, Month.of(7),10,12,12,12));
		model.addAttribute("title", "Greet Hello");
		model.addAttribute("emp",e1);
		model.addAttribute("message", "Hello Every One ! How everything's with you.");
		model.addAttribute("emps", emps);
		return "hello";
	}
	@GetMapping("/login")
	public String login(@RequestParam("email")String email,@RequestParam("password")String password)
	{	System.out.println(email);
	System.out.println(password);
		if (email.equals("aye@gmail.com") && password.equals("susu"))
		{System.out.println(email);
		return "loginsuccess";
		}
		else return "loginfail";
	}
	@GetMapping("/loginform")
	public String loginform()
	{
		return "loginform";
	}

}
