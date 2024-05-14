package jp.ac.ohara.fgroup.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "test")
public class TestModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "student_cd", length = 10, nullable = false)
    private String student_cd;

    @Column(name = "subject_cd", length = 3, nullable = false)
    private String subject_cd;

    @Column(name = "school_cd", length = 10, nullable = false)
    private String school_cd;

    @Column(name = "no", nullable = false)
    private Integer no;

    @Column(name = "point", length = 3)
    private String point;

    @Column(name = "subject_name", length = 20)
    private String subject_name;

    @Column(name = "class_num", length = 5)
    private String class_num;
}