package jp.ac.ohara.fgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jp.ac.ohara.fgroup.model.GradesModel;
import jp.ac.ohara.fgroup.repository.GradesRepository;

@Service
@Transactional
public class GradesService {

    @Autowired
    private GradesRepository repository;

    public List<GradesModel> getGradesList() {
        return repository.findAll();
    }

    public GradesModel get(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void save(GradesModel grades) {
        repository.save(grades);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
