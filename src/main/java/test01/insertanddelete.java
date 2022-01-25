package test01;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class
 */
@WebServlet(urlPatterns = { "/insertanddelete" })
public class insertanddelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doGet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// final String driverName = "oracle.jdbc.driver.OracleDriver";
		// final String url = "jdbc:oracle:thin:@192.168.54.222:1521/pdborcl";
		// final String id = "OUBO";
		// final String pass = "Oubo2021";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.54.191/webapp", "webapp",
					"webapp");
			java.sql.Statement st = connection.createStatement();
			ResultSet result = st.executeQuery("select iconNo,foodName,expryDate,quantity from mst_food");

			String iconNo = request.getParameter("iconNo");
			String foodName = request.getParameter("foodName");
			String expryDate = request.getParameter("expryDate");
			String quantity = request.getParameter("quantity");

			
			((PreparedStatement) st).setString(1, iconNo);
			((PreparedStatement) st).setString(2, foodName);
			((PreparedStatement) st).setString(3, expryDate);
			((PreparedStatement) st).setString(4, quantity);
			
	
			List<String[]> list = new ArrayList<>();

			while (result.next() == true) {

				String[] s = new String[4];
				s[0] = result.getString(iconNo);
				s[1] = result.getString(foodName);
				s[2] = result.getString(expryDate);
				s[3] = result.getString(quantity);

				list.add(s);
			}

			st.close();
			connection.close();
			String sql = "delete FROM sub";
			if (sql != "") {
				st = connection.prepareStatement(sql);
				st.close();
				connection.close();
			} else {

			}

			request.getRequestDispatcher("/WEB-INF/jsp/aaaaaa.jsp").forward(request, response);
		} catch (Exception e) {
			

		}

	}
}
