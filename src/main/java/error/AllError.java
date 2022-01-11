package error;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AllError
 */
@WebServlet("/aerr")
public class AllError extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllError() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   
		try {
			String foodName = request.getParameter("foodName");
			String quantity = request.getParameter("quantity");
			
			if (foodName == "") {
				request.getRequestDispatcher("notEnteredError.jsp").forward(request, response);
				
			} else if(foodName.length() > 30) {
				
				request.getRequestDispatcher("wordCountError.jsp").forward(request, response);
				
			}else if(quantity.length() >= 99) {
				request.getRequestDispatcher("specifiedNumberError.jsp").forward(request, response);
			
			}else if((foodName == "")&&(foodName.length() > 30)&&(quantity.length() >=99)) {
				request.getRequestDispatcher("allError.jsp").forward(request, response);
			}
			
	    } catch (Exception e) {
	    	request.getRequestDispatcher("/WEB-INF/jsp/unexpectedError.jsp").forward(request, response);
	    }
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  doGet(request, response);
	}

}
