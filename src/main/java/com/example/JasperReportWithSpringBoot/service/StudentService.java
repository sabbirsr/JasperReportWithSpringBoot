package com.example.JasperReportWithSpringBoot.service;

import com.example.JasperReportWithSpringBoot.model.Student;
import com.example.JasperReportWithSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service("studentService")
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Map<String, Object>> report() {

        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();

        for (Student student : studentRepository.findAll()) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("id", student.getId());
            item.put("name", student.getName());
            item.put("email", student.getEmail());
            item.put("batch", student.getBatch());
            item.put("date", student.getDate());
            result.add(item);
        }
        return result;
    }

    public List<Map<String, Object>> generateReport(Student student) {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();


        Map<String, Object> item = new HashMap<String, Object>();
        item.put("id", student.getId());
        item.put("name", student.getName());
        item.put("email", student.getEmail());
        item.put("batch", student.getBatch());
        item.put("date", student.getDate());
        result.add(item);

        return result;
    }

    public List<Map<String, Object>> generateReportByDate(Date date) {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();

        for (Student student : studentRepository.findAllByDate(date)) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("id", student.getId());
            item.put("name", student.getName());
            item.put("email", student.getEmail());
            item.put("batch", student.getBatch());
            item.put("date", student.getDate());
            result.add(item);
        }
        return result;
    }
}
