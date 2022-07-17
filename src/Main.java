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
            File f1 = new File("src/voina.txt"); //�������� ��������� ��������� ��� �������� �����
            String[] words;  //�������������� ����� Array
            FileReader fr = new FileReader(f1);  //C������� ������� File Reader
            BufferedReader br = new BufferedReader(fr); //C������� ������� BufferedReader
            String s;
            int count = 0;
            while ((s = br.readLine()) != null)   // ������ ����������� �����
            {
                words = s.split(" ");  // ���������� ���� ��������
                for (String word : words) {
                    Pattern input = Pattern.compile("[C�]������");
                    Matcher matcher = input.matcher(word);
                    while (matcher.find()) { // ����� ��������� �����
                        count++; // ���� ����� �������, ����������� �������� �� �������
                    }
                }
            }
            if (count != 0)  // ��������� �� ����� �� �������� �������� ����
            {
                System.out.println("The given word is present for " + count + " Times in the file");
            } else {
                System.out.println("The given word is not present in the file");
            }

            fr.close();
        }
        List<String> strings = new ArrayList<String>(); // C������� ������������� �������
        Scanner sc;

        try {
            sc = new Scanner(file); // ������ ����� ��� ������ �������
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                //.trim() ������������ ��������� ��������
                strings.add(line);
                //   System.out.println(line); //������ ������ � ����������� �����
            }
            int x = 0;
            {
                for (String word : strings) {
                    Pattern put = Pattern.compile("[C�]������");
                    Matcher m = put.matcher(word);
                    while (m.find()) { // ����� ��������� �����
                        x++; // ���� ����� �������, ����������� �������� �� �������
                    }
                }
            }
            if (x != 0)  // ��������� �� ����� �� �������� �������� ����
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



























