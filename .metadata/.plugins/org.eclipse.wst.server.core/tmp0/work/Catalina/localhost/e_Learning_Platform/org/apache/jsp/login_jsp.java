/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.33
 * Generated at: 2024-12-03 05:25:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"utf-8\">\r\n");
      out.write("	<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("	  <title>E-Learning Platform</title>\r\n");
      out.write("	  <meta name=\"description\" content=\"\">\r\n");
      out.write("	  <meta name=\"keywords\" content=\"\">\r\n");
      out.write("	\r\n");
      out.write("	  <!-- Favicons -->\r\n");
      out.write("	  <link href=\"assets/img/favicon.png\" rel=\"icon\">\r\n");
      out.write("	  <link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\r\n");
      out.write("	\r\n");
      out.write("	  <!-- Fonts -->\r\n");
      out.write("	  <link href=\"https://fonts.googleapis.com\" rel=\"preconnect\">\r\n");
      out.write("	  <link href=\"https://fonts.gstatic.com\" rel=\"preconnect\" crossorigin>\r\n");
      out.write("	  <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Raleway:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("	\r\n");
      out.write("	  <!-- Vendor CSS Files -->\r\n");
      out.write("	  <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("	  <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("	  <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\r\n");
      out.write("	  <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\r\n");
      out.write("	  <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\r\n");
      out.write("	\r\n");
      out.write("	  <!-- Main CSS File -->\r\n");
      out.write("	  <link href=\"assets/css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("      *{\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("      } \r\n");
      out.write("      #page-1{\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 100vh;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("        justify-content: center;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("      }\r\n");
      out.write("      .form {\r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("        display: block;\r\n");
      out.write("        padding: 1rem;\r\n");
      out.write("        max-width: 350px;\r\n");
      out.write("        border-radius: 0.5rem;\r\n");
      out.write("        box-shadow: 0 10px 15px -3px rgba(0, 0, 0, 0.1), 0 4px 6px -2px rgba(0, 0, 0, 0.05);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .form-title {\r\n");
      out.write("        font-size: 1.25rem;\r\n");
      out.write("        line-height: 1.75rem;\r\n");
      out.write("        font-weight: 600;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        color: #000;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .input-container {\r\n");
      out.write("        position: relative;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .input-container input, .form button {\r\n");
      out.write("        outline: none;\r\n");
      out.write("        border: 1px solid #e5e7eb;\r\n");
      out.write("        margin: 8px 0;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .input-container input {\r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("        padding: 1rem;\r\n");
      out.write("        padding-right: 3rem;\r\n");
      out.write("        font-size: 0.875rem;\r\n");
      out.write("        line-height: 1.25rem;\r\n");
      out.write("        width: 300px;\r\n");
      out.write("        border-radius: 0.5rem;\r\n");
      out.write("        box-shadow: 0 1px 2px 0 rgba(0, 0, 0, 0.05);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .submit {\r\n");
      out.write("        display: block;\r\n");
      out.write("        padding-top: 0.75rem;\r\n");
      out.write("        padding-bottom: 0.75rem;\r\n");
      out.write("        padding-left: 1.25rem;\r\n");
      out.write("        padding-right: 1.25rem;\r\n");
      out.write("        background-color: #4F46E5;\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("        font-size: 0.875rem;\r\n");
      out.write("        line-height: 1.25rem;\r\n");
      out.write("        font-weight: 500;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        border-radius: 0.5rem;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .signup-link {\r\n");
      out.write("        color: #6B7280;\r\n");
      out.write("        font-size: 0.875rem;\r\n");
      out.write("        line-height: 1.25rem;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .signup-link a {\r\n");
      out.write("        text-decoration: underline;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header id=\"header\" class=\"header d-flex align-items-center fixed-top\">\r\n");
      out.write("    <div class=\"container-fluid container-xl position-relative d-flex align-items-center justify-content-between\">\r\n");
      out.write("\r\n");
      out.write("      <a href=\"index.html\" class=\"logo d-flex align-items-center\">\r\n");
      out.write("        <!-- Uncomment the line below if you also wish to use an image logo -->\r\n");
      out.write("        <!-- <img src=\"assets/img/logo.png\" alt=\"\"> -->\r\n");
      out.write("        <h1 class=\"sitename\" style=\"color: black;\"  >eLearn</h1>\r\n");
      out.write("      </a>\r\n");
      out.write("\r\n");
      out.write("      <nav id=\"navmenu\" class=\"navmenu\" style=\"color: black;\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"#hero\" style=\"color: black;\"  >Home</a></li>\r\n");
      out.write("          <li><a href=\"#about\" style=\"color: black;\">Courses</a></li>\r\n");
      out.write("          <li><a href=\"#features\" style=\"color: black;\">Articles</a></li>\r\n");
      out.write("          <li><a href=\"#gallery\" style=\"color: black;\">Tutorials</a></li>\r\n");
      out.write("          <li><a href=\"#team\" style=\"color: black;\">Contact</a></li>\r\n");
      out.write("          <!-- \r\n");
      out.write("          <li><a href=\"#pricing\">Pricing</a></li>\r\n");
      out.write("          <li class=\"dropdown\"><a href=\"#\"><span>Dropdown</span> <i class=\"bi bi-chevron-down toggle-dropdown\"></i></a>\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"#\">Dropdown 1</a></li>\r\n");
      out.write("              <li class=\"dropdown\"><a href=\"#\"><span>Deep Dropdown</span> <i class=\"bi bi-chevron-down toggle-dropdown\"></i></a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                  <li><a href=\"#\">Deep Dropdown 1</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Deep Dropdown 2</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Deep Dropdown 3</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Deep Dropdown 4</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Deep Dropdown 5</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li><a href=\"#\">Dropdown 2</a></li>\r\n");
      out.write("              <li><a href=\"#\">Dropdown 3</a></li>\r\n");
      out.write("              <li><a href=\"#\">Dropdown 4</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("           -->\r\n");
      out.write("          <li><a href=\"login.jsp\" style=\"color: black;\" class=\"active\">LogIn/SignUp</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <i class=\"mobile-nav-toggle d-xl-none bi bi-list\"></i>\r\n");
      out.write("      </nav>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write("  <div class=\"page\" id=\"page-1\">\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
 String message = request.getParameter("message");
       if (message != null && message.equals("success")) { 
      out.write("\r\n");
      out.write("        <div class=\"alert alert-success\" role=\"alert\" style=\"max-width: 400px; margin: 20px auto; text-align: center; padding: 10px; background-color: #d4edda; color: #155724; border: 1px solid #c3e6cb; border-radius: 4px;\">\r\n");
      out.write("            Registration successful! Please login with your credentials.\r\n");
      out.write("        </div>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <form class=\"form\" id=\"loginForm\" onsubmit=\"return validateCaptcha()\" action=\"./LoginServlet\" method=\"post\">\r\n");
      out.write("       <p class=\"form-title\">Sign in to your account</p>\r\n");
      out.write("        <div class=\"input-container\">\r\n");
      out.write("          <input type=\"text\" name=\"userName\" placeholder=\"Enter username\" required>\r\n");
      out.write("          <span>\r\n");
      out.write("          </span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"input-container\">\r\n");
      out.write("          <input type=\"password\" name=\"password\" placeholder=\"Enter password\" required>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"input-container\">\r\n");
      out.write("          <div style=\"display: flex; justify-content: space-between; align-items: center; margin-bottom: 10px;\">\r\n");
      out.write("              <canvas id=\"captcha\" style=\"border: 1px solid #ddd; border-radius: 4px;\"></canvas>\r\n");
      out.write("              <button type=\"button\" onclick=\"generateCaptcha()\" style=\"padding: 5px 10px; background: #4F46E5; color: white; border: none; border-radius: 4px; cursor: pointer;\">\r\n");
      out.write("                  <i class=\"bi bi-arrow-clockwise\"></i> Refresh\r\n");
      out.write("              </button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <input type=\"text\" id=\"captchaInput\" placeholder=\"Enter CAPTCHA code\" required style=\"text-transform: uppercase;\">\r\n");
      out.write("          <div id=\"captchaError\" style=\"color: red; font-size: 12px; display: none;\">Invalid CAPTCHA code!</div>\r\n");
      out.write("      </div>\r\n");
      out.write("         <button type=\"submit\" class=\"submit\">\r\n");
      out.write("        Sign in\r\n");
      out.write("      </button>\r\n");
      out.write("\r\n");
      out.write("      <p class=\"signup-link\">\r\n");
      out.write("        No account?\r\n");
      out.write("        <a href=\"signup.jsp\">Sign up</a>\r\n");
      out.write("      </p>\r\n");
      out.write("   </form>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("let captchaText = '';\r\n");
      out.write("\r\n");
      out.write("function generateCaptcha() {\r\n");
      out.write("    const canvas = document.getElementById('captcha');\r\n");
      out.write("    const ctx = canvas.getContext('2d');\r\n");
      out.write("    canvas.height = 40;\r\n");
      out.write("    canvas.width = 150;\r\n");
      out.write("\r\n");
      out.write("    // Generate random string\r\n");
      out.write("    const chars = 'ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnpqrstuvwxyz23456789';\r\n");
      out.write("    captchaText = '';\r\n");
      out.write("    for(let i = 0; i < 6; i++) {\r\n");
      out.write("        captchaText += chars.charAt(Math.floor(Math.random() * chars.length));\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Clear canvas\r\n");
      out.write("    ctx.fillStyle = '#f0f0f0';\r\n");
      out.write("    ctx.fillRect(0, 0, canvas.width, canvas.height);\r\n");
      out.write("\r\n");
      out.write("    // Add noise\r\n");
      out.write("    for(let i = 0; i < 100; i++) {\r\n");
      out.write("        ctx.strokeStyle = '#' + Math.floor(Math.random()*16777215).toString(16);\r\n");
      out.write("        ctx.beginPath();\r\n");
      out.write("        ctx.moveTo(Math.random() * canvas.width, Math.random() * canvas.height);\r\n");
      out.write("        ctx.lineTo(Math.random() * canvas.width, Math.random() * canvas.height);\r\n");
      out.write("        ctx.stroke();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Draw captcha text\r\n");
      out.write("    ctx.font = '30px Arial';\r\n");
      out.write("    ctx.fillStyle = '#333';\r\n");
      out.write("    ctx.textAlign = 'center';\r\n");
      out.write("    ctx.textBaseline = 'middle';\r\n");
      out.write("    ctx.fillText(captchaText, canvas.width/2, canvas.height/2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function validateCaptcha() {\r\n");
      out.write("    const userInput = document.getElementById('captchaInput').value.trim();\r\n");
      out.write("    const errorDiv = document.getElementById('captchaError');\r\n");
      out.write("    \r\n");
      out.write("    if (userInput.toLowerCase() !== captchaText.toLowerCase()) {\r\n");
      out.write("        errorDiv.style.display = 'block';\r\n");
      out.write("        generateCaptcha();\r\n");
      out.write("        document.getElementById('captchaInput').value = '';\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    errorDiv.style.display = 'none';\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// Generate initial CAPTCHA when page loads\r\n");
      out.write("window.onload = generateCaptcha;\r\n");
      out.write("</script>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}