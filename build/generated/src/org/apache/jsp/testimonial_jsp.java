package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testimonial_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>bluelagoon</title>\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("    <meta content=\"\" name=\"keywords\">\r\n");
      out.write("    <meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Web Fonts -->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&family=Montserrat:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">  \r\n");
      out.write("\r\n");
      out.write("    <!-- Icon Font Stylesheet -->\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Libraries Stylesheet -->\r\n");
      out.write("    <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Stylesheet -->\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container-xxl bg-white p-0\">\r\n");
      out.write("        <!-- Spinner Start -->\r\n");
      out.write("        <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\r\n");
      out.write("            <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem;\" role=\"status\">\r\n");
      out.write("                <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Spinner End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Header Start -->\r\n");
      out.write("        <div class=\"container-fluid bg-dark px-0\">\r\n");
      out.write("            <div class=\"row gx-0\">\r\n");
      out.write("                <div class=\"col-lg-3 bg-dark d-none d-lg-block\">\r\n");
      out.write("                    <a href=\"Home\" class=\"navbar-brand w-100 h-100 m-0 p-0 d-flex align-items-center justify-content-center\">\r\n");
      out.write("                        <h1 class=\"m-0 text-primary text-uppercase\">blue lagoon</h1>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-9\">\r\n");
      out.write("                    <div class=\"row gx-0 bg-white d-none d-lg-flex\">\r\n");
      out.write("                        <div class=\"col-lg-7 px-5 text-start\">\r\n");
      out.write("                            <div class=\"h-100 d-inline-flex align-items-center py-2 me-4\">\r\n");
      out.write("                                <i class=\"fa fa-envelope text-primary me-2\"></i>\r\n");
      out.write("                                <p class=\"mb-0\">bluelagoon@gmail.com</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"h-100 d-inline-flex align-items-center py-2\">\r\n");
      out.write("                                <i class=\"fa fa-phone-alt text-primary me-2\"></i>\r\n");
      out.write("                                <p class=\"mb-0\">+9411 345 6789</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-5 px-5 text-end\">\r\n");
      out.write("                           <div class=\"d-inline-flex align-items-center py-2\">\r\n");
      out.write("                  <a class=\"me-3\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                  <a class=\"me-3\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                  <a class=\"me-3\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                  <a class=\"me-3\" href=\"\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                  <a class=\"me-3\" href=\"\"><i class=\"\" ><b>Login</b></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark p-3 p-lg-0\">\r\n");
      out.write("                        <a href=\"index.html\" class=\"navbar-brand d-block d-lg-none\">\r\n");
      out.write("                            <h1 class=\"m-0 text-primary text-uppercase\">blue lagoon</h1>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\r\n");
      out.write("                            <div class=\"navbar-nav mr-auto py-0\">\r\n");
      out.write("                                <a href=\"Home\" class=\"nav-item nav-link\">Home</a>\r\n");
      out.write("                                <a href=\"About\" class=\"nav-item nav-link\">About</a>\r\n");
      out.write("                                <a href=\"Services\" class=\"nav-item nav-link\">Services</a>\r\n");
      out.write("                                <a href=\"Room\" class=\"nav-item nav-link\">Rooms</a>\r\n");
      out.write("                                <div class=\"nav-item dropdown\">\r\n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle active\" data-bs-toggle=\"dropdown\">Pages</a>\r\n");
      out.write("                                    <div class=\"dropdown-menu rounded-0 m-0\">\r\n");
      out.write("                                        <a href=\"Booking\" class=\"dropdown-item\">Booking</a>\r\n");
      out.write("                                        <a href=\"Team\" class=\"dropdown-item\">Our Team</a>\r\n");
      out.write("                                        <a href=\"Testimonial\" class=\"dropdown-item active\">Testimonial</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <a href=\"Contact\" class=\"nav-item nav-link\">Contact</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--<a href=\"https://htmlcodex.com/hotel-html-template-pro\" class=\"btn btn-primary rounded-0 py-4 px-md-5 d-none d-lg-block\">Premium Version<i class=\"fa fa-arrow-right ms-3\"></i></a>\r\n");
      out.write("                            --></div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Header End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Header Start -->\r\n");
      out.write("        <div class=\"container-fluid page-header mb-5 p-0\" style=\"background-image: url(img/carousel-1.jpg);\">\r\n");
      out.write("            <div class=\"container-fluid page-header-inner py-5\">\r\n");
      out.write("                <div class=\"container text-center pb-5\">\r\n");
      out.write("                    <h1 class=\"display-3 text-white mb-3 animated slideInDown\">Testimonial</h1>\r\n");
      out.write("                    <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                        <ol class=\"breadcrumb justify-content-center text-uppercase\">\r\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\">Pages</a></li>\r\n");
      out.write("                            <li class=\"breadcrumb-item text-white active\" aria-current=\"page\">Testimonial</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Page Header End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Booking Start -->\r\n");
      out.write("        <div class=\"container-fluid booking pb-5 wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"bg-white shadow\" style=\"padding: 35px;\">\r\n");
      out.write("                    <div class=\"row g-2\">\r\n");
      out.write("                        <div class=\"col-md-10\">\r\n");
      out.write("                            <div class=\"row g-2\">\r\n");
      out.write("                                <div class=\"col-md-3\">\r\n");
      out.write("                                    <div class=\"date\" id=\"date1\" data-target-input=\"nearest\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control datetimepicker-input\"\r\n");
      out.write("                                            placeholder=\"Check in\" data-target=\"#date1\" data-toggle=\"datetimepicker\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-3\">\r\n");
      out.write("                                    <div class=\"date\" id=\"date2\" data-target-input=\"nearest\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control datetimepicker-input\" placeholder=\"Check out\" data-target=\"#date2\" data-toggle=\"datetimepicker\"/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-3\">\r\n");
      out.write("                                    <select class=\"form-select\">\r\n");
      out.write("                                        <option selected>Adult</option>\r\n");
      out.write("                                        <option value=\"1\">Adult 1</option>\r\n");
      out.write("                                        <option value=\"2\">Adult 2</option>\r\n");
      out.write("                                        <option value=\"3\">Adult 3</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-3\">\r\n");
      out.write("                                    <select class=\"form-select\">\r\n");
      out.write("                                        <option selected>Child</option>\r\n");
      out.write("                                        <option value=\"1\">Child 1</option>\r\n");
      out.write("                                        <option value=\"2\">Child 2</option>\r\n");
      out.write("                                        <option value=\"3\">Child 3</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-2\">\r\n");
      out.write("                            <button class=\"btn btn-primary w-100\">Submit</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Booking End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Testimonial Start -->\r\n");
      out.write("        <div class=\"container-xxl testimonial mt-5 py-5 bg-dark wow zoomIn\" data-wow-delay=\"0.1s\" style=\"margin-bottom: 90px;\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"owl-carousel testimonial-carousel py-5\">\r\n");
      out.write("                    <div class=\"testimonial-item position-relative bg-white rounded overflow-hidden\">\r\n");
      out.write("                        <p>Tempor stet labore dolor clita stet diam amet ipsum dolor duo ipsum rebum stet dolor amet diam stet. Est stet ea lorem amet est kasd kasd et erat magna eos</p>\r\n");
      out.write("                        <div class=\"d-flex align-items-center\">\r\n");
      out.write("                            <img class=\"img-fluid flex-shrink-0 rounded\" src=\"img/testimonial-1.jpg\" style=\"width: 45px; height: 45px;\">\r\n");
      out.write("                            <div class=\"ps-3\">\r\n");
      out.write("                                <h6 class=\"fw-bold mb-1\">Client Name</h6>\r\n");
      out.write("                                <small>Profession</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <i class=\"fa fa-quote-right fa-3x text-primary position-absolute end-0 bottom-0 me-4 mb-n1\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"testimonial-item position-relative bg-white rounded overflow-hidden\">\r\n");
      out.write("                        <p>Tempor stet labore dolor clita stet diam amet ipsum dolor duo ipsum rebum stet dolor amet diam stet. Est stet ea lorem amet est kasd kasd et erat magna eos</p>\r\n");
      out.write("                        <div class=\"d-flex align-items-center\">\r\n");
      out.write("                            <img class=\"img-fluid flex-shrink-0 rounded\" src=\"img/testimonial-2.jpg\" style=\"width: 45px; height: 45px;\">\r\n");
      out.write("                            <div class=\"ps-3\">\r\n");
      out.write("                                <h6 class=\"fw-bold mb-1\">Client Name</h6>\r\n");
      out.write("                                <small>Profession</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <i class=\"fa fa-quote-right fa-3x text-primary position-absolute end-0 bottom-0 me-4 mb-n1\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"testimonial-item position-relative bg-white rounded overflow-hidden\">\r\n");
      out.write("                        <p>Tempor stet labore dolor clita stet diam amet ipsum dolor duo ipsum rebum stet dolor amet diam stet. Est stet ea lorem amet est kasd kasd et erat magna eos</p>\r\n");
      out.write("                        <div class=\"d-flex align-items-center\">\r\n");
      out.write("                            <img class=\"img-fluid flex-shrink-0 rounded\" src=\"img/testimonial-3.jpg\" style=\"width: 45px; height: 45px;\">\r\n");
      out.write("                            <div class=\"ps-3\">\r\n");
      out.write("                                <h6 class=\"fw-bold mb-1\">Client Name</h6>\r\n");
      out.write("                                <small>Profession</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <i class=\"fa fa-quote-right fa-3x text-primary position-absolute end-0 bottom-0 me-4 mb-n1\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Testimonial End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Newsletter Start -->\r\n");
      out.write("        <div class=\"container newsletter mt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("                <div class=\"col-lg-10 border rounded p-1\">\r\n");
      out.write("                    <div class=\"border rounded text-center p-1\">\r\n");
      out.write("                        <div class=\"bg-white rounded text-center p-5\">\r\n");
      out.write("                            <h4 class=\"mb-4\">Drop Your <span class=\"text-primary text-uppercase\">FeedBack !</span></h4>\r\n");
      out.write("                            <form action=\"./GetFeedbackServlet\" method=\"post\">\r\n");
      out.write("                            <div class=\"position-relative mx-auto\" style=\"max-width: 400px;\">\r\n");
      out.write("                                <input class=\"form-control w-100 py-3 ps-4 pe-5\" type=\"text\" placeholder=\"Share your feedback\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary py-2 px-3 position-absolute top-0 end-0 mt-2 me-2\">Submit</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Newsletter Start -->\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <!-- Footer Start -->\r\n");
      out.write("        <div class=\"container-fluid bg-dark text-light footer wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("            <div class=\"container pb-5\">\r\n");
      out.write("                <div class=\"row g-5\">\r\n");
      out.write("                    <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"bg-primary rounded p-4\">\r\n");
      out.write("                            <a href=\"index.html\"><h1 class=\"text-white text-uppercase mb-3\">blue lagoon</h1></a>\r\n");
      out.write("                            <p class=\"text-white mb-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\tNo matter where you choose to stay, we make sure you enjoy every minute of it. Be it the ocean, the forest or even the city, youâll be able to soak it all in, with your feet up, hands down!\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 col-lg-3\">\r\n");
      out.write("                        <h6 class=\"section-title text-start text-primary text-uppercase mb-4\">Contact</h6>\r\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>32 Ebenezer Pl, Negombo, Sri Lanka</p>\r\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+9411 345 6789</p>\r\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>bluelagoon@gmail.com</p>\r\n");
      out.write("                        <div class=\"d-flex pt-2\">\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-5 col-md-12\">\r\n");
      out.write("                        <div class=\"row gy-5 g-4\">\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <h6 class=\"section-title text-start text-primary text-uppercase mb-4\">Company</h6>\r\n");
      out.write("                                <a class=\"btn btn-link\" href=\"about.html\">About Us</a>\r\n");
      out.write("                                <a class=\"btn btn-link\" href=\"contact.html\">Contact Us</a>\r\n");
      out.write("                                <a class=\"btn btn-link\" href=\"\">Privacy Policy</a>\r\n");
      out.write("                                <a class=\"btn btn-link\" href=\"\">Terms & Condition</a>\r\n");
      out.write("                                <a class=\"btn btn-link\" href=\"\">Support</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <h6 class=\"section-title text-start text-primary text-uppercase mb-4\">Services</h6>\r\n");
      out.write("                                <a class=\"btn btn-link\" href=\"gallery/food/index.html\">Food & Restaurant</a>\r\n");
      out.write("                                <a class=\"btn btn-link\" href=\"gallery/spa/index.html\">Spa & Fitness</a>\r\n");
      out.write("                                <a class=\"btn btn-link\" href=\"gallery/sport/index.html\">Sports & Gaming</a>\r\n");
      out.write("                                <a class=\"btn btn-link\" href=\"gallery/event/index.html\">Event & Party</a>\r\n");
      out.write("                                <a class=\"btn btn-link\" href=\"gallery/gym/index.html\">GYM & Yoga</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"copyright\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\r\n");
      out.write("                            &copy; <a class=\"border-bottom\" href=\"#\">blue lagoon</a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!--/*** This template is free as long as you keep the footer authorâs credit link/attribution link/backlink. If you'd like to use the template without the footer authorâs credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\r\n");
      out.write("\t\t\t\t\t\t\tDesigned By <a class=\"border-bottom\" href=\"https://htmlcodex.com\">group 27</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-end\">\r\n");
      out.write("                            <div class=\"footer-menu\">\r\n");
      out.write("                                <a href=\"index.html\">Home</a>\r\n");
      out.write("                                <a href=\"\">Cookies</a>\r\n");
      out.write("                                <a href=\"\">Help</a>\r\n");
      out.write("                                <a href=\"\">FQAs</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Footer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Back to Top -->\r\n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- JavaScript Libraries -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/wow/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/counterup/counterup.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/tempusdominus/js/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/tempusdominus/js/moment-timezone.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Javascript -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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