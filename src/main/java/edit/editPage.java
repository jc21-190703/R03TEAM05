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
			
			result.next();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate1=new FoodDate();
			foodDate1.setIconNo(result.getString("iconNo"));
			foodDate1.setFoodName(result.getString("foodName"));
			foodDate1.setExpryDate(result.getString("expryDate"));
			foodDate1.setQuantity(result.getString("quantity"));
			result.next();
			foodDate1.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate2=new FoodDate();
			foodDate2.setIconNo(result.getString("iconNo"));
			foodDate2.setFoodName(result.getString("foodName"));
			foodDate2.setExpryDate(result.getString("expryDate"));
			foodDate2.setQuantity(result.getString("quantity"));
			result.next();
			foodDate2.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate3=new FoodDate();
			foodDate3.setIconNo(result.getString("iconNo"));
			foodDate3.setFoodName(result.getString("foodName"));
			foodDate3.setExpryDate(result.getString("expryDate"));
			foodDate3.setQuantity(result.getString("quantity"));
			result.next();
			foodDate3.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate4=new FoodDate();
			foodDate4.setIconNo(result.getString("iconNo"));
			foodDate4.setFoodName(result.getString("foodName"));
			foodDate4.setExpryDate(result.getString("expryDate"));
			foodDate4.setQuantity(result.getString("quantity"));
			result.next();
			foodDate4.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate5=new FoodDate();
			foodDate5.setIconNo(result.getString("iconNo"));
			foodDate5.setFoodName(result.getString("foodName"));
			foodDate5.setExpryDate(result.getString("expryDate"));
			foodDate5.setQuantity(result.getString("quantity"));
			result.next();
			foodDate5.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate6=new FoodDate();
			foodDate6.setIconNo(result.getString("iconNo"));
			foodDate6.setFoodName(result.getString("foodName"));
			foodDate6.setExpryDate(result.getString("expryDate"));
			foodDate6.setQuantity(result.getString("quantity"));
			result.next();
			foodDate6.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate7=new FoodDate();
			foodDate7.setIconNo(result.getString("iconNo"));
			foodDate7.setFoodName(result.getString("foodName"));
			foodDate7.setExpryDate(result.getString("expryDate"));
			foodDate7.setQuantity(result.getString("quantity"));
			result.next();
			foodDate7.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate8=new FoodDate();
			foodDate8.setIconNo(result.getString("iconNo"));
			foodDate8.setFoodName(result.getString("foodName"));
			foodDate8.setExpryDate(result.getString("expryDate"));
			foodDate8.setQuantity(result.getString("quantity"));
			result.next();
			foodDate8.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate9=new FoodDate();
			foodDate9.setIconNo(result.getString("iconNo"));
			foodDate9.setFoodName(result.getString("foodName"));
			foodDate9.setExpryDate(result.getString("expryDate"));
			foodDate9.setQuantity(result.getString("quantity"));
			result.next();
			foodDate9.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate10=new FoodDate();
			foodDate10.setIconNo(result.getString("iconNo"));
			foodDate10.setFoodName(result.getString("foodName"));
			foodDate10.setExpryDate(result.getString("expryDate"));
			foodDate10.setQuantity(result.getString("quantity"));
			result.next();
			foodDate10.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate11=new FoodDate();
			foodDate11.setIconNo(result.getString("iconNo"));
			foodDate11.setFoodName(result.getString("foodName"));
			foodDate11.setExpryDate(result.getString("expryDate"));
			foodDate11.setQuantity(result.getString("quantity"));
			result.next();
			foodDate11.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate12=new FoodDate();
			foodDate12.setIconNo(result.getString("iconNo"));
			foodDate12.setFoodName(result.getString("foodName"));
			foodDate12.setExpryDate(result.getString("expryDate"));
			foodDate12.setQuantity(result.getString("quantity"));
			result.next();
			foodDate12.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate13=new FoodDate();
			foodDate13.setIconNo(result.getString("iconNo"));
			foodDate13.setFoodName(result.getString("foodName"));
			foodDate13.setExpryDate(result.getString("expryDate"));
			foodDate13.setQuantity(result.getString("quantity"));
			result.next();
			foodDate13.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate14=new FoodDate();
			foodDate14.setIconNo(result.getString("iconNo"));
			foodDate14.setFoodName(result.getString("foodName"));
			foodDate14.setExpryDate(result.getString("expryDate"));
			foodDate14.setQuantity(result.getString("quantity"));
			result.next();
			foodDate14.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate15=new FoodDate();
			foodDate15.setIconNo(result.getString("iconNo"));
			foodDate15.setFoodName(result.getString("foodName"));
			foodDate15.setExpryDate(result.getString("expryDate"));
			foodDate15.setQuantity(result.getString("quantity"));
			result.next();
			foodDate15.print();
//-----------------------------------------------------------------------------------------------------------------------
			FoodDate foodDate16=new FoodDate();
			foodDate16.setIconNo(result.getString("iconNo"));
			foodDate16.setFoodName(result.getString("foodName"));
			foodDate16.setExpryDate(result.getString("expryDate"));
			foodDate16.setQuantity(result.getString("quantity"));
			result.next();
			foodDate16.print();
//-----------------------------------------------------------------------------------------------------------------------
			request.setAttribute("foodDate1", foodDate1);
			request.setAttribute("foodDate2", foodDate2);
			request.setAttribute("foodDate3", foodDate3);
			request.setAttribute("foodDate4", foodDate4);
			request.setAttribute("foodDate5", foodDate5);
			request.setAttribute("foodDate6", foodDate6);
			request.setAttribute("foodDate7", foodDate7);
			request.setAttribute("foodDate8", foodDate8);
			request.setAttribute("foodDate9", foodDate9);
			request.setAttribute("foodDate10", foodDate10);
			request.setAttribute("foodDate11", foodDate11);
			request.setAttribute("foodDate12", foodDate12);
			request.setAttribute("foodDate13", foodDate13);
			request.setAttribute("foodDate14", foodDate14);
			request.setAttribute("foodDate15", foodDate15);
			request.setAttribute("foodDate16", foodDate16);
			
			request.getRequestDispatcher("/WEB-INF/jsp/editPage.jsp")
			.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace(out);
		}
	}
}
