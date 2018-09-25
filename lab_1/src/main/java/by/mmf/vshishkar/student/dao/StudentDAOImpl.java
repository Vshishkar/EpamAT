package by.mmf.vshishkar.student.dao;

import by.mmf.vshishkar.student.entity.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentDAOImpl implements StudentDAO {
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Vlad","Demyanov",getRandomMarks(),2));
        students.add(new Student("John","Shishakrov",getRandomMarks(),1));
        students.add(new Student("Marry","Apanasevich",getRandomMarks(),3));
        students.add(new Student("Egor","Gorbic",getRandomMarks(),2));
        students.add(new Student("Artsiom","Kisel",getRandomMarks(),3));
        students.add(new Student("Ira","Vaskova",getRandomMarks(),3));
        students.add(new Student("Monica","Belucci",getRandomMarks(),1));
        students.add(new Student("Bred","Pitt",getRandomMarks(),1));
        students.add(new Student("Johny","Dep",getRandomMarks(),2));

        Student student = new Student();
        student.setSecondName("wait for it ... Stinson");
        student.setFirstName("Barney");
        List<Integer> marks = new ArrayList<Integer>();
        student.setGroupNumber(3);
        for (int i = 0; i < 10; i++){
            marks.add(10);
        }
        student.setMarks(marks);

        students.add(student);

        return students;
    }

    public List<Integer> getRandomMarks() {

        List<Integer> marks = new ArrayList<Integer>();

        for (int i = 0;i < 10;i++){
            marks.add((int) (Math.random() * 10));
        }

        return marks;
    }
}
