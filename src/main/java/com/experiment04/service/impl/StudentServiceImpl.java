package com.experiment04.service.impl;

import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;
import com.experiment04.service.StudentService;

import java.util.*;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> addStudent(Student student) {
        DatabaseUtils.listStudents().add(student);
        return DatabaseUtils.listStudents();
    }

    @Override
    public List<Student> listStudentsByYear(int year) {
        return DatabaseUtils.listStudents()
                .stream()
                .filter(a -> year == a.getYear())
                .toList();

    }

    @Override
    public List<String> listStudentsNames(int year, Student.Sex sex) {
        List<String> studentNames = DatabaseUtils.listStudents()
                .stream()
                .filter(a -> year == a.getYear())
                .filter(a -> sex == a.getSex())
                .map(Student ::getName)
                .toList();
        return studentNames;
    }

    @Override
    public List<Student> listStudentsByYearSortedById(int year) {
        return DatabaseUtils.listStudents()
                .stream()
                .filter(a -> year == a.getYear())
                .sorted(Comparator.comparing(Student ::getId).reversed())
                .toList();
    }

    @Override
    public Map<Student.Sex, List<Student>> listStudentsMapBySex() {
        Map<Student.Sex, List<Student>> sexListMap = DatabaseUtils.listStudents()
                .stream()
                .collect(Collectors.groupingBy(Student ::getSex));
        return sexListMap;
    }

    @Override
    public Map<Integer, Student> listStudentsByYearMapById(int year) {
        List<Student> students = DatabaseUtils.listStudents()
                .stream()
                .filter(a -> year == a.getYear())
                .toList();
        Map<Integer, Student> idLidtMap = students
                .stream()
                .collect(Collectors.toMap(Student ::getId, a -> a,(k1, k2) -> k1));

        return idLidtMap;
    }

    @Override
    public boolean removeStudent(int id) {
        List<Student> students = DatabaseUtils.listStudents();
        int flag = 0;
        Iterator<Student> studentIterator = students.iterator();
        while(studentIterator.hasNext()) {
            Student s = studentIterator.next();
            if(id == s.getId()) {
                studentIterator.remove();
                flag = 1;
            }
        }
        if(flag == 0) {
            return false;
        } else {
            return  true;
        }
    }
}
