package jp.ac.ohara.fgroup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradesReferenceController {
	@GetMapping("/gradesreferencelist")
    public String index() {
        return "gradesreferencelist";
    }
}
