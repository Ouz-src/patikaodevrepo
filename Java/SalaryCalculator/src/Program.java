public class Program {
    public static void main(String[] args) {
        Employee e1 = new Employee("Uğur Oguzhan Karadeniz", 7550, 60, 2016);
        Employee e2 = new Employee("Mehmet Karahanlı", 25000, 25, 1996);
        Employee e3 = new Employee("Ömer Uçar", 4259, 42, 2007);

        e1.to_String();
        e2.to_String();
        e3.to_String();
    }
}
