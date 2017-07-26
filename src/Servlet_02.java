
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/Servlet_02")
public class Servlet_02 extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
      
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
         
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
 
        
         
        
 //       PrintWriter writer = response.getWriter();
         
    
        if(gender.equals("male")){
        	response.getWriter().append("Coders Lab wita pana " + name +"a");}
        else{
        	response.getWriter().append("Coders Lab wita panią "+ name);
        
    }
 
}
}