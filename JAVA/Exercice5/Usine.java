package Exercice5;

import java.util.ArrayList;

public abstract class Usine {
        public abstract Avion fabriqueAvion(String modele, String marqueReacteur);

        public abstract Satellite fabriqueSatellite(String modele);
}
