// SubjectService.java
package jp.ac.ohara.fgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.ac.ohara.fgroup.model.SubjectModel;
import jp.ac.ohara.fgroup.repository.SubjectRepository;

@Service
@Transactional
public class SubjectService {

    @Autowired
    private SubjectRepository repository;

    public List<SubjectModel> getSubjectList() {
        return repository.findAll();
    }

    public SubjectModel get(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void save(SubjectModel subject) {
        repository.save(subject);
    }

    public void delete(SubjectModel subject) {
        repository.delete(subject);
    }
}
