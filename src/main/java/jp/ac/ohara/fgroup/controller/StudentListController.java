package jp.ac.ohara.fgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.ac.ohara.fgroup.service.StudentService;

@Controller
public class StudentListController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping("/studentlist/")
    public String index(Model model) {
        model.addAttribute("studentList", studentService.getStudentList());
        return "studentlist";
    }
}
