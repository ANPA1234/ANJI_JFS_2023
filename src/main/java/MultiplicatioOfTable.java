import java.util.Scanner;

public class MultiplicatioOfTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num:");
        int num = sc.nextInt();
        for(int i=1;i<=20;i++){
            System.out.println(String.format("%s * %s = %s",num,i,num*i));
        }
    }
}
