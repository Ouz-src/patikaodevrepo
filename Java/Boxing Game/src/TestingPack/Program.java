package TestingPack;
public class Program {
    public static void main(String[] args) {
       Fighter rock = new Fighter("Dwayne", 25, 100, 90, 20);
       Fighter edge = new Fighter("Adam", 15, 100, 100, 30);
       Ring ring = new Ring(rock, edge, 90, 100);
       ring.run();
    }
}
