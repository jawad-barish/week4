package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;

@WebServlet(name = "Form2Servlet", urlPatterns = { "/form2" })


public class Form2Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve data from the form
        String input = request.getParameter("input2");
        
        // Process the data using your Java class (MySecondDataProcessor in this case)
        String processedData = MySecondDataProcessor.processData(input);
        
        // Set the result in a request attribute
        request.setAttribute("result", processedData);
        
        // Forward the request to the result JSP page
        request.getRequestDispatcher("/result2.jsp").forward(request, response);
    }
}

