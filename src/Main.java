//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialBalance = 250;
        int replenishment = 2000;
        int score = initialBalance + replenishment;

        int bonusBalance;
        if (score > 1000) {
            bonusBalance = score / 100;
        } else {
            bonusBalance = 0;
        }

        int bonusRuble = score / bonusBalance;
        System.out.println("Бонусный баланс составит " + bonusRuble + " рубля " + "при пополнении баланса на сумму более 1000р");

    }

}