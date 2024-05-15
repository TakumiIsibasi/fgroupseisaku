//package jp.ac.ohara.fgroup.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import jp.ac.ohara.fgroup.model.StudentModel;
//import jp.ac.ohara.fgroup.model.SubjectModel;
//import jp.ac.ohara.fgroup.model.TeacherModel;
//import jp.ac.ohara.fgroup.model.TestModel;
//import jp.ac.ohara.fgroup.service.StudentService;
//import jp.ac.ohara.fgroup.service.SubjectService;
//import jp.ac.ohara.fgroup.service.TestService;
//
//@Controller
//public class TestSearchController {
//	
//	@Autowired
//	private TestService testservice;
//	
//	@Autowired
//	private StudentService studentservice;
//	
//	@Autowired
//	private SubjectService subjectservice;
//	
//	@GetMapping("/testsearch")
//    public String index(@AuthenticationPrincipal TeacherModel teacher,Model model) {
//		String schoolCd = teacher.getSchoolCd();
//		List<StudentModel> student = studentservice.getAllStudent(schoolCd);
//		model.addAttribute("student",student);
//        
//        List<SubjectModel> subject = subjectservice.getAllSubject(schoolCd);
//        model.addAttribute("subject",subject);
//        
//        List<TestModel> test = testservice.getAllTest(schoolCd);
//        model.addAttribute("test",test);
//        
//        return "testsearch";
//        
//        
//        
//    }
//}

package jp.ac.ohara.fgroup.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TestSearchController {
	@GetMapping("/testsearch")
    public String index() {
        return "testsearch";
    }
}