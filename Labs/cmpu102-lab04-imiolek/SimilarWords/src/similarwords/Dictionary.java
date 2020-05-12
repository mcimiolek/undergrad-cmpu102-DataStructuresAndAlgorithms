package similarwords;

import java.io.*;


public class Dictionary {
    
    private String[] wordTable;
    private String[] reducedWordTable;
    
    public Dictionary() throws IOException {
        this("dictionary.txt");
    }

    public Dictionary(String filename) throws IOException {
        File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int length = Integer.parseInt(bufferedReader.readLine());
        wordTable = new String[length];
        reducedWordTable = new String[length];
        for (int i = 0; i < length; i++) {
            String word = bufferedReader.readLine();
            wordTable[i] = word;
            reducedWordTable[i] = reduce(word);
        }
    }
    
    public String similarWords(String word) {
        String redWord = reduce(word);
        String answer = "";
        for(int i=0; i<reducedWordTable.length; i++){
            if(redWord.equals(reducedWordTable[i])){
                answer = answer + wordTable[i] + " ";
            }
        }
        return answer;
    }
    
    public static boolean isVowel(char c){
        String VOWELS = "aeiou";
        int inVowels = VOWELS.indexOf(c);
        
        if(inVowels > -1){
            return true; }
        else{
            return false;}
    }
    
    public static String reduce(String word){
        String reducedWord = "";
        String lowWord = word.toLowerCase();
        
        for(int i=0; i< word.length(); i++){
            if((i==0) && isVowel(lowWord.charAt(i))) {
                reducedWord = reducedWord + "!";}
            else if(i == (word.length()-1)){
                    reducedWord = reducedWord + lowWord.charAt(i);}
            else if(!(isVowel(lowWord.charAt(i))) && (i < word.length() -1)){
                if(!(lowWord.charAt(i) == lowWord.charAt(i+1))){
                    reducedWord = reducedWord + lowWord.charAt(i);}
            }

        }
        return reducedWord;
    }
}

