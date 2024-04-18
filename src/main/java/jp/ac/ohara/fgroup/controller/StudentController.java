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
    public ModelAndView showAddForm(ModelAndView model) {
        model.addObject("student", new StudentModel());
        model.setViewName("student");
        return model;
    }

    @PostMapping("/student")
    public String addStudent(@Validated @ModelAttribute("student") StudentModel student, RedirectAttributes redirectAttributes) {
        try {
            studentService.save(student);
            redirectAttributes.addFlashAttribute("exception", "");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("exception", e.getMessage());
        }
        return "redirect:/studentsuccess";
    }

    @GetMapping("/studentsuccess")
    public String showSuccessPage() {
        return "studentsuccess";
    }
}
