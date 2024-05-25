package com.experiment04;

import com.experiment04.entity.Student;
import com.experiment04.service.StudentService;
import com.experiment04.service.impl.StudentServiceImpl;
import com.experiment04.resource.DatabaseUtils;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //addStudentTest();
        //listStudentsByYearTest();
        //listStudentsNamesTest();
        //listStudentsByYearSortedByIdTest();
        //listStudentsMapBySexTest();
        //listStudentsByYearMapByIdTest();
        removeStudentTest();


    }
     private static final StudentService studentService = new StudentServiceImpl();
    private static void addStudentTest() {
        Student student1 = new Student(201008, Student.Sex.FEMALE, "赵芳芳", 2010);
        List<Student> students = studentService.addStudent(student1);
        students.forEach(i -> System.out.println("id:" + i.getId() + ",name:" + i.getName() + ",sex:" + i.getSex() + ",year:" + i.getYear()));
    }
    private static void listStudentsByYearTest() {
        List<Student> students = studentService.listStudentsByYear(2010);
        students.forEach(i -> System.out.println("id:" + i.getId() + ",name:" + i.getName() + ",sex:" + i.getSex() + ",year:" + i.getYear()));
    }
    private static void listStudentsNamesTest() {
        List<String> studentNames = studentService.listStudentsNames(2012, Student.Sex.FEMALE);
        studentNames.forEach(i -> System.out.println(i));
    }
    private static void listStudentsByYearSortedByIdTest() {
        List<Student> students = studentService.listStudentsByYearSortedById(2011);
        students.forEach(i -> System.out.println("id:" + i.getId() + ",name:" + i.getName() + ",sex:" + i.getSex() + ",year:" + i.getYear()));
    }
    private static void listStudentsMapBySexTest() {
        Map<Student.Sex, List<Student>> sexListMap = studentService.listStudentsMapBySex();
        for(Map.Entry<Student.Sex, List<Student>> entry : sexListMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() );
            System.out.println("Value = ");
            for(Student i : entry.getValue()) {

                System.out.println("id:" + i.getId() + ",name:" + i.getName()  + ",year:" + i.getYear());
            }
        }

    }
    private static void listStudentsByYearMapByIdTest() {
        Map<Integer, Student> idListMap = studentService.listStudentsByYearMapById(2012);
        for(Map.Entry<Integer, Student> entry : idListMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ",Value = " + entry.getValue().getName());
        }
    }
    private static void removeStudentTest() {
        boolean b = studentService.removeStudent(202209);
        if(!b) {
            System.out.println("移除失败");
        } else {
            System.out.println("成功移除");
        }
    }

}
