package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model_pengunjung.pengunjung;
import model_pengunjung.pengunjungHome;

public final class addPengunjung_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String uname = request.getParameter("username");
    String password = request.getParameter("password");
    String nama = request.getParameter("nama");
    String alamat = request.getParameter("alamat");
    String email = request.getParameter("email");
    String nohp = request.getParameter("nohp");

    pengunjung pgj = new pengunjung();
    pgj.setUname(uname);
    pgj.setPassword(password);
    pgj.setAlamat(alamat);
    pgj.setNama(nama);
    pgj.setEmail(email);
    pgj.setNohp(nohp);

    pengunjungHome pengunjungBean = new pengunjungHome();
    request.setAttribute("dataPgj", pgj);

    if (pengunjungBean.create(pgj) == true) {
        
      out.write("\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("success.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");

    } else {
        
      out.write("\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("fail.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");

    }

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
