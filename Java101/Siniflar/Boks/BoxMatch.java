public class BoxMatch {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Kız", 10, 100, 50, 50);
        Fighter f2 = new Fighter("Erkek", 10, 100, 50, 50);
        Ring r = new Ring(f1, f2, 50, 100);
        r.run();
    }
}