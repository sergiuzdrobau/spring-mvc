package spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String hello(){

        return "hello-view";
    }

    @RequestMapping("ask-emp-details")
    public String askEmpDetails(Model model){

        model.addAttribute("employee", new Employee());
        return "ask-emp-detail-view";
    }

    @RequestMapping("show-emp-details")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return "ask-emp-detail-view";
        }else {

            return "show-emp-detail-view";
        }



    }
}
