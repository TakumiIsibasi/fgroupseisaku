package jp.ac.ohara.fgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.ac.ohara.fgroup.model.SubjectModel;
import jp.ac.ohara.fgroup.service.SubjectService;

@Controller
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subject")
    public ModelAndView showAddForm(ModelAndView model) {
        model.addObject("subject", new SubjectModel());
        model.setViewName("subject");
        return model;
    }

    @PostMapping("/subject")
    public String addSubject(@Validated @ModelAttribute("subject") SubjectModel subject, BindingResult bindingResult, 
    		RedirectAttributes redirectAttributes) {
       try {
           if (subjectService.isSubjectCodeUnique(subject.getCd())) {
        	   subjectService.save(subject);
        	   redirectAttributes.addFlashAttribute("exception", "");
           } else {
               bindingResult.rejectValue("cd", "duplicate.student.code", "科目コードが重複しています");
               return "subject";
           }
       } catch (Exception e) {
           redirectAttributes.addFlashAttribute("exception", e.getMessage()); // Add error message
       }
       return "redirect:/subjectsuccess";
    }

    @GetMapping("/subjectsuccess")
    public String showSuccessPage() {
        return "subjectsuccess";
    }
}
