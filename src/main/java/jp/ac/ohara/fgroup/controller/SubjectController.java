package jp.ac.ohara.fgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	    public String addSubject(@Validated @ModelAttribute SubjectModel subject, BindingResult result,
	                           RedirectAttributes redirectAttributes) {
	        if (result.hasErrors()) {
	            // バリデーションエラーがある場合の処理
	            return "subject"; // エラーがある場合は元のフォームに戻る
	        }

	        try {
	            this.subjectService.save(subject);
	            redirectAttributes.addFlashAttribute("exception", "");
	        } catch (Exception e) {
	            redirectAttributes.addFlashAttribute("exception", e.getMessage());
	        }
	        return "redirect:/subjectsuccess";
	    }
	 @PostMapping("/subject/delete/{id}")
	    public String deleteSubject(@PathVariable Long id) {
	        subjectService.delete(id);
	        return "redirect:/subjectlist";
	    }
}
