public class Manager extends Employee {
    static String poste = "Manager";
    private String nombreEmployee;

    Manager(String nom, String nombreEmployee) {
        this.nom = nom;
        this.nombreEmployee = nombreEmployee;
    }

    public String getNombreEmployee() {
        return nombreEmployee;
    }

    public void setNombreEmployee(String nombreEmployee) {
        this.nombreEmployee = nombreEmployee;
    }

    public void employeInfos() {

    };
}
