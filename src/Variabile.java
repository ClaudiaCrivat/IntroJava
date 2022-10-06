public class Variabile {
    public static void main(String[] args) {
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";
//limbaj strongly typed

        System.out.println("Am cumparat o masina marca:" + marcaMasina);
        System.out.println("Am cumparat o masina modelul:" + modelMasina);

        //suprascriere
        modelMasina = "XC 60 facelift";
        System.out.println("Am cumparat o masina marca:" + marcaMasina);
        System.out.println("Am cumparat o masina modelul:" + modelMasina);

        //declarare
        String nume;
        String prenume;
        //initializare
        prenume = "Claudia";
        nume = "Crivat";
        int varsta = 25;
        //concatenare de stringuri
        System.out.println(prenume + " " + nume + " cu varsta de " + varsta + " ani");
    }
}
