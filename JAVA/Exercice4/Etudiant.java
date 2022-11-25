package Exercice4;

public class Etudiant {

    // Exercice 1 : Il est possible de créer un total de 721 constructeurs possibles

    private String code_nip;
    private String code_ine;
    private final String nom;
    private final String nom_usuel;
    private final String prenom;
    private String date_naissance;
    private String lieu_naissance;
    private int annee_bac;
    private String email;
    private String domicile;
    private String telephone;

    public Etudiant(EtudiantBuilder etudiant) {
        this.code_nip = etudiant.code_nip;
        this.code_ine = etudiant.code_ine;
        this.nom = etudiant.nom;
        this.nom_usuel = etudiant.nom_usuel;
        this.prenom = etudiant.prenom;
        this.date_naissance = etudiant.date_naissance;
        this.lieu_naissance = etudiant.lieu_naissance;
        this.annee_bac = etudiant.annee_bac;
        this.email = etudiant.email;
        this.domicile = etudiant.domicile;
        this.telephone = etudiant.telephone;
    }

    public static class EtudiantBuilder {
        private String code_nip;
        private String code_ine;
        private final String nom;
        private String nom_usuel;
        private final String prenom;
        private String date_naissance;
        private String lieu_naissance;
        private int annee_bac;
        private String email;
        private String domicile;
        private String telephone;

        public EtudiantBuilder(String code_nip, String code_ine, String nom, String prenom) {
            this.code_nip = code_nip;
            this.code_ine = code_ine;
            this.nom = nom;
            this.prenom = prenom;
        }

        public EtudiantBuilder setNom_usuel(String nom_usuel) {
            this.nom_usuel = nom_usuel;
            return this;
        }

        public EtudiantBuilder setDate_naissance(String date_naissance) {
            this.date_naissance = date_naissance;
            return this;
        }

        public EtudiantBuilder setLieu_naissance(String lieu_naissance) {
            this.lieu_naissance = lieu_naissance;
            return this;
        }

        public EtudiantBuilder setAnnee_bac(int annee_bac) {
            this.annee_bac = annee_bac;
            return this;
        }

        public EtudiantBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public EtudiantBuilder setDomicile(String domicile) {
            this.domicile = domicile;
            return this;
        }

        public EtudiantBuilder setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public Etudiant build(){
            return new Etudiant(this);
        }

    }

    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant.EtudiantBuilder("30640210", "090002238jf", "VIVIERS", "Mathis")
                .setAnnee_bac(2020)
                .setDate_naissance("14-06-2003")
                .setLieu_naissance("Montpellier")
                .setEmail("mathis.viviers@gmail.com")
                .setDomicile("Montpellier")
                .setTelephone("06.12.34.56.78").build();
        System.out.println( etudiant.nom + " " + etudiant.prenom + " né le " + etudiant.date_naissance +
                            " à " + etudiant.lieu_naissance);
    }

}
