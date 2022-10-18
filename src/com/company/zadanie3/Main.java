package com.company.zadanie3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //dodac faktyczny path caly
        String textFile = "liczby.txt";
        String line = "";
        String textsplitBy = " , ";
        String delimiter = " ";
        boolean firstLine = true;
        try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
            while ((line = br.readLine()) != null) {
                switch (delimiter) {
                    case "1":
                        delimiter.equalsIgnoreCase(" , ");
                        break;
                    case "2":
                        delimiter.equalsIgnoreCase(" ; ");
                        break;
                    case "3":
                        delimiter.equalsIgnoreCase(" \t ");
                    case "4":
                        delimiter.equalsIgnoreCase(" || ");
                }


//                if(firstLine){
//                    delimiter = determineDelimiter(line);
//                    if(delimiter.equalsIgnoreCase(" ")){
//                        System.out.println("Spacja");
//                    } else if (delimiter.equalsIgnoreCase(textsplitBy)){
//                        System.out.println("Przecinek");
//                    }else if(delimiter.equalsIgnoreCase("\t")){
//                        System.out.println("Tabulator");
//                    }
//                    firstLine = false;
//                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> delimiterList = Arrays.asList(",", ";", "\t", "|", " ");

    private static String determineDelimiter(String text) {
        for (String delimiter : delimiterList) {
            if (text.contains(delimiter)) {
                return delimiter;
            }
        }
        return "";
    }
}

//switch case zamiast ifow
//metoda na kazde zadanie ktore prosto dodaje do pliku po przecinku
// zobaczyc co z tym readerem pliku why nie dziala
