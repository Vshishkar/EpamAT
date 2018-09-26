package by.mmf.vshishkar.student.service;

import by.mmf.vshishkar.student.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    /*
     * @return average mark for student
     * */		
    public double getAverageMark(Student student) {

        double result = 0;

        List<Integer> marks = student.getMarks();

        for (Integer mark:marks){
            result+=mark;
        }

        result = result/marks.size();

        return result;
    }

    public double getAverageMark(List<Student> students) {

        double result = 0;

        for(Student student:students){
            result += this.getAverageMark(student);
        }

        result = result/students.size();

        return result;
    }

    public List<Student> getStudentsByGroupname(List<Student> students,int groupName) {

        List<Student> studentsByGroupName = new ArrayList<Student>();

        for (int i = 0; i < students.size(); i++){
            if(students.get(i).getGroupNumber() == groupName){
                studentsByGroupName.add(students.get(i));
            }
        }

        return studentsByGroupName;
    }
}
