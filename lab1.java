import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        System.out.println("Ввдеите 4 числа типа int");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        int d = console.nextInt();
        if ( a<= b & a <= c & a <= d){
            System.out.println("Минимальное число:"+a);
        }
        else if (b <= a & b <= c & b <= d){
            System.out.println("Минимальное число:"+b);
        }
        else if (c <= b & c <= a & c <= d){
            System.out.println("Минимальное число:"+c);
        }
        else if (d <= a & d <= b & d <= c){
            System.out.println("Минимальное число:"+d);
        }

    }
}
