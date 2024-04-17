package jp.ac.ohara.fgroup.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class StudentModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "no", length = 10, nullable = false)
    private String no;

    @Column(name = "name", length = 10)
    private String name;
    
    @Column(name = "ent_year")
    private Integer ent_year;
    
    @Column(name = "class_num", length = 3)
    private String class_num;
    
    @Column(name = "is_attend" , nullable = true)
    private Boolean is_attend;
    
    @Column(name = "school_cd", length = 3)
    private String school_cd;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnt_year() {
        return ent_year;
    }

    public void setEnt_year(Integer ent_year) {
        this.ent_year = ent_year;
    }

    public String getClass_num() {
        return class_num;
    }

    public void setClass_num(String class_num) {
        this.class_num = class_num;
    }

    public Boolean getIs_attend() {
        return is_attend;
    }

    public void setIs_attend(Boolean is_attend) {
        this.is_attend = is_attend;
    }

    public String getSchool_cd() {
        return school_cd;
    }

    public void setSchool_cd(String school_cd) {
        this.school_cd = school_cd;
    }
}
