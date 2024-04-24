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
@Table(name = "subject")
public class SubjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "school_cd", length = 3, nullable = false, columnDefinition = "varchar default 'fko'")
    private String school_cd = "fko";

    @Column(name = "cd", length = 3, nullable = false)
    private String cd;

    @Column(name = "subject_name", length = 20)
    private String subject_name;

}
