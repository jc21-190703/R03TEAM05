package edit;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class editPage
 */
@WebServlet("/editPage")
public class editPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
//いつも書いてるやつ
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		try {
//DB接続
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://192.168.54.191/webapp","webapp","webapp");
			java.sql.Statement st =connection.createStatement();
			ResultSet result = st.executeQuery("select iconNo,foodName,expryDate,quantity from mst_food");
		
			
			
			for(String[] s : list) {
				System.out.println(s[0]);
				System.out.println(s[1]);
				System.out.println(s[2]);
				System.out.println(s[3]);
			}
		
			request.setAttribute("list", list);
			request.getRequestDispatcher("/WEB-INF/jsp/editPage.jsp")
			.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace(out);
		}
	}
}
