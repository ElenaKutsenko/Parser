import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class FileWordSearch
{
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/voina.txt" + "");
        Parser parser = new Parser();
        ArrayList<String> lines = parser.parse(file);
        for (String line: lines) {
            System.out.println(line);

            String[] words= null;
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            String input="старадан";
            int count=0;
            while((s=br.readLine())!=null)
            {
                words=s.split(" ");
                for (String word : words)
                {
                    if (word.equals(input))
                    {
                        count++;
                    }
                }
            }
            if(count!=0)
            {
                System.out.println("The given word is present for "+count+ " Times in the file");
            }
            else
            {
                System.out.println("The given word is not present in the file");
            }

            fr.close();
        }
//
//        int result = '\n';
//        for (int i = 1; i < 11; i++) {
//            for (var j = 1; j < 11; j++) {
//                result += (i*j) + ' ';
//            }
//            result += '\n';
        }}}

