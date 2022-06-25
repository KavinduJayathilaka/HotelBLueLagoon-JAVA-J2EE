package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\"font-size: 16px\">\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"keywords\" content=\"Blue Lagoon\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"page_type\" content=\"np-template-header-footer-from-plugin\" />\n");
      out.write("    <title>Home</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/adminhomepage.css\" media=\"screen\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/adminhome.css\" media=\"screen\" />\n");
      out.write("   <script type=\"application/ld+json\">{\n");
      out.write("\t\t\"@context\": \"http://schema.org\",\n");
      out.write("\t\t\"@type\": \"Organization\",\n");
      out.write("\t\t\"name\": \"\"\n");
      out.write("}</script>\n");
      out.write("    <meta name=\"theme-color\" content=\"#478ac9\">\n");
      out.write("    <meta property=\"og:title\" content=\"Home\">\n");
      out.write("    <meta property=\"og:type\" content=\"website\">\n");
      out.write("  </head>\n");
      out.write("  <body class=\"u-body\">\n");
      out.write("    <section class=\"u-align-center u-clearfix u-gradient u-valign-middle u-section-1\" src=\"\" id=\"sec-c8fb\">\n");
      out.write("      <div class=\"u-expanded-width u-opacity u-opacity-10 u-palette-1-base u-shape u-shape-rectangle u-shape-1\"></div>\n");
      out.write("      <h3 class=\"u-align-right u-text u-text-palette-1-dark-2 u-text-1\" data-animation-name=\"slideIn\" data-animation-duration=\"1000\" data-animation-direction=\"Right\"><span class=\"u-file-icon u-icon u-text-palette-1-dark-3 u-icon-1\"><img src=\"img/1.png\" alt=\"\"></span>&nbsp;Admin panel\n");
      out.write("      </h3>\n");
      out.write("      <h1 class=\"u-text u-text-default u-text-2\" data-animation-name=\"slideIn\" data-animation-duration=\"1000\" data-animation-direction=\"Down\">\n");
      out.write("        <span class=\"u-text-palette-1-base\">Blue</span> Lagoon\n");
      out.write("      </h1>\n");
      out.write("      <a href=\"./AdminLogOutServlet\" class=\"u-border-1 u-border-active-palette-2-base u-border-hover-palette-1-base u-btn u-button-style u-none u-text-palette-1-base u-btn-1\" data-animation-name=\"slideIn\" data-animation-duration=\"1000\" data-animation-direction=\"Up\">Sign Out</a>\n");
      out.write("      <img class=\"u-expanded-width u-image u-image-1\" src=\"img/bef2f48b210a4a60e973dd46b01a8d177c9e9d2c914a87dbb5029892bd0928a39567a6daa15a171acb831d484f211ad7fbab0f8e3a513ffaaeb29c_12801.jpg\" data-image-width=\"1280\" data-image-height=\"853\" data-animation-name=\"fadeIn\" data-animation-duration=\"1000\" data-animation-direction=\"\">\n");
      out.write("      <a href=\"./ViewBookingServlet\" class=\"u-border-1 u-border-palette-1-light-1 u-btn u-btn-round u-button-style u-palette-1-light-3 u-radius-3 u-text-palette-1-dark-2 u-btn-2\" data-animation-name=\"fadeIn\" data-animation-duration=\"1000\" data-animation-direction=\"Up\">View Booking details</a>\n");
      out.write("    </section>\n");
      out.write("    <footer class=\"u-clearfix u-footer u-palette-1-light-1\" id=\"sec-d2e9\"><div class=\"u-align-left u-clearfix u-sheet u-sheet-1\"></div></footer>\n");
      out.write("    <section class=\"u-backlink u-clearfix u-grey-80\">\n");
      out.write("      <a class=\"u-link\" href=\"#\" target=\"_blank\">\n");
      out.write("        <span></span>\n");
      out.write("      </a>\n");
      out.write("      <p class=\"u-text\">\n");
      out.write("        <span></span>\n");
      out.write("      </p>\n");
      out.write("      <a class=\"u-link\" href=\"\" target=\"_blank\">\n");
      out.write("        <span></span>\n");
      out.write("      </a>\n");
      out.write("    </section>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
