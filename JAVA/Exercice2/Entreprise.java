package Exercice2;

public class Entreprise {
    private Imprimante imprimante;
    private String patron;

    public Entreprise(String patron){
        this.imprimante = Imprimante.getInstance();
        this.patron = patron;
    }

    public Imprimante getImprimante() {
        return imprimante;
    }

    public String getPatron() {
        return patron;
    }

    public static void main(String[] args) {
        Entreprise spaceX = new Entreprise("Elon Musk");
        System.out.println("This, is " + spaceX.getPatron() + "...");
        for(int i=0; i<5231; i++) {
            spaceX.getImprimante().imprimer();
        }
        System.out.println("Avec toute la paperasse, " + spaceX.getPatron() + " a du imprimer " + spaceX.getImprimante().getNbPages() + " pages !");
    }
}
