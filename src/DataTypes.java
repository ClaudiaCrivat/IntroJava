public class DataTypes {
    public static void main(String[] args) {
        //cele mai folosite 4 tipuri de date

        //String = sir de caractere delimitate de " "
        String marca = "Dacia";
        String model = "1310";

        //integer = numar intreg,(int)
        int an_fabricatie = 1987;

        //double = numar zecimal
        double pret = 2300.50;

        //boolean = adevarat/false
        boolean inmatriculata = true;

        //char = un singur caracter #, $, 2, d
        char nota = 'A';

        System.out.println(marca.toUpperCase());
        System.out.println("Masina este din anul:" + an_fabricatie);
        System.out.println(marca.length());
    }
}
