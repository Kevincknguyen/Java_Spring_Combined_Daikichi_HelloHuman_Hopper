package com.daikichi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HopperController {
	 @RequestMapping("/")
	 public String home(Model model){
		 model.addAttribute("dojoName","Burbank");
		 
		 
		 
		 
		 
		 
		return "index.jsp";
	 }
	 
	 @RequestMapping("/hopper")
	 public String hopper(Model model){
		 
		 String name="Grace 'A Lady' Hopper";
		 String itemName="Potatos";
		 double price=2.25;
		 String description="For all of your potato needs";
		 String vendor="Little THings Corner Place";		
		 
		 
		 
		 model.addAttribute("name",name);
		 model.addAttribute("item",itemName);
		 model.addAttribute("price",price);
		 model.addAttribute("desc",description);
		 model.addAttribute("vendor",vendor);
		 
		 
		 
		 
		 
		 
		return "Hopper.jsp";
	 }
}
		
