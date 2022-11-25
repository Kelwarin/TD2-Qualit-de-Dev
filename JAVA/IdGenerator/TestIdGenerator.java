package IdGenerator;

public class TestIdGenerator {
    public static void main(String[] args) {
        IdGenerator g = IdGenerator.getInstance();
        String id1 = g.getInstance().afficherEtiquette();
        String id2 = g.getInstance().afficherEtiquette();
        String id3 = g.getInstance().afficherEtiquette();

        System.out.println( "id1 = " + id1 + "\n" +
                            "id2 = " + id2 + "\n" +
                            "id3 = " + id3);
    }
}