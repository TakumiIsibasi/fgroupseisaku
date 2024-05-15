package jp.ac.ohara.fgroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.fgroup.model.TeacherModel;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherModel, Long> {
	
}
