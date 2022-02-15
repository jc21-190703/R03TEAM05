package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String User = request.getParameter("username");
			String Pass = request.getParameter("password");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.54.191/webapp","webapp","webapp");
			
			
			PreparedStatement st = connection.prepareStatement("select UserName,Password from User where UserName = ? AND Password = ?; ");
			
			st.setString(1, User);
			st.setString(2, Pass);
			String u = null;
			String p = null;
			ResultSet result =st.executeQuery();
			
			while(result.next()== true) {
				
			
			u = result.getString("UserName");
			p = result.getString("Password");
 			if(u != null && p!= null){
 				request.getRequestDispatcher("/A").forward(request, response);
 			}
			}
			
			st.close();
			connection.close();
			
			if(u==null || p== null) {
			request.setAttribute("error", "ログインに失敗しました。");
			request.getRequestDispatcher("WEB-INF/jsp/login/Loginerror.jsp").forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			// TODO 閾ｪ蜍慕函謌舌＆繧後◆ catch 繝悶Ο繝�繧ｯ
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 閾ｪ蜍慕函謌舌＆繧後◆ catch 繝悶Ο繝�繧ｯ
			e.printStackTrace();
		}
	}
		
		
		
		
		
	

	
}
