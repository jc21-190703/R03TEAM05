package login;

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
 * Servlet implementation class UserInsert
 */
@WebServlet("/UserInsert")
public class UserInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.54.191/webapp","webapp","webapp");
		PreparedStatement st = connection.prepareStatement("insert into  user(UserName,Password) Values(?,?); ");
		
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		
		st.setString(1,user);
		st.setString(2,pass);
		
		st.executeUpdate();
		
		
		request.setAttribute("complete", "登録が完了しました。");
		request.getRequestDispatcher("/WEB-INF/jsp/login/registrationcomplete.jsp").forward(request, response);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


}
