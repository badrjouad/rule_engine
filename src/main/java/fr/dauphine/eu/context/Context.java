package fr.dauphine.eu.context;

public class Context {
    private int amount;
    private int montantGPC;
    private double primeAssurance;
    private int franchise;
    private int nombreAccidents;
    private int anneesContrat;
    private boolean sinistres;
    private int ageConducteur;
    private String typeVehicule;

    // Getters and Setters for amount
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Getters and Setters for montantGPC
    public int getMontantGPC() {
        return montantGPC;
    }

    public void setMontantGPC(int montantGPC) {
        this.montantGPC = montantGPC;
    }

    // Getters and Setters for primeAssurance
    public double getPrimeAssurance() {
        return primeAssurance;
    }

    public void setPrimeAssurance(double primeAssurance) {
        this.primeAssurance = primeAssurance;
    }

    // Getters and Setters for franchise
    public int getFranchise() {
        return franchise;
    }

    public void setFranchise(int franchise) {
        this.franchise = franchise;
    }

    // Getters and Setters for nombreAccidents
    public int getNombreAccidents() {
        return nombreAccidents;
    }

    public void setNombreAccidents(int nombreAccidents) {
        this.nombreAccidents = nombreAccidents;
    }

    // Getters and Setters for anneesContrat
    public int getAnneesContrat() {
        return anneesContrat;
    }

    public void setAnneesContrat(int anneesContrat) {
        this.anneesContrat = anneesContrat;
    }

    // Getters and Setters for sinistres
    public boolean getSinistres() {
        return sinistres;
    }

    public void setSinistres(boolean sinistres) {
        this.sinistres = sinistres;
    }

    // Getters and Setters for ageConducteur
    public int getAgeConducteur() {
        return ageConducteur;
    }

    public void setAgeConducteur(int ageConducteur) {
        this.ageConducteur = ageConducteur;
    }

    // Getters and Setters for typeVehicule
    public String getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(String typeVehicule) {
        this.typeVehicule = typeVehicule;
    }
}
