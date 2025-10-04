import java.util.Scanner;

public class fibtoten {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Введите число: ");
         String fibcc = scan.nextLine();
         int count = fibcc.length();
         if (fibcc.equals("0")) {
            System.out.println("Десятичное значение: 0");
            return;
         }
         if (fibcc.equals("1")) {
            System.out.println("Десятичное значение: 1");
            return;
         }
         if (fibcc.matches("[01]+")) {
             System.out.println("число указано верно");
         } else { 
             System.out.println("Строка содержит неподходящие символы");
             return;
         }
         int[] fib =new int [count];
         if (count > 0) fib[0]=1;
         if (count > 1) fib[1]=2;
         for (int i = 2; i < count; i++) {
             fib[i]=fib[i-1]+fib[i-2];
         }
         int dec = 0;
         for (int i = 0 ;i < count;i++) {
            if (fibcc.charAt(i) == '1') {
                dec += fib[count-i-1];
            }
         }
         System.out.println("Десятичное значение: " + dec);
        scan.close();
    }
}
         