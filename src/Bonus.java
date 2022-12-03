public class Bonus {
    public static void main(String[] args) {

        int currentBalance = 100;
        int inComeBalance = 100;
        int bonus = inComeBalance * 1 / 100;
        int noBonus = 0;

        if (inComeBalance >= 1000)

            System.out.println("Ваш счет пополнен на " + inComeBalance + ". Ваши бонусы: " + bonus + " Текущий баланс: ");
        if (inComeBalance < 1000)

            System.out.println("Ваш счет пополнен на " + inComeBalance + ". Ваши бонусы: " + noBonus + " Текущий баланс: ");


        if (inComeBalance >= 1000) {
            System.out.println( currentBalance + inComeBalance + bonus );
        }
        if (inComeBalance < 1000) {
            System.out.println(currentBalance + inComeBalance );
        }




    }
}












