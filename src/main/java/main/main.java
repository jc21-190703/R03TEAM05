package main;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class A
 */
@WebServlet(urlPatterns = {"/main", "/index.htm"})

public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://192.168.54.191/webapp","webapp","webapp");
			java.sql.Statement st =connection.createStatement();
			ResultSet result = st.executeQuery("select iconNo,foodName,expryDate,quantity from mst_food");

			List<String[]> list = new ArrayList<>();
			while( result.next() == true) {
				String[] s = new String[4];				
				
				s[0]=result.getString("iconNo");
				s[1]=result.getString("foodName");
				s[2]=result.getString("expryDate");	
				s[3]=result.getString("quantity");
				
				
				list.add(s);
				//System.out.println(result.getString("X"));
				}
				for(String[] s : list) {
					System.out.println(s[0]);
					System.out.println(s[1]);
					System.out.println(s[2]);
					System.out.println(s[3]);
				}
				
				
				//String value1=request.getParameter("value1");
				request.setAttribute("list", list);
				request.getRequestDispatcher("/WEB-INF/jsp/main.jsp")
				.forward(request, response);
				
				
			
		} catch (ClassNotFoundException e ) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e ) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
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
