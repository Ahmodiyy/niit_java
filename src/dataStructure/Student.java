package dataStructure;

public class Student implements Comparable<Student> {
    private String name;
    private int marks;

    public Student(String nm, int mk) {
        this.name = nm;
        this.marks = mk;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Student s) {
        if (this.marks > s.getMarks())
            return 1;
        else if (this.marks < s.getMarks())
            return -1;
        else
            return 0;
    }
}

