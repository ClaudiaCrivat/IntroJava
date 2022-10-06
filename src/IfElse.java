import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //Flow control -if else
        //evalueaza conditii si bifurca codul in functie de rezultat

        System.out.println("Pornim radio");
        boolean piesaFaina = true; //invat calculatorul daca piesa e ok
        //daca piesa e ok, dau mai tare
        if (piesaFaina == true) {
            System.out.println("Dau mai tare radio");
            System.out.println("Incep sa fredonez");
        }
        System.out.println("Oprim radio");

        //if else
        int nr = 4;
        if (nr % 2 == 0) {
            System.out.println("Numarul este par");
        }else {
            System.out.println("Numarul este impar");
        }

        //if, else if, else
        //luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti ora:");
        int ora = sc.nextInt();
        if (ora < 0) {
            System.out.println("Ora invalida");
        } else if (ora <= 12) {
            System.out.println("Neata");
        }else if (ora <= 18) {
            System.out.println("Buna ziua!");
        }else if (ora <= 22) {
            System.out.println("Buna seara!");
        } else if (ora <= 24) {
            System.out.println("Noapte buna!");
        }else{
            System.out.println("Ora invalida");
        }

        //flow control
        //switch - se foloseste cand stim valorile posibile
        System.out.println("Alege optiunea");
        int optiune = sc.nextInt();
        switch (optiune) {
            case 0:
                System.out.println("Meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("eng");
                break;
            default:
                System.out.println("optiune invalida");
        }
    } //inchide functia main
}
