package by.mmf.vshishkar.student.service;

import by.mmf.vshishkar.student.entity.Student;

import java.util.List;

public interface StudentService {

    double getAverageMark(Student student);

    double getAverageMark(List<Student> students);

    List<Student> getStudentsByGroupname(List<Student> students,int groupName);


}
