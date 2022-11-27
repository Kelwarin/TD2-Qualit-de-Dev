package Exercice5;

import java.util.ArrayList;

public abstract class Usine {
        public abstract Avion fabriqueAvion(String modele, ArrayList<Reacteur> reacteurs, Fuselage fuselage);

        public abstract Satellite fabriqueSatellite(String modele);
}
