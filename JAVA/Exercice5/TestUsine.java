package Exercice5;

import java.util.ArrayList;

public class TestUsine {
    public static Avion createAirbus320_1(Usine usine){
        Avion avion = usine.fabriqueAvion("320", "Rolls-Royce");
        Reacteur reacteur = new Reacteur(avion.getMarqueReacteur(), 5, 10);
        Fuselage fuselage = new Fuselage(30, 120);
        ArrayList<Reacteur> reacteurs = new ArrayList<>();
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        avion.setReacteurs(reacteurs);
        avion.setFuselage(fuselage);
        return avion;
    }

    public static Avion createAirbus320_2(Usine usine){
        Avion avion = usine.fabriqueAvion("320", "Trent");
        Reacteur reacteur = new Reacteur(avion.getMarqueReacteur(), 6, 9);
        Fuselage fuselage = new Fuselage(30, 120);
        ArrayList<Reacteur> reacteurs = new ArrayList<>();
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        avion.setReacteurs(reacteurs);
        avion.setFuselage(fuselage);
        return avion;
    }

    public static Avion createAirbus380_1(Usine usine){
        Avion avion = usine.fabriqueAvion("380", "Rolls-Royce");
        Reacteur reacteur = new Reacteur(avion.getMarqueReacteur(), 8, 12);
        Fuselage fuselage = new Fuselage(110, 550);
        ArrayList<Reacteur> reacteurs = new ArrayList<>();
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        avion.setReacteurs(reacteurs);
        avion.setFuselage(fuselage);
        return avion;
    }

    public static Avion createAirbus380_2(Usine usine){
        Avion avion = usine.fabriqueAvion("380", "Trent");
        Reacteur reacteur = new Reacteur(avion.getMarqueReacteur(), 9, 13);
        Fuselage fuselage = new Fuselage(110, 550);
        ArrayList<Reacteur> reacteurs = new ArrayList<>();
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        avion.setReacteurs(reacteurs);
        avion.setFuselage(fuselage);
        return avion;
    }

    public static Avion createBoeing737_1(Usine usine){
        Avion avion = usine.fabriqueAvion("737", "Rolls-Royce");
        Reacteur reacteur = new Reacteur(avion.getMarqueReacteur(), 4, 8);
        Fuselage fuselage = new Fuselage(28, 110);
        ArrayList<Reacteur> reacteurs = new ArrayList<>();
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        avion.setReacteurs(reacteurs);
        avion.setFuselage(fuselage);
        return avion;
    }

    public static Avion createBoeing737_2(Usine usine){
        Avion avion = usine.fabriqueAvion("737", "Trent");
        Reacteur reacteur = new Reacteur(avion.getMarqueReacteur(), 7, 9);
        Fuselage fuselage = new Fuselage(28, 110);
        ArrayList<Reacteur> reacteurs = new ArrayList<>();
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        avion.setReacteurs(reacteurs);
        avion.setFuselage(fuselage);
        return avion;
    }

    public static Avion createBoeing747_1(Usine usine){
        Avion avion = usine.fabriqueAvion("747", "Rolls-Royce");
        Reacteur reacteur = new Reacteur(avion.getMarqueReacteur(), 20, 38);
        Fuselage fuselage = new Fuselage(100, 375);
        ArrayList<Reacteur> reacteurs = new ArrayList<>();
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        avion.setReacteurs(reacteurs);
        avion.setFuselage(fuselage);
        return avion;
    }

    public static Avion createBoeing747_2(Usine usine){
        Avion avion = usine.fabriqueAvion("747", "Trent");
        Reacteur reacteur = new Reacteur(avion.getMarqueReacteur(), 22, 41);
        Fuselage fuselage = new Fuselage(100, 375);
        ArrayList<Reacteur> reacteurs = new ArrayList<>();
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        reacteurs.add(reacteur);
        avion.setReacteurs(reacteurs);
        avion.setFuselage(fuselage);
        return avion;
    }

    public static void main(String[] args) {
        Usine usineA = new UsineAirbus();
        Usine usineB = new UsineBoeing();
        Avion avionAirbus320_1 = createAirbus320_1(usineA);
        Avion avionAirbus320_2 = createAirbus320_2(usineA);
        Avion avionAirbus380_1 = createAirbus380_1(usineA);
        Avion avionAirbus380_2 = createAirbus380_2(usineA);
        Avion avionBoeing737_1 = createBoeing737_1(usineB);
        Avion avionBoeing737_2 = createBoeing737_2(usineB);
        Avion avionBoeing747_1 = createBoeing747_1(usineB);
        Avion avionBoeing747_2 = createBoeing747_2(usineB);
        Satellite jason1 = usineA.fabriqueSatellite("Jason1");
        Satellite argos = usineB.fabriqueSatellite("Argos");
        System.out.println(avionAirbus320_1);
        System.out.println(avionAirbus320_2);
        System.out.println(avionAirbus380_1);
        System.out.println(avionAirbus380_2);
        System.out.println(avionBoeing737_1);
        System.out.println(avionBoeing737_2);
        System.out.println(avionBoeing747_1);
        System.out.println(avionBoeing747_2);
        System.out.println(jason1);
        System.out.println(argos);
    }
}