package jp.ac.ohara.fgroup.model;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "teacher")
public class TeacherModel implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tid")
    private Long tid;

    @Column(name = "id", length = 10, nullable = false)
    private String ID;

    @Column(name = "password", length = 256, nullable = true)
    private String password;

    @Column(name = "teacher_name", length = 10, nullable = true)
    private String teacherName;
    
    @Column(name = "school_cd", length = 3, nullable = true)
    private String schoolCd;
    
    /*
    
    権限を返す*/
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
           Collection<GrantedAuthority> authorityList = new ArrayList<>();
           return authorityList;}

          /*

             
    ログイン時に使用するユーザ名を返す
    @return メールアドレス*/
    @Override
    public String getUsername() {
           return ID.toString();
           } // 今回はemailにしているが、userNameでも良い}

            /*
             
    有効期限のチェック
    @return true:有効/false:無効*/@Override
        public boolean isAccountNonExpired() {
            return true;
            }

            /*
             
    アカウントのロック状態
    @return true:有効/false:無効*/@Override
        public boolean isAccountNonLocked() {
            return true;
            }
    
        @Override
        public boolean isCredentialsNonExpired() {// TODO 自動生成されたメソッド・スタブ
            return true;
            }
        
        @Override
        public boolean isEnabled() {// TODO 自動生成されたメソッド・スタブ
            return true;
            }
        
        @Override
        public String getPassword() {// TODO 自動生成されたメソッド・スタブ
            return this.password;
        }
        
        public String getSchoolCd() {
            return this.schoolCd;
        }

}
