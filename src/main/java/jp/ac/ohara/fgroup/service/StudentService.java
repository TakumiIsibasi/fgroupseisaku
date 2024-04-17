package jp.ac.ohara.fgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jp.ac.ohara.fgroup.model.StudentModel;
import jp.ac.ohara.fgroup.repository.StudentRepository;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<StudentModel> getStudentList() {
        return repository.findAll();
    }

    public StudentModel get(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void save(StudentModel student) {
        repository.save(student);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}