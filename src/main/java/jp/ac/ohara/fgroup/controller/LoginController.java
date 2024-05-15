package jp.ac.ohara.fgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jp.ac.ohara.fgroup.model.TeacherModel;
import jp.ac.ohara.fgroup.service.TeacherService;




@Controller
@RequestMapping("/")
public class LoginController {

    
    @Autowired
    private TeacherService  TeacherService;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    /**
     * ログイン画面へ遷移します.
     *
     * @return login.html
     */
    @RequestMapping(path = "/login")
 // 設定ファイルでログイン失敗時にはerror=tureを渡すようにしている。
//   ⇒コンソールに「ログインに失敗しました」と表示される。(ログイン成功時には何も表示されない。)
    public String showLogin(@RequestParam(required = false) String error, Model model) {
        model.addAttribute("teacherModel",new TeacherModel());
        System.err.println("login error:" + error);
        if (error != null) {
            System.err.println("ログインに失敗しました。");
        }
        return "login/login";
    }
    
    @GetMapping("/login")
    public ModelAndView in(TeacherModel teachermodel ,ModelAndView model) {
        model.addObject("login", teachermodel);
        model.setViewName("/login");
        return model;
    }
    
    @GetMapping("/logout")
    public ModelAndView logout(TeacherModel teachermodel ,ModelAndView model) {
        model.addObject("logout", teachermodel);
        model.setViewName("/logout");
        return model;
    }
}