package Exercice5;

public class Immatriculation {
    private String immatriculation;
    private static Immatriculation single_instance = null;

    private Immatriculation(){
        this.immatriculation = "";
    }

    public static Immatriculation getInstance(){
        if(single_instance == null){
            single_instance = new Immatriculation();
        }
        return single_instance;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String immatriculer(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ints = "1234567890";
        String immat = "";
        for(int i=0; i < 3; i++){
            int x = (int)(ints.length() * Math.random());
            immat += ints.charAt(x);
        }
        immat += '-';
        for(int i=0; i < 3; i++){
            int x = (int)(ints.length() * Math.random());
            immat += chars.charAt(x);
        }
        immat += '-';
        for(int i=0; i < 3; i++){
            int x = (int)(ints.length() * Math.random());
            immat += ints.charAt(x);
        }
        immatriculation = immat;
        return immatriculation;
    }
}
