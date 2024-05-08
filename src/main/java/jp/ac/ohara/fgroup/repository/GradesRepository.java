package jp.ac.ohara.fgroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.fgroup.model.GradesModel;

@Repository
public interface GradesRepository extends JpaRepository<GradesModel, Long> {
   
}
