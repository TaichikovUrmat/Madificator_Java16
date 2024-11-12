import java16.Group;
import java16.Student;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public  class Main {
    public static void main(String[] args) {

        Group group = new Group(1L,"java16");
        group.addStudent(new Student(1L,"Jaichybekov","Ernis",
                LocalDate.of(2008,7,22),"Male",996555700900L));
        group.addStudent(new Student(2L,"Dyisho uulu","Aibek",
                LocalDate.of(2004,7,26),"Male",996555750042L));
        group.addStudent(new Student(3L,"Emirsinova","Aruuke",
                LocalDate.of(2000,9,2),"Female",996555800999L));

        System.out.println(group);

//        group.getAllStudent();
//        System.out.println("-----------");
////        group.getStudentById(3L);
////        group.updateStudent(2L,new Student(2L,"janybekova","Guljamal",
////                LocalDate.of(2003,1,6),"Female",9967006005000L));
////        group.getAllStudent();
//
//        group.deleteStudent(2L);
//        System.out.println("-----------------");
//        group.getAllStudent();




    }
}