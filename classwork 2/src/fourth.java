import java.util.*;
import java.util.function.Predicate;

public class fourth implements Iterator<Student> {
    private ArrayList<Student> students;
    private int position;

    public void StudentGroupIterator(ArrayList<Student> students) {
        this.students = students;
        position = 0;
    }

    public boolean hasNext() {
        return position < students.size();
    }

    public Student next() {
        Student student = students.get(position);
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