/* Дано задание:
ДНК и РНК — это последовательности нуклеотидов.
Четыре нуклеотида в ДНК это аденин (A), цитозин (C), гуанин (G) и тимин (T).
Четыре нуклеотида в РНК это аденин (A), цитозин (C), гуанин (G) и урацил (U).
Цепь РНК составляется на основе цепи ДНК последовательной заменой каждого нуклеотида:

G -> C
C -> G
T -> A
A -> U
Реализуйте метод dnaToRna(), который принимает на вход цепь ДНК и
возвращает соответствующую цепь РНК (совершает транскрипцию РНК).

Здесь можно почитать про задание https://ru.hexlet.io/challenges/java_basics_rna_exercise
*/


public class DNAtoRNA {
    public static String dnaToRna(String dna) {
        var dnaToUpperCase = dna.toUpperCase();
        var rna = "";
        var allowedCharacters = "GCTA";

        // Проверка на пустую строку
        if(dna.isEmpty()){
            return "String empty.";
        }


        for(var i = 0; i < dna.length(); i++){
            // Каждый раз перебираем строку и если НЕ находим символ из переданной строки в переменной allowedCharacters, то возвращаем ошибку.

            if(!allowedCharacters.contains(Character.toString(dnaToUpperCase.charAt(i)))){
                return "Error! DNA HAS UNKNOWN ELEMENT.";
            } else if(Character.toString(dnaToUpperCase.charAt(i)).equals("C")){
                rna += "G";
            } else if(Character.toString(dnaToUpperCase.charAt(i)).equals("T")){
                rna += "A";
            } else if(Character.toString(dnaToUpperCase.charAt(i)).equals("A")){
                rna += "U";
            } else if (Character.toString(dnaToUpperCase.charAt(i)).equals("G"))
                rna += "C";
        }

        return rna;
    }

    public static void main(String[] args){
        System.out.println(DNAtoRNA.dnaToRna("ACGTGGTCTTAA")); // "UGCACCAGAAUU"
        System.out.println(DNAtoRNA.dnaToRna("CCGTA")); // "GGCAU"
        System.out.println(DNAtoRNA.dnaToRna("")); // ""
        System.out.println(DNAtoRNA.dnaToRna("ACNTG")); // null

    }
}

