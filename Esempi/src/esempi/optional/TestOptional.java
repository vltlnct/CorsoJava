package esempi.optional;

import java.util.Optional;

public class TestOptional {


    public static Integer sumWithoutOptional(Integer int1, Integer int2) {
        return int1 + int2;
    }

    public static Integer sumWithOptional(Optional int1, Optional int2) {
        System.out.println("Controllo primo parametro: " + int1.isPresent());
        System.out.println("Controllo secondo parametro: " + int2.isPresent());
        Integer value1 = (Integer) int1.orElse(0);
        Integer value2 = (Integer) int2.get();
        return value1 + value2;
    }

    public static void main(String[] args) {
        Integer int1 = null;
        Integer int2 = 10;

        Optional opt1 = Optional.ofNullable(int1);
        Optional opt2 = Optional.ofNullable(int2);

        System.out.println("Eseguo sum()");
        System.out.println(sumWithOptional(opt1, opt2));

        System.out.println("Eseguo sumOld()");
        System.out.println(sumWithoutOptional(int1, int2));

    }


}