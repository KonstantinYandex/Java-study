/*Дано задание:

Реализуйте метод fizzBuzz(), который выводит на экран числа в диапазоне от begin до end. При этом:

Если число делится без остатка на 3, то вместо него выводится слово Fizz
Если число делится без остатка на 5, то вместо него выводится слово Buzz
Если число делится без остатка и на 3, и на 5, то вместо числа выводится слово FizzBuzz
В остальных случаях выводится само число
Метод принимает два параметра (begin и end), определяющих начало и конец диапазона (включительно).
 Если диапазон пуст (в случае, когда begin > end), то метод просто ничего не печатает.

 Подробней почитать о задаче здесь https://ru.hexlet.io/challenges/java_basics_fizzbuzz_exercise
*/

public class FizzBuzz {
    public static void fizzBuzz(int int1, int int2) {

        for(var i = int1; i <= int2; i++){

            if(int1 > int2){
                System.out.println("");
            } else if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args){
        FizzBuzz.fizzBuzz(11,20);
    }

}

;

//Результат будет вот такой:

//11
//Fizz
//13
//14
//FizzBuzz
//16
//17
//Fizz
//19
//Buzz

