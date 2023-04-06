import java.util.*;
import java.util.function.Predicate;

public class StudentGroupIterator implements Iterator<Student> {
    private Student[] students;
    private int position;

    public StudentGroupIterator(Student[] students) {
        this.students = students;
        position = 0;
    }

    public boolean hasNext() {
        return position < students.length;
    }

    public Student next() {
        Student student = students[position];
        position++;
        return student;
    }

    public Iterator<Student> getFilteredIterator(Predicate<Student> predicate) {
        ArrayList<Student> filteredStudents = new ArrayList<Student>();
        for (Student student : students) {
            if (predicate.test(student)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents.iterator();
    }
}