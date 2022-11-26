import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);


        int x = first.nextInt();  // the amount of money .
        int k = first.nextInt();  // the number of years the money is kept.
        //
        int p = 10;  // percentage per year.
        //
        int a = 0;
        //
        for (int i = x; a < k; x += (x / 100) * p) {
            a++;
        }
        System.out.println(x + " This is the amount of money you will receive if you" +
                " keep your money in our Bank for " + k + " years.");
                  //Не слишком ли много самодеятельности с моей стороны?
                  //Я просто подумал, что это будет немного интереснее.
                  //Я имею в виду сканер.
              

    }
}
