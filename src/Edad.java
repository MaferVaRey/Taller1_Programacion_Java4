import java.util.Scanner;
import java.time.LocalDate;
public class Edad {

    public static void main (String [] args){

        LocalDate currentDate = LocalDate.now();
        int day=currentDate.getDayOfMonth();
        int month=currentDate.getMonthValue();
        int year=currentDate.getYear();
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su año de nacimiento: ");
        int apio = sc.nextInt();
        System.out.println("Ingrese su mes (en números) de nacimiento: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese su día (del mes) de nacimiento: ");
        int dia = sc.nextInt();

        if (month>mes){
            age = year - apio;
        }
        else if (month == mes){
            if (day == dia || dia < day){
                age = year - apio;
            }
            else{
                age = (year-1) - apio;
            }
        }
        else{
            age = (year-1)-apio;
        }

        System.out.println("Su edad es: "+ age);

    }
}
