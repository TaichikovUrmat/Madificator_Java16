package java16;

import java.util.Arrays;

public class Group {

    private Long id;
    private String groupName;
    private Student[] students = new Student[10];
    private int studentCount;

    public Group() {
    }

    public Group(Long id, String groupName, Student[] students, int studentCount) {
        this.id = id;
        this.groupName = groupName;
        this.students = students;
        this.studentCount = studentCount;
    }

    public Group(Long id, String groupName) {
        this.id = id;
        this.groupName = groupName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + "\n" +
                ", students=" + Arrays.toString(students) +"\n" +
                ", studentCount=" + studentCount +
                '}';
    }


    // TODO creat


    public void addStudent(Student student) {
        this.students[studentCount++] = student;
        System.out.println("success !");
    }

    public void getAllStudent() {
        for (int i = 0; i < studentCount; i++) {
            System.out.printf("""
                         Long id : %s
                         String lastName: %s
                         String firstName: %s
                         LocalDate age: %s
                         String gender: %s
                         phoneNumber : %s
                        """,students[i].getId(),students[i].getLastName(),students[i].getFirstName(),
                    students[i].getAge(),students[i].getGender(),students[i].getPhoneNumber());
        }
    }

    public void getStudentById(Long studentId) {
        boolean islaik = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equals(studentId)) {
                islaik = true;
                System.out.printf("""
                         Long id : %s
                         String lastName: %s
                         String firstName: %s
                         LocalDate age: %s
                         String gender: %s
                         phoneNumber : %s
                        """,students[i].getId(),students[i].getLastName(),students[i].getFirstName(),
                           students[i].getAge(),students[i].getGender(),students[i].getPhoneNumber());
            }
        }

        if (!islaik){
            System.out.println("Student with id "+ studentId + " not found !");
        }
    }

    public void deleteStudent(Long studentId) {
        boolean islaik = false;

        for (int i = 0; i < studentCount; i++) {
            if(students[i].getId().equals(studentId)){
                islaik = true;
                for (int v = i; v < studentCount; v++ ) {
                    students[v] = students[v + 1];
                }
                studentCount -- ;
                System.out.println("deleted !!  ");
            }
        }

        if (!islaik){
            System.out.println( " student with  id  "+ studentId + " not found !");
        }
    }

    public void updateStudent(Long studentId, Student newStudent) {
        boolean islaik = false;

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equals(studentId)){
                islaik = true;
                students[i] = newStudent;
            }
        }
        if (!islaik){
            System.out.println("Student with id "+ studentId + " not found !");
        }


    }


}
