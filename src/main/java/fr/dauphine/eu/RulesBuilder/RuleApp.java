package fr.dauphine.eu.RulesBuilder;

public class RuleApp {
    public static void main(String[] args) throws Exception {
        RuleCodeGenerator generator = new RuleCodeGenerator();
        generator.generateCode(
                "src/main/resources/rules/rules.txt",
                "C:\\Users\\jouad\\Downloads\\generate_rule\\src\\main\\java\\fr\\dauphine\\eu\\GeneratedRule.java"
        );
    }
}
