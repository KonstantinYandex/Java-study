public class App {
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
}




System.out.println(App.dnaToRna("ACGTGGTCTTAA")); // результат должен быть такой "UGCACCAGAAUU"