


//Верное решение, сделал со второго раза :)

public class App {
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
}

App.fizzBuzz(20,21);

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





// Тоже верное решение, но я зачем-то сделал проверку на минимальное и максимально число. Тем самым, даже если вызвать метод вот так `App.fizzBuzz(20,21)`;
public class App {
    public static void fizzBuzz(int int1, int int2) {
        var whatIsMaxInt = 0;
        var whatIsMinInt = 0;

        if(int1 > int2){
            whatIsMaxInt = int1;
            whatIsMinInt = int2;
        }else{
            whatIsMaxInt = int2;
            whatIsMinInt = int1;
        }


        for(var i = whatIsMinInt; i <= whatIsMaxInt; i++){

            if(whatIsMinInt > whatIsMaxInt){
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
}
