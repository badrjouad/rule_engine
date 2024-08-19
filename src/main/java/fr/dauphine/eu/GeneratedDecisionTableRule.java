package fr.dauphine.eu;
import fr.dauphine.eu.context.Context;
public class GeneratedDecisionTableRule {
    public static void main(String[] args) {
Context context = new Context();
java.util.Scanner scanner = new java.util.Scanner(System.in);
System.out.print("Entrez la valeur de 'montantGPC': ");
context.setMontantGPC(scanner.nextInt());
System.out.print("Entrez la valeur de 'primeAssurance': ");
context.setPrimeAssurance(scanner.nextInt());
        GeneratedDecisionTableRule ruleExecutor = new GeneratedDecisionTableRule();
        // Execute conditions and actions
        if (ruleExecutor.condition1(context)) {
            ruleExecutor.action1(context);
        }
        if (ruleExecutor.condition2(context)) {
            ruleExecutor.action2(context);
        }
        if (ruleExecutor.condition3(context)) {
            ruleExecutor.action3(context);
        }
        System.out.println("Results after rules:");
        System.out.println("MontantGPC après les règles: " + context.getMontantGPC());
        System.out.println("PrimeAssurance après les règles: " + context.getPrimeAssurance());
    }
private boolean condition1(Context context) {
    return context.getPrimeAssurance() > 1000 && context.getMontantGPC() > 50 && context.getPrimeAssurance() < 5000;
}
private boolean condition2(Context context) {
    return context.getPrimeAssurance() <= 1000 && context.getMontantGPC() <= 50 && context.getPrimeAssurance() >= 500;
}
private boolean condition3(Context context) {
    return context.getNombreAccidents() > 3 && context.getAgeConducteur() < 25 && context.getMontantGPC() < 100;
}
private void action1(Context context) {
    context.setPrimeAssurance(context.getMontantGPC() + 100);
    context.setMontantGPC((int) (context.getPrimeAssurance() - 50));
}
private void action2(Context context) {
    context.setPrimeAssurance(context.getMontantGPC() + 50);
    context.setMontantGPC((int) (context.getPrimeAssurance() + 20));
}
private void action3(Context context) {
    context.setPrimeAssurance(context.getPrimeAssurance() + 200);
    context.setMontantGPC(context.getMontantGPC() - 10);
}
}
