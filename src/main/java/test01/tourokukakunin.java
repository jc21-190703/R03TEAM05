package test01;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class
 */
@WebServlet(urlPatterns = { "/tourokukakunin" })
public class tourokukakunin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.54.191/webapp","webapp","webapp");
		PreparedStatement st = connection.prepareStatement("insert into mst_food(foodNo,iconNo,foodName,expryDate,quantity) select foodNo,iconNo,foodName,expryDate,quantity from sub_food;");
			
			
			st.executeUpdate();
			
			st = connection.prepareStatement("delete from sub_food;");
			
			st.executeUpdate();
			
			st.close();
			connection.close();
			
			
			request.getRequestDispatcher("/main").forward(request, response);
			//request.getRequestDispatcher("/WEB-INF/jsp/insert.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}