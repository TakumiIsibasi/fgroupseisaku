package jp.ac.ohara.fgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.ac.ohara.fgroup.service.SubjectService;

@Controller
public class SubjectListController {

	@Autowired
    private SubjectService subjectService;

    @GetMapping("/subjectlist")
    public String index(Model model) {
        model.addAttribute("subjectList", subjectService.getSubjectList());
        return "subjectlist";
    }
}
