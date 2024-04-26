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
public class SubjectDeleteController {
    
    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subjectdelete")
    public String showConfirmationPage(@RequestParam("id") Long id, Model model) {
        SubjectModel subject = subjectService.get(id);
        model.addAttribute("subject", subject);
        return "subjectdelete";
    }

    @PostMapping("/subjectdelete")
    public String deleteSubject(@RequestParam("id") Long id) {
        SubjectModel subject = subjectService.get(id);
        if (subject != null) {
            subjectService.delete(subject);
        }
        return "redirect:/subjectdeletesuccess";
    }
    
    @GetMapping("/subjectdeletesuccess")
    public String showSuccessPage() {
        return "subjectdeletesuccess";
    }
}
