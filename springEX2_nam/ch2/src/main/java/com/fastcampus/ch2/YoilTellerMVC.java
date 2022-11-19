package com.fastcampus.ch2;


import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 연, 월, 일을 입력하면 요일을 알려주는 프로그램
@Controller
public class YoilTellerMVC {
//		http://localhost:8080/ch2/getYoilMVC?year=2022&month=11&day=17

	@RequestMapping("/getYoilMVC")
//	public void main(HttpServletRequest request, HttpServletResponse response) throws IOException{
	public String main(int year, int month, int day, Model m) throws IOException{
//	public void main(int year, int month, int day, Model model) throws IOException{
		// 반환타입을 주지 않으면 mapping된 주소로! > 보통이렇게는 안씀
//	public ModelAndView main(int year, int month, int day, Model model) throws IOException{

//		ModelAndView mv = new ModelAndView();
//		//1. 유효성 검사
//		if(!isValid(year, month, day))
//			return "yoilError";

		//2. 요일 계산
		char yoil = getYoil(year, month, day);

		//3. 계산한 결과를 model에 저장
		m.addAttribute("year", year);
		m.addAttribute("month", month);
		m.addAttribute("day", day);
		m.addAttribute("yoil", yoil);

		//4. 결과를 보여줄 view를 지정
//        mv.setViewName("yoil");
//        return mv;


		return "yoil"; // WEB-INF/views/yoil. jsp


	}

	private boolean isValid(int year, int month, int day) {
		// TODO Auto-generated method stub
		return true;
	}

	private char getYoil(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day);

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1:일요일, 2:월요일 ...
		return " 일월화수목금토".charAt(dayOfWeek);
	}
}