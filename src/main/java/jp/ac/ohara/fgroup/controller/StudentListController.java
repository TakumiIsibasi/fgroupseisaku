package jp.ac.ohara.fgroup.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.ac.ohara.fgroup.model.StudentModel;
import jp.ac.ohara.fgroup.service.StudentService;

@Controller
public class StudentListController {
    
    @Autowired
    private StudentService studentService;
    
    @GetMapping("/studentlist/")
    public String index(Model model,
                        @RequestParam(required = false) Integer entYear,
                        @RequestParam(required = false) String classNum,
                        @RequestParam(required = false) Boolean isAttend) {
        
        // 全ての学生情報を取得
        List<StudentModel> allStudents = studentService.getStudentList();

        // 絞り込み条件
        List<StudentModel> filteredStudents = allStudents.stream()
                .filter(student -> (entYear == null || student.getEnt_year().equals(entYear)))
                .filter(student -> (classNum == null || classNum.equals("") || student.getClass_num().equals(classNum)))
                .filter(student -> (isAttend == null || student.getIs_attend() == null || student.getIs_attend().equals(isAttend)))
                .collect(Collectors.toList());

        model.addAttribute("filteredStudentList", filteredStudents);
        model.addAttribute("entYear", entYear);
        model.addAttribute("classNum", classNum);
        model.addAttribute("isAttend", isAttend);

        return "studentList";
    }
}
