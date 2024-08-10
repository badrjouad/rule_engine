package fr.dauphine.eu;
import fr.dauphine.eu.context.Context;
public class GeneratedRule {
    public static void main(String[] args) {
Context context = new Context();
java.util.Scanner scanner = new java.util.Scanner(System.in);
System.out.print("Entrez la valeur de 'amount': ");
context.setAmount(scanner.nextInt());
System.out.print("Entrez la valeur de 'montantGPC': ");
context.setMontantGPC(scanner.nextInt());
        GeneratedRule ruleExecutor = new GeneratedRule();
if (context.getAmount() > 2000) {
context.setAmount(context.getMontantGPC() * 43210);
}

        System.out.println("Results after rules:");
        System.out.println("Amount après les règles: " + context.getAmount());
        System.out.println("MontantGPC après les règles: " + context.getMontantGPC());
    }
}
