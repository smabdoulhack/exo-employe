public class Manager extends Employee {
    static String poste = "Manager";
    private int nombreEmployee;

    Manager(String nom, int nombreEmployee) {
        this.nom = nom;
        this.nombreEmployee = nombreEmployee;
    }

    public int getNombreEmployee() {
        return nombreEmployee;
    }

    public void setNombreEmployee(int nombreEmployee) {
        this.nombreEmployee = nombreEmployee;
    }

    public void employeInfos() {
        System.out.println("ID : " + this.id);
        System.out.println("NOM : " + this.nom);
        System.out.println("POSTE : " + poste);
        System.out.println("NOMBRE D'EMPLOYES : " + this.nombreEmployee);
    };
}
