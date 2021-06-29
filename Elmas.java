import java.util.Scanner;
public class Elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n= input.nextInt();
        int b, y, i;
        for(i=0; i<=n;i++){
            for(b=1 ;b<=(n-i);b++)
            {
                System.out.print(" ");
            }
            for(y=1; y<=(2*i)-1; y++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        //Alt kısım
        for(i=n-1; i>=1; i--){
            for(b=1; b<=n-i; b++)
            {
                System.out.print(" ");
            }
            for(y=1;y<=2*i-1; y++){
                System.out.print("*");
            }
            System.out.println("");
        }





    }
}
