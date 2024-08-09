/* Дано задание:
Реализуйте публичный статический метод fib(), находящий положительные числа Фибоначчи.
Метод принимает в качестве параметра порядковый номер числа и возвращает число из последовательности с этим номером.
Подробней ознакомиться с заданием можно тут https://ru.hexlet.io/challenges/java_basics_fib_exercise
*/

import java.util.ArrayList;
import java.util.List;


public class FibonacciSequence  {

    public static int fib(int ordinalNumber){
//      Изначальные числа, которые есть в последовательность Фибоначчи
        var firstOriginalSequence = 0;
        var secondOriginalSequence = 1;

//      Создаем список последовательности чисел Фибоначчи, добавляя в него два изначальных числа
        List<Integer> numbersOfFibonacci = new ArrayList<>();
        numbersOfFibonacci.add(firstOriginalSequence);
        numbersOfFibonacci.add(secondOriginalSequence);
        /* Цикл, в котором каждое последующее число равно сумме двух предыдущих.Рассмотрим первую итерацию цикла подробней:

            1) numbersOfFibonacci.add -- добавляем в список результат выражения ниже...
                1.1) numbersOfFibonacci.get(i - 1) + numbersOfFibonacci.get(i - 2) -- складываем числа, полученные в пункте 1.1.2 и 1.1.3 Соответственно. Подробней о том, как мы получили каждое из чисел ниже...
                    1.1.2) numbersOfFibonacci.get(i - 1) -- получаем число из списка numbersOfFibonacci с индексом (i - 1). В первой итерации это 1.
                    1.1.3) numbersOfFibonacci.get(i - 2) -- получаем число из списка numbersOfFibonacci с индексом (i - 2). В первой итерации это 0.
        */
        for(var i = 2; i <= ordinalNumber; i++ ){
            numbersOfFibonacci.add(numbersOfFibonacci.get(i - 1) + numbersOfFibonacci.get(i - 2));
        }

        return numbersOfFibonacci.get(ordinalNumber);
    }

    public static void main(String[] args){
        System.out.println(FibonacciSequence.fib(3));  // Результат вывода 2
        System.out.println(FibonacciSequence.fib(5));  // Результат вывода 5
        System.out.println(FibonacciSequence.fib(10)); // Результат вывода 55
    }
}
