package Exercice5;

import java.util.ArrayList;

public class TestUsine {
    public static Avion createAvionA1(Usine usine){
        Reacteur reacteurA1_1 = new Reacteur("Airbus", 8.3, 1.5);
        Reacteur reacteurA1_2 = new Reacteur("SpaceX", 7.5, 3);
        Fuselage fuselageA1 = new Fuselage(22, 850);
        ArrayList<Reacteur> reacteursA1 = new ArrayList<>();
        reacteursA1.add(reacteurA1_1);
        reacteursA1.add(reacteurA1_1);
        reacteursA1.add(reacteurA1_1);
        reacteursA1.add(reacteurA1_1);
        reacteursA1.add(reacteurA1_2);
        reacteursA1.add(reacteurA1_2);
        return usine.fabriqueAvion("A380", reacteursA1, fuselageA1);
    }

    public static Avion createAvionA2(Usine usine){
        Reacteur reacteurA2 = new Reacteur("Airbus", 10.2, 2.1);
        Fuselage fuselageA2 = new Fuselage(11, 268);
        ArrayList<Reacteur> reacteursA2 = new ArrayList<>();
        reacteursA2.add(reacteurA2);
        reacteursA2.add(reacteurA2);
        reacteursA2.add(reacteurA2);
        reacteursA2.add(reacteurA2);
        return usine.fabriqueAvion("A330", reacteursA2, fuselageA2);
    }

    public static Avion createAvionB(Usine usine){
        Reacteur reacteurB = new Reacteur("Boeing", 16, 2.5);
        Fuselage fuselageB = new Fuselage(9, 127);
        ArrayList<Reacteur> reacteursB = new ArrayList<>();
        reacteursB.add(reacteurB);
        reacteursB.add(reacteurB);
        reacteursB.add(reacteurB);
        reacteursB.add(reacteurB);
        reacteursB.add(reacteurB);
        reacteursB.add(reacteurB);
        return usine.fabriqueAvion("737 MAX 7", reacteursB, fuselageB);
    }

    public static void main(String[] args) {
        Usine usineA = new UsineAirbus();
        Usine usineB = new UsineBoeing();
        Avion avionA1 = createAvionA1(usineA);
        Avion avionA2 = createAvionA2(usineA);
        Avion avionB = createAvionB(usineB);
        Satellite satelliteA = usineA.fabriqueSatellite("X392");
        Satellite satelliteB = usineB.fabriqueSatellite("V951");
        System.out.println(avionA1);
        System.out.println(avionA2);
        System.out.println(avionB);
        System.out.println(satelliteA);
        System.out.println(satelliteB);
    }
}
