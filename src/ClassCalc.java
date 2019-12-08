import java.util.Scanner;

public class ClassCalc {
    static Scanner in;
    public static int getInt(String val){
        int v;
        do{
            System.out.print(val);
            try {
                v = in.nextInt();
            }
            catch (Exception e) {
                System.out.println("Вы ввели неверное число");
                in.nextLine();
                continue;
            }
            break;
        }while(true);
        return v;
    }

    public static void main(String[] args) {

        in = new Scanner(System.in);
        int num1 = getInt("Введите первое число: ");
        int num2 = getInt("Введите второе число: ");
        System.out.println("Выберите номер операции: ");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");
        System.out.println("5 - вычисление остатка от деления целых чисел");
        int znak;
        do {
            znak = getInt("Введите число [1-5]:");
        }while(znak <1 || znak > 5);
        int res=0;
        switch (znak) {
            case 1:
                res=num1+num2;
                break;
            case 2:
                res=num1-num2;
                break;
            case 3:
                res=num1*num2;
                break;
            case 4:
               while (num2==0)
                {
                    System.out.println("На ноль делить нельзя, замените второе число");
                    num2 = getInt("Введите второе число: ");
                }
                res=num1/num2;
                break;
            case 5:
                res=num1%num2;
                break;
            default:
                break;
        }
        in.close();
        System.out.print("Результат: ");
        System.out.print(res);
    }

}
