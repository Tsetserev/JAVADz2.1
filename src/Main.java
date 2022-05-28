public class Main {

    public static void main(String[] args) {

        int price = 53215;                   //стоимость билет
        int condition = 20;                  //сколько рублей за 1 милю
        int finalBonus = price / condition;  //количество миль за билет

        System.out.println((finalBonus) + " Миль(и) Вы Получите");
    }
}
