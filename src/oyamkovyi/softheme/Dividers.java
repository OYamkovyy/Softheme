package oyamkovyi.softheme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Oleksandr on 13.04.2017.
 */
public class Dividers {
    public static void main(String[] args) {
        System.out.println("Input number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> divs = new ArrayList<>();

        for (int i=1;i<=n/2;i++){
            if (n%i==0) divs.add(i);
        }

        System.out.println(divs.toString());
    }
}
