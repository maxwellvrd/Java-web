package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Contato;

/**
 * Servlet implementation class ServletContato
 */
@WebServlet({ "/enviar", "/buscar" })
public class ServletContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContato() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	/*	doGet(request, response); */
	
		Contato c1 = new Contato();
		c1.setNome(request.getParameter("nome"));
		c1.setEmail(request.getParameter("email"));
		c1.setTelefone(request.getParameter("telefone"));
		
		request.setAttribute("contato",c1);
		request.getRequestDispatcher("dados.jsp").forward(request, response);
	
	}

}
