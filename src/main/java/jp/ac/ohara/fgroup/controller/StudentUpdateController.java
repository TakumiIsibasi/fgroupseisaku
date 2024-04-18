package jp.ac.ohara.fgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.ac.ohara.fgroup.model.StudentModel;
import jp.ac.ohara.fgroup.service.StudentService;

@Controller
public class StudentUpdateController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/studentupdate")
    public String getUpdatePage(@RequestParam("id") Long id, Model model) {
        StudentModel student = studentService.get(id);
        model.addAttribute("student", student);
        return "studentupdate";
    }

    @PostMapping("/studentupdate")
    public String updateStudent(StudentModel student) {
        studentService.save(student);
        return "redirect:/studentupdatesuccess";
    }

    @GetMapping("/studentupdatesuccess")
    public String showSuccessPage() {
        return "studentupdatesuccess";
    }
}
