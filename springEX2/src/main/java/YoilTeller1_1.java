package com.fastcampus.ch2;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YoilTeller1_1 {
//	public static void main(String[] args) {
	// http://localhost:8080/ch2/getYoil2?year=2022&month=11&day=15
	@RequestMapping("/getYoil1_1")
	public void main(HttpServletRequest request) {
	String year = request.getParameter("year");
	String month = request.getParameter("month");
	String day = request.getParameter("day");
	
    int yyyy = Integer.parseInt(year);
    int mm = Integer.parseInt(month);
    int dd = Integer.parseInt(day);
    
    Calendar cal = Calendar.getInstance();
    cal.set(yyyy, mm - 1, dd);
    
    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
    char yoil = " 일월화수목금토".charAt(dayOfWeek);
    
    System.out.println(year + "년 " + month + "월 " + day + "일은 ");
    System.out.println(yoil + "요일입니다.");
    
	}
}
