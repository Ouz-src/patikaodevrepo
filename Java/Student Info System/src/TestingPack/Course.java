package TestingPack;

public class Course {
    Teacher courseTeacher;
    String name, code, prefix;
    int verbalGrade, examGrade;
    float grade;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbalGrade = 0;
        this.examGrade = 0;
        this.grade = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
            System.out.println("Teacher " + teacher.name + " added successfully!");
        } else {
            System.out.println(teacher.name + "Cannot lecture this course.");
        }
        System.out.println("---------------------------------");
    }

    void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(courseTeacher.name + "is the lecturer of + " + name);
        } else {
            System.out.println("Currently no teacher is lecturing the course: " + name);
        }
    }
}