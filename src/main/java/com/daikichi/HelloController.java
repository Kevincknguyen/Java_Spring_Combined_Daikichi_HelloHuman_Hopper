package com.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	 @RequestMapping("")
	 public String welcome(
			 @RequestParam(value="fName",required=false)String fName,
			 @RequestParam(value="lName",required=false,defaultValue="")String lName,
			 @RequestParam(value="times",required=false)Integer times){
		 
		 
		 if (fName != null) {
			 if (times != null) {
//				 Integer check=Integer.parseInt(times);
				 String result=" ";
				 for (int i=0;i<times;i++) {
					result =result.concat("I know who you are "+fName +" "+ lName+ " ");
								 
				 }
				 return result;
			 }
			 else {
				 return "I know who you are "+fName +" "+ lName;
			 }
		 }
		 
		 
		 
		 
		return "Hello human";
			 
		 
		 	 
}
//	 @RequestMapping("/today")
//	 public String today(){
//	   return "Its a big day today! Time to hustle!";
//	 }
//	 @RequestMapping("/tomorrow")
//	 public String tomrrow(){
//	   return "You hustle today, you can sleep tomorrow!";
//	 }
//	 
//	 @RequestMapping("/weekday")
//	 public String weekday(@RequestParam(value="day",required= false)String searchQuery){
//	   return "You searched for:"+searchQuery;
// }
}