/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mobiid.poc;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Maciek
 */
public class Servlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("hello");
        String parameter = request.getParameter("tagID");
        System.out.println(parameter);
        try {
            response.getOutputStream().write("hej".getBytes());
        } catch (IOException ex) {
            Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String parameter = request.getParameter("tagID");
        System.out.println("tagID : " + parameter);

        if (parameter != null) {
            if (parameter.equals("aaa")) {
                try {
                    String smsTo = "sms:607426210?body=czesc";
                    response.getOutputStream().write(getHtmlCode(smsTo).getBytes());
                } catch (IOException ex) {
                    Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (parameter.equals("bbb")) {
                try {
                    String mailTo = "mailto:maciek@nowak.net.pl?subject=aaa";
                    response.getOutputStream().write(getHtmlCode(mailTo).getBytes());
                } catch (IOException ex) {
                    Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else if (parameter.equals("ccc")) {
                try {
                    String mailTo = "tel:607426210";
                    response.getOutputStream().write(getHtmlCode(mailTo).getBytes());
                } catch (IOException ex) {
                    Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            try {
                response.sendRedirect("http://www.mobi-id.pl");
            } catch (IOException ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//        try {
//            response.getOutputStream().write("hej hej".getBytes());
//            
//            
//            
//        } catch (IOException ex) {
//            Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    private String getHtmlCode(String link) {
        String htmlCode = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "    <body>\n"
                + "        <script>  \n"
                + "            function happycode() {\n"
                + "                window.location.href = \"%s\";\n"
                + "            }  \n"
                + "          window.onload = happycode;\n"
                + "        </script>\n"
                + "    </body>\n"
                + "</html>\n"
                + "";

        return String.format(htmlCode, link);
    }

}
