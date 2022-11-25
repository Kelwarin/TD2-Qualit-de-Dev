package Exercice2;

public class Imprimante {
    private int nbPages;
    private static Imprimante single_instance = null;

    private Imprimante(){
        this.nbPages = 0;
    }

    public static Imprimante getInstance(){
        if(single_instance == null){
            single_instance = new Imprimante();
        }
        return single_instance;
    }

    public int getNbPages() {
        return nbPages;
    }

    public String imprimer(){
        return "L'imprimante a imprimé " + nbPages++ + (" pages");
    }
}
