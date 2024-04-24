package jp.ac.ohara.fgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.ac.ohara.fgroup.model.SubjectModel;
import jp.ac.ohara.fgroup.service.SubjectService;

@Controller
public class SubjectUpdateController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subjectupdate")
    public String getUpdatePage(@RequestParam("id") Long id, Model model) {
    	SubjectModel subject = subjectService.get(id);
        model.addAttribute("subject", subject);
        return "subjectupdate";
    }

    @PostMapping("/subjectupdate")
    public String updateSubject(SubjectModel subject) {
    	subjectService.save(subject);
        return "redirect:/subjectupdatesuccess";
    }

    @GetMapping("/subjectupdatesuccess")
    public String showSuccessPage() {
        return "subjectupdatesuccess";
    }
}
