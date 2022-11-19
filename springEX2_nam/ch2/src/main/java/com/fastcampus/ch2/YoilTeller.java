package com.fastcampus.ch2;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YoilTeller { // 연, 월, 일을 입력하면 요일을 알려주는 프로그램
    //http://localhost:8080/ch2/getYoil?year=2022&month=11&day=17
//	public static void main(String[] args) {
    @RequestMapping("/getYoil")
    public void main(HttpServletRequest request, HttpServletResponse response) throws IOException{
        // 1. 입력
//        String year = args[0];
//        String month = args[1];
//        String day = args[2];

        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");

        int yyyy = Integer.parseInt(year);
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);

        // 2. 처리
        Calendar cal = Calendar.getInstance();
        cal.set(yyyy, mm - 1, dd); // 날짜 계산

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1:일요일, 2:월요일 ...
        char yoil = " 일월화수목금토".charAt(dayOfWeek); // 요일을 알아낼수 있음

        // 3. 출력
//        System.out.println(year + "년 " + month + "월 " + day + "일은 ");
//        System.out.println(yoil + "요일입니다.");

        response.setContentType("text/html");    // 응답의 형식을 html로 지정
        response.setCharacterEncoding("utf-8");  // 응답의 인코딩을 utf-8로 지정 > 한글이 깨지는걸 방지
        PrintWriter out = response.getWriter();  // 브라우저로의 출력 스트림(out)을 얻는다.
        // response객체에서 브라우져로의 출력 스트림을 얻는다
        out.println(year + "년 " + month + "월 " + day + "일은 ");
        out.println(yoil + "요일입니다.");

//        out.println("<html>");
//        out.println("<head>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println(year + "년 " + month + "월 " + day + "일은 ");
//        out.println(yoil + "요일입니다.");
//        out.println("</body>");
//        out.println("</html>");
//        out.close();
    }
}