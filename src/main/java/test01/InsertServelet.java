package test01;

import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
		
		

		
		;


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.54.191/webapp","webapp","webapp");
			PreparedStatement st = connection.prepareStatement("insert into sub_food(foodNo,iconNo,foodName,expryDate,quantity) values (null,?,?,?,?)");
			
			
			
			String p00g = request.getParameter("p00s");
			String name = request.getParameter("name");
			String strDate = request.getParameter("today");
			java.sql.Date today = java.sql.Date.valueOf(strDate);
			int textbox = Integer.parseInt(request.getParameter("textbox"));
			
			///////////////////////////////////////////////////////////////////
			String p01g = request.getParameter("p01s");
			String name1 = request.getParameter("name1");
			String strDate1 = request.getParameter("today1");
		    java.sql.Date today1 = java.sql.Date.valueOf(strDate1);
			String textbox1 = request.getParameter("textbox1");
			
			String p02g = request.getParameter("p02s");
			String name2 = request.getParameter("name2");
			String strDate2 = request.getParameter("today2");
		    java.sql.Date today2 = java.sql.Date.valueOf(strDate2);
			String textbox2 = request.getParameter("textbox2");
			
			String p03g = request.getParameter("p03s");
			String name3 = request.getParameter("name3");
			String strDate3 = request.getParameter("today3");   
	        java.sql.Date today3 = java.sql.Date.valueOf(strDate3);
	        String textbox3 = request.getParameter("textbox3");
			
			String p04g = request.getParameter("p04s");
			String name4 = request.getParameter("name4");
			String strDate4 = request.getParameter("today4");  
	        java.sql.Date today4 = java.sql.Date.valueOf(strDate4);
	        String textbox4 = request.getParameter("textbox4");
			
			String p05g = request.getParameter("p05s");
			String name5 = request.getParameter("name5");
			String strDate5 = request.getParameter("today5");
		    java.sql.Date today5 = java.sql.Date.valueOf(strDate5);
		    String textbox5 = request.getParameter("textbox5");
		    
			String p06g = request.getParameter("p06s");
			String name6 = request.getParameter("name6");
			String strDate6 = request.getParameter("today6");
		    java.sql.Date today6 = java.sql.Date.valueOf(strDate6);
		    String textbox6 = request.getParameter("textbox6");
			
			String p07g = request.getParameter("p07s");
			String name7 = request.getParameter("name7");
			String strDate7 = request.getParameter("today7");
		    java.sql.Date today7 = java.sql.Date.valueOf(strDate7);
			String textbox7 = request.getParameter("textbox7");
			
			////////////////////////////////////////////////////////////
			
			String textbox00 = request.getParameter("textbox");
			String textbox01 = request.getParameter("textbox1");
			String textbox02 = request.getParameter("textbox2");
			String textbox03 = request.getParameter("textbox3");
			String textbox04 = request.getParameter("textbox4");
			String textbox05 = request.getParameter("textbox5");
			String textbox06 = request.getParameter("textbox6");
			String textbox07 = request.getParameter("textbox7");
			
			
			
			
			////////////////////////////////////////////////////////////
			String today00 = request.getParameter("today");
			String today01 = request.getParameter("today1");
			String today02 = request.getParameter("today2");
			String today03 = request.getParameter("today3");
			String today04 = request.getParameter("today4");
			String today05 = request.getParameter("today5");
			String today06 = request.getParameter("today6");
			String today07 = request.getParameter("today7");
			
			
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/webapp","webapp","webapp");
			
			//PreparedStatement st =  connection.prepareStatement("Insert INTO mst_food(iconNo,foodNo,expryDate,quantity) values (?,?,?,?)");
			;
			
			
			
			List<String[]> list = new ArrayList<>();
			if(name !="") {
				if(today00 != "") {
					if(textbox00 != "") {

			
							st.setString(1, p00g);
							st.setString(2, name);
							st.setDate(3, today);
							st.setInt(4, textbox);
							st.executeUpdate();
							String[] a = new String[4];
							a[0] = p00g;
							a[1] = name;
							a[2] = today00;
							a[3] = textbox00;
							
							list.add(a);
					}
				}
			}
							if(name1 !="") {
								if(today01 != "") {
									if(textbox01 != "") {
				
							st.setString(1, p01g);
							st.setString(2, name1);
							st.setDate(3, today1);
							st.setString(4, textbox1);
							st.executeUpdate();
							String[] b = new String[4];
							b[0] = p01g;
							b[1] = name1;
							b[2] = today01;
							b[3] = textbox01;

							list.add(b);
									}
								}
							}
							if(name2 !="") {
								if(today02 != "") {
									if(textbox02 != "") {
				
							st.setString(1,p02g);
							st.setString(2, name2);
							st.setDate(3, today2);
							st.setString(4, textbox2);
							st.executeUpdate();
							String[] c = new String[4];
							c[0] = p02g;
							c[1] = name2;
							c[2] = today02;
							c[3] = textbox02;

							list.add(c);
									}
								}
							}
							if(name3 !="") {
								if(today03 != "") {
									if(textbox03 != "") {
				
				
							st.setString(1, p03g);
							st.setString(2, name3);
							st.setDate(3, today3);
							st.setString(4, textbox3);
							st.executeUpdate();
							String[] d = new String[4];
							d[0] = p03g;
							d[1] = name3;
							d[2] = today03;
							d[3] = textbox03;

							list.add(d);
									}
								}
							}
							if(name4 !="") {
								if(today04 != "") {
									if(textbox04 != "") {
				
				
							st.setString(1,p04g);
							st.setString(2, name4);
							st.setDate(3, today4);
							st.setString(4, textbox4);
							st.executeUpdate();
							String[] e = new String[4];
							e[0] = p04g;
							e[1] = name4;
							e[2] = today04;
							e[3] = textbox04;

							list.add(e);
									}
								}
							}
							if(name5 !="") {
								if(today05 != "") {
									if(textbox05 != "") {
							st.setString(1, p05g);
							st.setString(2, name5);
							st.setDate(3, today5);
							st.setString(4, textbox5);
							st.executeUpdate();
							String[] f = new String[4];
							f[0] = p05g;
							f[1] = name5;
							f[2] = today05;
							f[3] = textbox05;

							list.add(f);
									}
								}
							}
							if(name6 !="") {
								if(today06 != "") {
									if(textbox06 != "") {
							st.setString(1, p06g);
							st.setString(2, name6);
							st.setDate(3, today6);
							st.setString(4, textbox6);
							st.executeUpdate();
							String[] g = new String[4];
							g[0] = p06g;
							g[1] = name6;
							g[2] = today06;
							g[3] = textbox06;

							list.add(g);
									}
								}
							}
				
				if(name7 !="") {
					if(today07 != "") {
						if(textbox7 != "") {
							st.setString(1, p07g);
							st.setString(2, name7);
							st.setDate(3, today7);
							st.setString(4, textbox7);
							st.executeUpdate();
							String[] h = new String[4];
							h[0] = p07g;
							h[1] = name7;
							h[2] = today07;
							h[3] = textbox07;

							list.add(h);
						}
					}
				}
				
							st.close();
							connection.close();
							
				
			
			
			
			
			request.setAttribute("list", list);
			request.getRequestDispatcher("/WEB-INF/jsp/tourokukakuninn.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
	