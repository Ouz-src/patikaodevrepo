package TestingPack;

public class Student {
    String name, stuNo;
    int classes;
    Course math, physics, chem;
    float average;
    boolean isPassed;

    public Student(String name, String stuNo, Course math, Course physics, Course chem) {
        this.name = name;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chem = chem;
    }

    void addBulkExamNote(int math, int physics, int chem) {
        if (math >= 0 && math <= 100)
            this.math.examGrade = math;
        if (physics >= 0 && physics <= 100)
            this.physics.examGrade = physics;
        if (chem >= 0 && chem <= 100)
            this.chem.examGrade = chem;
    }

    void addVerbalNote(int math, int physics, int chem) {
        if (math >= 0 && math <= 100)
            this.math.verbalGrade = math;
        if (physics >= 0 && physics <= 100)
            this.physics.verbalGrade = physics;
        if (chem >= 0 && chem <= 100)
            this.chem.verbalGrade = chem;
    }

    void isPassed() {
        if (this.math.grade == 0 || this.physics.grade == 0 || this.chem.grade == 0) {
            System.out.println("Notes are not entered yet.");
        } else {
            this.isPassed = checkPass();
            printNote();
            System.out.println("Average: " + this.average);
            if (this.isPassed)
                System.out.println("Student has passed grade!");
            else
                System.out.println("Student has failed to pass grade!");
        }
        System.out.println("***************************");
    }

    void calcGrade() {
        if (this.math.prefix == "MAT") {
            this.math.grade = this.math.examGrade * 0.6f + this.math.verbalGrade * 0.4f;
        }
        if (this.physics.prefix == "PHY") {
            this.physics.grade = this.physics.examGrade * 0.8f + this.physics.verbalGrade * 0.2f;
        }
        if (this.chem.prefix == "CHEM") {
            this.chem.grade = this.chem.examGrade * 0.5f + this.chem.verbalGrade * 0.5f;
        }
    }

    void calcAverage() {
        this.average = (math.grade + physics.grade + chem.grade) / 3;
    }

    boolean checkPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("Student: " + name);
        System.out.println("Mathematics grade: " + math.grade);
        System.out.println("Physics grade: " + physics.grade);
        System.out.println("Chemistry grade: " + chem.grade);
    }
}
