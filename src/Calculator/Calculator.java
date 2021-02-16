package Calculator;
import static java.lang.Math.*;

public class Calculator {
    public static void main(String[] args) {
//        Необходимо выбрать 5 методов из класса Math и привести их примеры использования.
//        В комментариях нужно кратко описать работу каждого метода.

    // Метод abs() в классе Math ворвращает абсолютное значение
    // для аргументов(long, int, float, double), то есть это всегда будет положительное значение.
        System.out.println(abs(80));
        System.out.println(abs(-80));
    
      // Метод sqrt() вычисляет квадратный корень аргумента(double).
        System.out.println(sqrt(100));

     // Метод max(a,b) возвращает максимальное из двух значений,
                                      // переданных в аргументе(long, int, float, double).
    //Метод min(a,b) возвращает минимальное из двух значений, переданных в аргументе.
        System.out.println(max(4558l,78898l));
        System.out.println(min(4558l,78898l));

    //Метод ceil() округляет значение с плавающей точкой до целого числа в большую сторону.
        System.out.println(ceil(54.54));
    //Метод floor() округляет значение с плавающей точкой до целого числа.
                                     //Округление производится в меньшую сторону.
        System.out.println(floor(54.54));




    }
}
