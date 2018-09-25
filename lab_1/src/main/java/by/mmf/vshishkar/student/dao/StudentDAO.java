package by.mmf.vshishkar.student.dao;

import by.mmf.vshishkar.student.entity.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> getStudents();

    List<Integer> getRandomMarks();

}
