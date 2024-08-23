public abstract class Employee {

    protected int id;
    protected String nom;

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }


    public abstract void employeInfos();
}
