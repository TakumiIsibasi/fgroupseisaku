package jp.ac.ohara.fgroup.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.fgroup.model.SubjectModel;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectModel, Long> {
    SubjectModel findByCd(String subjectCd);
//    List<SubjectModel> findBySchoolCd(String schoolCd);
}
