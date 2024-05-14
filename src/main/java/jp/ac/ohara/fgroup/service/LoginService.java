package jp.ac.ohara.fgroup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jp.ac.ohara.fgroup.model.TeacherModel;
import jp.ac.ohara.fgroup.repository.LoginRepository;

@Service
public class LoginService implements UserDetailsService {

    @Autowired
    private LoginRepository loginRepository; // 修正: フィールド名を小文字で開始

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        System.out.println("serach name : " + id);
        TeacherModel user = loginRepository.findByIDEquals(id); // IDで検索
        if (user == null) {
            throw new UsernameNotFoundException("User not found with id: " + id);
        }
        System.out.println(user.toString());
        return user;
    }
}
