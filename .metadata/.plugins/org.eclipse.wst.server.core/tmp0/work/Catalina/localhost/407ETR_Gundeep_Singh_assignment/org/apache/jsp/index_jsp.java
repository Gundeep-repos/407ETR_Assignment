/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.6
 * Generated at: 2021-07-04 18:42:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<script src=\"jquery-1.12.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>407 ETR Systems</title>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function fetchCD(){\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tvar startingReference = document.getElementById(\"startingPoint\").value;\r\n");
      out.write("\tvar destinationReference = document.getElementById(\"destinationPoint\").value;\r\n");
      out.write("\tvar xhr = new XMLHttpRequest;\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("    xhr.open(\"GET\", \"./ServiceClass?start=\"+startingReference+\"&end=\"+destinationReference, true);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    //for response receiving\r\n");
      out.write("    xhr.onreadystatechange = function ()\r\n");
      out.write("    {\r\n");
      out.write("    \t\r\n");
      out.write("    \tif(xhr.readyState == 4 && xhr.status == 200){\r\n");
      out.write("    \t\tvar res = xhr.responseText.trim();\r\n");
      out.write("                \r\n");
      out.write("                console.log(res);                \r\n");
      out.write("\r\n");
      out.write("                var mainObj = JSON.parse(res);\r\n");
      out.write("                \r\n");
      out.write("                if(mainObj[\"status\"] == \"null\"){\r\n");
      out.write("                \talert(\"Start Destination and End Destination should have some value\");\r\n");
      out.write("                }else if(mainObj[\"status\"] == \"fail\"){\r\n");
      out.write("                \talert(\"Incorrect Spellings for either Start/ End Destination\");\r\n");
      out.write("                }else if(mainObj[\"status\"] == \"success\"){\r\n");
      out.write("                \tdocument.getElementById(\"distance\").innerHTML=mainObj[\"tripDistance\"]+\" kms\";\r\n");
      out.write("                    document.getElementById(\"cost\").innerHTML=mainObj[\"costOfTrip\"]+\" CAD\";\t\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("    \t}\r\n");
      out.write("       \r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    \txhr.send(\"Sent dete\");\r\n");
      out.write("\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div style=\"center\">\r\n");
      out.write("<table class=\"table table-bordered table-striped\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Enter the Starting Point</th>\r\n");
      out.write("<th>Enter the Destination Point</th>\r\n");
      out.write("<th>Distance</th>\r\n");
      out.write("<th>Cost</th>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td><input type=\"text\" id=\"startingPoint\"/></td>\r\n");
      out.write("<td><input type=\"text\" id=\"destinationPoint\"/></td>\r\n");
      out.write("<td id = \"distance\"></td>\r\n");
      out.write("<td id = \"cost\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<center><button style=\"color: blueviolet\" class=\"btn btn-largs\" onclick=\"fetchCD()\">Get Cost</button></center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
