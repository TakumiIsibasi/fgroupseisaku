package jp.ac.ohara.fgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.ac.ohara.fgroup.model.StudentModel;
import jp.ac.ohara.fgroup.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public ModelAndView add(StudentModel studentmodel, ModelAndView model) {
        model.addObject("student", studentmodel);
        model.setViewName("student");
        return model;
    }

    @PostMapping("/student")
    public String student(@Validated @ModelAttribute("student") StudentModel studentmodel, RedirectAttributes redirectAttributes) {
        try {
            studentService.save(studentmodel);
            redirectAttributes.addFlashAttribute("exception", "");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("exception", e.getMessage());
        }
        return "redirect:/studentsuccess";
    }
    

    @GetMapping("/studentsuccess")
    public String index() {
        return "studentsuccess";
    }
}
