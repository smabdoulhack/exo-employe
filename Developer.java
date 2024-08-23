public class Developer extends Employee {
    static String poste = "Developper";
    private String specialite;

    Developer(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void employeInfos() {
        System.out.println("ID : " + this.id);
        System.out.println("NOM : " + this.nom);
        System.out.println("POSTE : " + poste);
        System.out.println("SPECIALITE : " + this.specialite);
    };
}