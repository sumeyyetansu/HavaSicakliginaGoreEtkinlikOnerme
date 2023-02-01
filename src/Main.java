import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heat ;

        System.out.println("Hava sıcaklığını giriniz");
        heat = scanner.nextDouble();

        if (0<heat && 25 <heat){

            if (heat<5){
                System.out.println("Kayak yapmaya gidebilirsiniz.");
            }
            if (heat<15){
                System.out.println("Piknik yapabilirsiniz.");
            }
            if (heat<25){
                System.out.println("Yüzmeye gidebilirsiniz.");
            }

        }else{

        System.out.println("Yüzmeye gidebilirsiniz");}
    }
}