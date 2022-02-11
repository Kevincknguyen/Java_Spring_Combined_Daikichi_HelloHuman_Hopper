package com.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	 @RequestMapping("")
	 public String welcome(){
	   return "Daikichi Home";
	 }
	 @RequestMapping("/today/{name}/{value}")
	 public String today(@PathVariable(required=false) String name,@PathVariable(required=false) Integer value){
		
		String result="Its a big day today! Time to hustle "+name+ ". Your current lotto:";
		
		if (value%2==0) {
			result=result.concat(" Do be careful though, there is a chance of metaphorical rain");
			
		}
		else {
			result=result.concat(" Things are looking clear. Go for broke!");
			
		}
		return result;
		 
	 }
	 @RequestMapping("/tomorrow")
	 public String tomrrow(){
	   return "You hustle today, you can sleep tomorrow!";
	 }
	 
	 @RequestMapping("/weekday")
	 public String weekday(@RequestParam(value="day",required= false)String searchQuery){
	   return "You searched for:"+searchQuery;
	 }
	   
	   @RequestMapping("/travel/{destination}")
		 public String travel(@PathVariable(required= false)String destination){
		   return "You will soon(tm) travel to "+destination;
 }
}


