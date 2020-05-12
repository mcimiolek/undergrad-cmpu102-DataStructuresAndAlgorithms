package similarwords;

import java.io.*;

public class SimilarWords {

    public static void main(String args[]) throws IOException {
        Dictionary dictionary = new Dictionary("C:\\Users\\mcimi\\Desktop\\cmpu-102\\Labs\\cmpu102-lab04-imiolek\\SimilarWords\\src\\similarwords\\dictionary.txt");
        
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedKeyboardReader = new BufferedReader(inputStreamReader);

        do {
            System.out.print("Enter a word: ");
            String word = bufferedKeyboardReader.readLine();
            word = word.trim();
            word = word.toLowerCase();
            if (word.length() == 0) {
                break;
            }
            String similarWords = dictionary.similarWords(word);
            System.out.println(similarWords);
        } while (true);
    }
}
