package jp.ac.ohara.fgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jp.ac.ohara.fgroup.model.TestModel;
import jp.ac.ohara.fgroup.repository.TestRepository;

@Service
@Transactional
public class TestService {

    @Autowired
    private TestRepository repository;

    public List<TestModel> getGradesList() {
        return repository.findAll();
    }

    public TestModel get(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void save(TestModel grades) {
        repository.save(grades);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
