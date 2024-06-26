package jp.ac.ohara.fgroup.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.fgroup.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {
    StudentModel findByNo(String studentNumber);

//	List<StudentModel> findBySchoolCd(String schoolCd);
}
