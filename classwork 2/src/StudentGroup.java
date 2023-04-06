import java.util.*;

public class StudentGroup {
    private ArrayList<Student> students;

    public StudentGroup() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Iterator<Student> getIterator() {
        return students.iterator();
    }

    public void printStudents() {
        Iterator<Student> iterator = getIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade());
        }
    }
}