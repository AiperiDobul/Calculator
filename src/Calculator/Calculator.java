package Calculator;
import java.lang.Math.*;

public class Calculator {
    public static void main(String[] args) {
//        Необходимо выбрать 5 методов из класса Math и привести их примеры использования.
//        В комментариях нужно кратко описать работу каждого метода.

    int n1 = Math.abs(80); // Метод abs() в классе Math ворвращает абсолютное значение
    int n2 = Math.abs(-80);// для аргументов(long, int, float, double), то есть это всегда будет положительное значение.
        System.out.println(n1);
        System.out.println(n2);

    double n = Math.sqrt(100);// Метод sqrt() вычисляет квадратный корень аргумента(double).
        System.out.println(n);

    long max = Math.max(4558l,78898l); // Метод max(a,b) возвращает максимальное из двух значений,
                                      // переданных в аргументе(long, int, float, double).
    long min = Math.min(4558l,78898l);//Метод min(a,b) возвращает минимальное из двух значений, переданных в аргументе.
        System.out.println(max);
        System.out.println(min);

    double ceil=Math.ceil(54.54);//Метод ceil() округляет значение с плавающей точкой до целого числа в большую сторону.
        System.out.println(ceil);
    double floor = Math.floor(54.54);//Метод floor() округляет значение с плавающей точкой до целого числа.
                                     //Округление производится в меньшую сторону.
        System.out.println(floor);




    }
}
