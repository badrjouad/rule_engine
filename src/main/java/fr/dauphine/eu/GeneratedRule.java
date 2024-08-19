package fr.dauphine.eu;
import fr.dauphine.eu.context.Context;
public class GeneratedRule {
    public static void main(String[] args) {
Context context = new Context();
java.util.Scanner scanner = new java.util.Scanner(System.in);
System.out.print("Entrez la valeur de 'sinistres': ");
context.setSinistres(scanner.nextBoolean());
System.out.print("Entrez la valeur de 'amount': ");
context.setAmount(scanner.nextInt());
System.out.print("Entrez la valeur de 'franchise': ");
context.setFranchise(scanner.nextInt());
System.out.print("Entrez la valeur de 'nombreAccidents': ");
context.setNombreAccidents(scanner.nextInt());
System.out.print("Entrez la valeur de 'ageConducteur': ");
context.setAgeConducteur(scanner.nextInt());
System.out.print("Entrez la valeur de 'montantGPC': ");
context.setMontantGPC(scanner.nextInt());
System.out.print("Entrez la valeur de 'typeVehicule': ");
context.setTypeVehicule(scanner.nextLine());
System.out.print("Entrez la valeur de 'primeAssurance': ");
context.setPrimeAssurance(scanner.nextDouble());
System.out.print("Entrez la valeur de 'anneesContrat': ");
context.setAnneesContrat(scanner.nextInt());
        GeneratedRule ruleExecutor = new GeneratedRule();
if (context.getMontantGPC() == 100) {
context.setMontantGPC(1);
}
if (context.getMontantGPC() < 50) {
context.setMontantGPC(2);
}

if (context.getMontantGPC() > 0 && context.getMontantGPC() < 100) {
context.setMontantGPC(10);
context.setAmount(context.getMontantGPC() * 2);
}

if (context.getPrimeAssurance() > 500) {
context.setPrimeAssurance(context.getPrimeAssurance() * 1.05);
}

if (context.getFranchise() == 300) {
context.setFranchise(context.getFranchise() - 50);
}

if (context.getPrimeAssurance() > 1000 && context.getMontantGPC() < 200) {
context.setPrimeAssurance(context.getPrimeAssurance() * 0.9);
context.setMontantGPC(context.getMontantGPC() + 50);
}

if (context.getNombreAccidents() == 0 && context.getAnneesContrat() > 5) {
context.setPrimeAssurance(context.getPrimeAssurance() * 0.85);
}

if (context.getNombreAccidents() > 3 || context.getSinistres() == true) {
context.setFranchise(context.getFranchise() + 100);
}

if (context.getAgeConducteur() > 60 && context.getNombreAccidents() == 0) {
context.setPrimeAssurance(context.getPrimeAssurance() * 0.8);
}

if (context.getAnneesContrat() > 10) {
context.setMontantGPC(context.getMontantGPC() + 20);
}

if (context.getAnneesContrat() == 0) {
context.setPrimeAssurance(300);
}

if (context.getTypeVehicule() == "hybride") {
context.setPrimeAssurance(context.getPrimeAssurance() * 0.9);
}

        System.out.println("Results after rules:");
        System.out.println("Sinistres après les règles: " + context.getSinistres());
        System.out.println("Amount après les règles: " + context.getAmount());
        System.out.println("Franchise après les règles: " + context.getFranchise());
        System.out.println("NombreAccidents après les règles: " + context.getNombreAccidents());
        System.out.println("AgeConducteur après les règles: " + context.getAgeConducteur());
        System.out.println("MontantGPC après les règles: " + context.getMontantGPC());
        System.out.println("TypeVehicule après les règles: " + context.getTypeVehicule());
        System.out.println("PrimeAssurance après les règles: " + context.getPrimeAssurance());
        System.out.println("AnneesContrat après les règles: " + context.getAnneesContrat());
    }
}
