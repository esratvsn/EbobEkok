import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok;
        System.out.print("Bir sayı giriniz: ");
        n1 = input.nextInt();
        System.out.print("Bir sayı daha giriniz: ");
        n2 = input.nextInt();

        // EKOK = (n1*n2) / EBOB
        
        int k = 1;
        if (n1 < n2) {
            k = n1;
        } else {
            k = n2;
        }
        while (k >= 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("iki sayının EBOB'u: " + ebob);
                break;
            }
            k--;

        }
        int i=1;
        while(i<=(n1*n2)){
            if(i%n1==0 && i%n2==0){
                System.out.println("İki sayının EKOK'u: " +i);
                break;
            }
            i++;
        }

    }
}