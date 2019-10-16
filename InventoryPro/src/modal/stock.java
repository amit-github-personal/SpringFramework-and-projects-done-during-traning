package modal;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Bean;
import controller.MarketDao;

/**
 * Servlet implementation class stock
 */
@WebServlet("/stock")
public class stock extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stock() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int itemcode=Integer.valueOf(request.getParameter("t1"));
		String itemname=request.getParameter("t2");
		int quantity=Integer.valueOf(request.getParameter("t3"));
		int rate=Integer.valueOf(request.getParameter("t4"));
		int amount=Integer.valueOf(request.getParameter("t5"));
		String dop=request.getParameter("t6");
		
		Bean b=new Bean();
		
		b.setItem_n(itemname);
		b.setAmount(amount);
		b.setDate_o_p(dop);
		b.setItem_c(itemcode);
		b.setRate(rate);
		b.setQuantity(quantity);
		
		MarketDao md=new MarketDao();
		boolean flag=md.insert(b);
		
		if(flag)
		{
			response.sendRedirect("dataSuccess.jsp");
		}
		else
		{
			response.sendRedirect("dataFail.jsp");
		}
		
		
	}
}
