package by.mmf.vshishkar.student.dao;

import by.mmf.vshishkar.student.entity.Student;

import java.util.List;

public interface StudentDAO {

    /*
     * returns list of students
     * */	
    List<Student> getStudents();

    List<Integer> getRandomMarks();

}
