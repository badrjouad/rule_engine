package fr.dauphine.eu;
import fr.dauphine.eu.context.Context;
public class GeneratedRule {
    public static void main(String[] args) {
Context context = new Context();
context.setAmount(2000);
context.setMontantGPC(30);
        if (context.getAmount() > 2000) {
context.setAmount(context.getMontantGPC+10);
}
        System.out.println("Amount après les règles: " + context.getAmount());
    }
}
