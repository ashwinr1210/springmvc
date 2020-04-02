import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/controllerclass")
public class AddController {
	@RequestMapping("/add")
	public String add(HttpServletRequest request,HttpServletResponse response) {
        int i=Integer.parseInt(request.getParameter(number1));
        int j=Integer.parseInt(request.getParameter(number2));
        int k=i+j;
         ModelAndView mv=new ModelAndView();
         mv.setViewName("display.jsp");
         mv.addObject("result", k);
		return display.jsp;
	}
	
	
	@RequestMapping("/test.do")
	@ResponseBody
	public String test() {
       
		return "success";
	}
}
