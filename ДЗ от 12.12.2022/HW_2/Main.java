package HW_2;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        WardrobeSpace shelf = new WardrobeSpace();
        She she = new She();
        He he = new He();

        ArrayList<String> coat = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            coat.add("Пальто " + random.nextInt(7));
        }

        for (int i = 0; i < 13; i++) {
            she.addItems("Вещь " + random.nextInt(8), shelf);
        }
        System.out.println("========================================================================");
        System.out.println("Он забирает");
        System.out.println(shelf.clothes.toString());

        System.out.println("========================================================================");

        System.out.println("Она возвращает в шкаф");
        she.addItems(coat, shelf);
        System.out.println(shelf.clothes.toString());

        System.out.println("========================================================================");

        System.out.println("Еще вариант");

        ArrayList<String> pants = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            pants.add("Штяны " + random.nextInt(6));
        }
        she.observe(she, shelf);
        she.takeItems(pants, shelf, she);
        System.out.println(shelf.clothes.toString());

        System.out.println("========================================================================");
        System.out.println("Добавляем еще что-нибудь");

        He motherInLaw = new She();
        motherInLaw.takeItems(pants, shelf, she);
        he.observe(she, shelf);
    }
}