package test01;

import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class OUBO
 */
@WebServlet("/InsertServelet")
public class InsertServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		try {
			String p00g = request.getParameter("p00s");
			String name = request.getParameter("name");
			Date today = (Date) sdf.parse(request.getParameter("today"));
			String textbox = request.getParameter("textbox");
			String p01g = request.getParameter("p01s");
			String name1 = request.getParameter("name1");
			Date today1 = (Date) sdf.parse(request.getParameter("today1"));
			String textbox1 = request.getParameter("textbox1");
			String p02g = request.getParameter("p02s");
			String name2 = request.getParameter("name2");
			Date today2 = (Date) sdf.parse(request.getParameter("today2"));
			String textbox2 = request.getParameter("textbox2");
			String p03g = request.getParameter("p03s");
			String name3 = request.getParameter("name3");
			Date today3 = (Date) sdf.parse(request.getParameter("today3"));
			String textbox3 = request.getParameter("textbox3");
			String p04g = request.getParameter("p04s");
			String name4 = request.getParameter("name4");
			Date today4 = (Date) sdf.parse(request.getParameter("today4"));
			String textbox4 = request.getParameter("textbox4");
			String p05g = request.getParameter("p05s");
			String name5 = request.getParameter("name5");
			Date today5 = (Date) sdf.parse(request.getParameter("today5"));
			String textbox5 = request.getParameter("textbox5");
			String p06g = request.getParameter("p06s");
			String name6 = request.getParameter("name6");
			Date today6 = (Date) sdf.parse(request.getParameter("today6"));
			String textbox6 = request.getParameter("textbox6");
			
			String today00 = request.getParameter("today");
			String today01 = request.getParameter("today1");
			String today02 = request.getParameter("today2");
			String today03 = request.getParameter("today3");
			String today04 = request.getParameter("today4");
			String today05 = request.getParameter("today5");
			String today06 = request.getParameter("today6");
			
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/webapp","webapp","webapp");
			PreparedStatement st =  connection.prepareStatement("Insert INTO mst_food(iconNo,foodNo,expryDate,quantity) values (?,?,?,?)");
			
		
			
			List<String[]> list = new ArrayList<>();
			ResultSet result = st.executeQuery();
			while (result.next() == true) {

				if(name !="") {
					if(today00 != "") {
						if(textbox != "") {
							st.setString(0, p00g);
							st.setString(1, name);
							st.setDate(2, today);
							st.setString(3, textbox);
							st.executeUpdate("Insert INTO mst_food(iconNo,foodNo,expryDate,quantity) values (?,?,?,?)");
							String[] a = new String[4];
							a[0] = p00g;
							a[1] = name;
							a[2] = today00;
							a[3] = textbox;
							
							list.add(a);
						}
					}
				}
				
				if(name1 !="") {
					if(today01 != "") {
						if(textbox1 != "") {
							st.setString(0, p01g);
							st.setString(1, name1);
							st.setDate(2, today1);
							st.setString(3, textbox1);
							st.executeUpdate("Insert INTO mst_food(iconNo,foodNo,expryDate,quantity) values (?,?,?,?)");
							String[] b = new String[4];
							b[0] = p01g;
							b[1] = name1;
							b[2] = today01;
							b[3] = textbox1;

							list.add(b);
						}
					}
				}
				
				if(name2 !="") {
					if(today02 != "") {
						if(textbox2 != "") {
							st.setString(0,p02g);
							st.setString(1, name2);
							st.setDate(2, today2);
							st.setString(3, textbox2);
							st.executeUpdate("Insert INTO mst_food(iconNo,foodNo,expryDate,quantity) values (?,?,?,?)");
							String[] c = new String[4];
							c[0] = p02g;
							c[1] = name2;
							c[2] = today02;
							c[3] = textbox2;

							list.add(c);
						}
					}
				}
				
				if(name3 !="") {
					if(today03 != "") {
						if(textbox3 != "") {
							st.setString(0, p03g);
							st.setString(1, name3);
							st.setDate(2, today3);
							st.setString(3, textbox3);
							st.executeUpdate("Insert INTO mst_food(iconNo,foodNo,expryDate,quantity) values (?,?,?,?)");
							String[] d = new String[4];
							d[0] = p03g;
							d[1] = name3;
							d[2] = today03;
							d[3] = textbox3;

							list.add(d);
						}
					}
				}
				
				if(name4 !="") {
					if(today04 != "") {
						if(textbox4 != "") {
							st.setString(0,p04g);
							st.setString(1, name4);
							st.setDate(2, today4);
							st.setString(3, textbox4);
							st.executeUpdate("Insert INTO mst_food(iconNo,foodNo,expryDate,quantity) values (?,?,?,?)");
							String[] e = new String[4];
							e[0] = p04g;
							e[1] = name4;
							e[2] = today04;
							e[3] = textbox4;

							list.add(e);
						}
					}
				}
				
				if(name5 !="") {
					if(today05 != "") {
						if(textbox5 != "") {
							st.setString(0, p05g);
							st.setString(1, name5);
							st.setDate(2, today5);
							st.setString(3, textbox5);
							st.executeUpdate("Insert INTO mst_food(iconNo,foodNo,expryDate,quantity) values (?,?,?,?)");
							String[] f = new String[4];
							f[0] = p05g;
							f[1] = name5;
							f[2] = today05;
							f[3] = textbox5;

							list.add(f);
						}
					}
				}
				
				if(name6 !="") {
					if(today06 != "") {
						if(textbox6 != "") {
							st.setString(0, p06g);
							st.setString(1, name6);
							st.setDate(2, today6);
							st.setString(3, textbox6);
							st.executeUpdate("Insert INTO mst_food(iconNo,foodNo,expryDate,quantity) values (?,?,?,?)");
							String[] g = new String[4];
							g[0] = p06g;
							g[1] = name6;
							g[2] = today06;
							g[3] = textbox6;

							list.add(g);
						}
					}
				}
				
				
			}
			
			
			
			request.setAttribute("list", list);
			request.getRequestDispatcher("/WEB-INF/jsp/tourokukakuninn.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}catch (Exception e) {
			
		}
	}

}
	