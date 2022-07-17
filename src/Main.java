import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("src/voina.txt" + " ");
//        Parser parser = new Parser();
//        ArrayList<String> lines = parser.parse(file);
//        for (String line : lines) {
//            System.out.println(line);

        {
            File f1 = new File("src/voina.txt"); //Создание файлового дескрипта для входного файла
            String[] words;  //Инициализируем слово Array
            FileReader fr = new FileReader(f1);  //Cоздание обьекта File Reader
            BufferedReader br = new BufferedReader(fr); //Cоздание обьекта BufferedReader
            String s;
            int count = 0;
            while ((s = br.readLine()) != null)   // Чтение содержимого файла
            {
                words = s.split(" ");  // Разделение слов пробелом
                for (String word : words) {
                    Pattern input = Pattern.compile("[Cс]традан");
                    Matcher matcher = input.matcher(word);
                    while (matcher.find()) { // Поиск заданного слова
                        count++; // Если слово найдено, увеличиваем значение на единицу
                    }
                }
            }
            if (count != 0)  // Проверяем не равно ли значение счетчика нулю
            {
                System.out.println("The given word is present for " + count + " Times in the file");
            } else {
                System.out.println("The given word is not present in the file");
            }

            fr.close();
        }
        List<String> strings = new ArrayList<String>(); // Cоздание динамического массива
        Scanner sc;

        try {
            sc = new Scanner(file); // Чтение файла при помощи сканера
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                //.trim() осуществляет обрезание пробелов
                strings.add(line);
                //   System.out.println(line); //печать строки в стандартный вывод
            }
            int x = 0;
            {
                for (String word : strings) {
                    Pattern put = Pattern.compile("[Cс]традан");
                    Matcher m = put.matcher(word);
                    while (m.find()) { // Поиск заданного слова
                        x++; // Если слово найдено, увеличиваем значение на единицу
                    }
                }
            }
            if (x != 0)  // Проверяем не равно ли значение счетчика нулю
            {
                System.out.println("The given word is present for " + x + " Times in the file");
            } else {
                System.out.println("The given word is not present in the file");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        int i = 1;

        while (i <= 10) {
            int j = 1;

            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println("");
            i++;
        }

    }
}



























