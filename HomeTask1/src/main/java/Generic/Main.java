package Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] myArr1 = {1, 2, 3, 4, 8, 9};

        metod1(myArr1, 1, 5);

        String[] myArr2 = {"A", "B", "C", "D", "E"};

        System.out.println("\n");
        toList(myArr2);

        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();
        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();

        orange1.addFruits(new Orange(), 10);
        orange2.addFruits(new Orange(), 12);
        apple1.addFruits(new Apple(), 8);
        apple2.addFruits(new Apple(), 4);

        orange1.showBox();
        orange1.to(orange2);
        orange1.showBox();

        apple1.showBox();
        apple1.to(apple2);
        apple1.showBox();

    }

    public static <T> void metod1 (T[] obj, int i, int j) {
        T sw = obj[i];
        obj[i] = obj[j];
        obj[j] = sw;

        System.out.println(Arrays.toString(obj));
    }

    public static <T> void toList (T[] myArr2) {
        ArrayList<T> list = new ArrayList<>(Arrays.asList(myArr2));

        System.out.println(list);
    }
}
