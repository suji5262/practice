package org.zerock.ex1.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name= "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("/todo/list");

        request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request, response);

    }
}
// getRequestDispatcher → 전달관련
// forward → 지금까지 들어온 모든 명령 무시, jsp가 작성하는 것만 브라우저로 전달
