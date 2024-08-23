import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager implements EmployeeOperations {

    public static List<Developer> developers = new ArrayList<>();
    public static List<Manager> managers = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenu dans le manager des employees");

        EmployeeManager gestion = new EmployeeManager();
        int choix;

        do {
            gestion.menu();
            System.out.println("Veuillez choisir une option :");
            choix = scanner.nextInt();
            // scanner.close();

            switch (choix) {
                case 0:
                    System.out.println("-------- BYE ------");
                    break;
                case 1:
                    gestion.addEmploye();
                    break;
                case 2:
                    gestion.editeEmploye();
                    break;
                case 3:
                    gestion.deleteEmployee();
                    ;
                    break;
                case 4:
                    getAllDeveloppers();
                    getAllManagers();
                    break;

                default:
                    System.out.println("Mauvais choix");
                    break;
            }

        } while (choix != 0);
        scanner.close();

    }

    public void menu() {
        System.out.println("\n------------ MENU ---------");
        System.out.println("1- Ajouter un employé");
        System.out.println("2- Modifier un employé");
        System.out.println("3- Supprimer un employé");
        System.out.println("4- Afficher la liste des employés");
        System.out.println("0- Quitter");
    }

    public void addEmploye() {

        System.out.println("\n------------ Ajouter un employé ---------");
        System.out.println("1- Ajouter un developpeur");
        System.out.println("2- Ajouter un manager");
        System.out.println("Veuillez choisir le type d'employé à ajouter");
        int typeEmployee = scanner.nextInt();
        if (typeEmployee == 1) {
            addDeveloper();
        } else if (typeEmployee == 2) {
            addManager();
        }
    }

    public void addDeveloper() {

        System.out.println("\n------------ Ajout d'un developpeur ---------");
        System.out.println("Veillez entrer le nom");
        scanner.nextLine();
        String nom = scanner.nextLine();
        System.out.println("Veillez entrer la spécialité");
        String poste = scanner.nextLine();
        Developer dev = new Developer(nom, poste);
        developers.add(dev);
        System.out.println("Ajout réussi");
    };

    public void addManager() {

        System.out.println("\n------------ Ajout d'un manager ---------");
        System.out.println("Veillez entrer le nom");
        scanner.nextLine();
        String nom = scanner.nextLine();
        System.out.println("Veillez entrer le nombre d'employés managés");
        int nbrEmployes = scanner.nextInt();
        Manager manager = new Manager(nom, nbrEmployes);
        managers.add(manager);
        System.out.println("Ajout réussi");
    };

    public void editeEmploye() {
        System.out.println("\n------------ Modifier un employé ---------");
        System.out.println("1- Modifier un developpeur");
        System.out.println("2- Modifier un manager");
        System.out.println("Veuillez choisir le type d'employé à modifier");
        int typeEmployee = scanner.nextInt();
        if (typeEmployee == 1) {
            editeDeveloper();
        } else if (typeEmployee == 2) {
            editeManager();
        }
    }

    public void editeDeveloper() {

        getAllDeveloppers();
        System.out.println("Veillez entrer le numéro de l'employer à modifier");
        int pos = scanner.nextInt();

        System.out.println("\n------------ Modification d'un developpeur ---------");
        System.out.println("Veillez entrer le nom");
        scanner.nextLine();
        String nom = scanner.nextLine();
        System.out.println("Veillez entrer la spécialité");
        String specialite = scanner.nextLine();
        System.out.println("Ajout réussi");
        developers.get(pos - 1).setNom(nom);
        developers.get(pos - 1).setSpecialite(specialite);
        System.out.println("Modification réussie !");
    };

    public void editeManager() {
        getAllManagers();
        System.out.println("Veillez entrer le numéro de l'employer à modifier");
        int pos = scanner.nextInt();

        System.out.println("\n------------ Modification d'un developpeur ---------");
        System.out.println("Veillez entrer le nom");
        scanner.nextLine();
        String nom = scanner.nextLine();
        System.out.println("Veillez entrer la spécialité");
        int nombreEmployes = scanner.nextInt();
        System.out.println("Ajout réussi");
        managers.get(pos - 1).setNom(nom);
        managers.get(pos - 1).setNombreEmployee(nombreEmployes);
        System.out.println("Modification réussie !");
    };

    public static void getAllDeveloppers() {
        if (developers.size() > 0) {
            int i = 0;
            System.out.println("\n------- LISTE DES DEVELOPERS ----------");
            for (Developer developer : developers) {
                System.out.println("No: " + ++i);
                developer.employeInfos();
                System.out.println("-------------------------------");
            }
        } else {
            System.out.println("(----- AUCUN DEVELOPERS EXISTANT -----)");
        }
    }

    static void getAllManagers() {
        if (managers.size() > 0) {
            int i = 0;
            System.out.println("\n------- LISTE DES MANAGERS ----------");
            for (Manager manager : managers) {
                System.out.println("No: " + ++i);
                manager.employeInfos();
                System.out.println("-------------------------------");
            }
        } else {
            System.out.println("(----- AUCUN MANAGERS EXISTANT -----)");
        }
    }

    public void deleteEmployee() {
        System.out.println("\n------------ Supprimer un employé ---------");
        System.out.println("1- Supprimer un developpeur");
        System.out.println("2- Supprimer un manager");
        System.out.println("Veuillez choisir le type d'employé à Supprimer");
        int typeEmployee = scanner.nextInt();
        if (typeEmployee == 1) {
            deleteDeveloper();
        } else if (typeEmployee == 2) {
            deleteManager();
        }
    }

    public void deleteDeveloper() {
        getAllDeveloppers();
        System.out.println("Veillez entrer le numéro de l'employer à supprimer");
        int pos = scanner.nextInt();

        developers.remove(pos - 1);
        System.out.println("Suppression de l'employé " + pos + " réussie !");
    };

    public void deleteManager() {
        getAllDeveloppers();
        System.out.println("Veillez entrer le numéro de l'employer à supprimer");
        int pos = scanner.nextInt();

        developers.remove(pos - 1);
        System.out.println("Suppression de l'employé " + pos + " réussie !");
    };
}
