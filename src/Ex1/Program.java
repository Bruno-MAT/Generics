package Ex1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintService<String> ps = new PrintService<>();
        // colocamos o tipo que desejarmos na linha acima e fazer as alterações no decorrer do código

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i< n; i++){
            String value = sc.next();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }

}
