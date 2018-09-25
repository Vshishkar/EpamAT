package by.mmf.vshishkar.student.runner;

import by.mmf.vshishkar.student.dao.StudentDAO;
import by.mmf.vshishkar.student.dao.StudentDAOImpl;
import by.mmf.vshishkar.student.entity.Student;
import by.mmf.vshishkar.student.service.StudentService;
import by.mmf.vshishkar.student.service.StudentServiceImpl;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAOImpl();
        StudentService service = new StudentServiceImpl();

        List<Student> students = dao.getStudents();

        for (int i = 1;i <=3; i++){
            List<Student> studentsByGroupName = service.getStudentsByGroupname(students,i);
            double averageGroupMark = service.getAverageMark(studentsByGroupName);
            for(Student student:studentsByGroupName){
                System.out.println(Printer.formatStudent(student));
                System.out.println(service.getAverageMark(student));
            }
            System.out.println(averageGroupMark);
        }

    }
}
