import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Üçgen satır sayısı giriniz: ");
    int a = sc.nextInt();
    for(int i = a;i>0;i--){
        System.out.print("\n");
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
    }
    }
}