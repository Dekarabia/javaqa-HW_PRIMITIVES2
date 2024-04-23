//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialBalance = 250;
        int replenishment = 1100;
        int bonus = 100;

        int bonusRubles;
        if (replenishment >= 1000) {
            bonusRubles = 1;
        } else {
            bonusRubles = 0;
        }

        int score = replenishment / bonus;
        System.out.println("Бонусный баланс составит " + score + " рублей " + "при пополнении баланса на сумму более 1000р");


    }

}