package jp.ac.ohara.fgroup.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.fgroup.model.TestModel;

@Repository
public interface TestRepository extends JpaRepository<TestModel, Long> {
//	List<TestModel> findBySchoolCd(String schoolCd);
  
}
