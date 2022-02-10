package TestingPack;

public class Program {
    public static void main(String[] args) {
        Course math = new Course("math", "MAT101", "MAT");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chem = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher t1 = new Teacher("Mahmut Hoca", "905501", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "905502", "PHY");
        Teacher t3 = new Teacher("Ali Veli", "905503", "CHEM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "140400", math, physics, chem);
        s1.addBulkExamNote(50, 25, 35);
        s1.addVerbalNote(75, 80, 60);
        s1.calcGrade();
        s1.isPassed();
        Student s2 = new Student("Güdük Necmi", "140401", math, physics, chem);
        s2.addBulkExamNote(100, 40, 50);
        s2.addVerbalNote(50,60,40);
        s2.calcGrade();
        s2.isPassed();
        Student s3 = new Student("Hayta İsmail", "140402", math, physics, chem);
        s3.addBulkExamNote(40, 30, 40);
        s3.addVerbalNote(80,70,65);
        s3.calcGrade();
        s3.isPassed();
    }
}
