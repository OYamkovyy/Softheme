package oyamkovyi.softheme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Oleksandr on 13.04.2017.
 */
public class Sequence {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("input.txt"));
        if (!sc.hasNext()) throw new RuntimeException("INPUT.TXT is empty!!!");
        String input = sc.next();
        char[] array = input.toCharArray();

        int maxSeq = 0;
        int localMax = 0;

        if (array[0] == '1') localMax++;
        maxSeq = localMax; //if array length = 1

        for (int i = 1; i < array.length; i++) {
            if ((array[i] == '1') && (array[i - 1] == '0')) {
                localMax++;
            }

            if ((array[i] == '1') && (array[i - 1] == '1')) {
                localMax++;
            }

            if ((i == array.length - 1) || ((array[i] == '0') && (array[i - 1] == '1'))) {
                if (maxSeq < localMax) maxSeq = localMax;
                localMax = 0;
            }
        }

        PrintWriter writer = new PrintWriter("output.txt");
        writer.println(maxSeq);
        writer.close();
    }
}
