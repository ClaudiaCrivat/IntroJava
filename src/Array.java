public class Array {
    public static void main(String[] args) {
        //declarare si initializare
        String[] elevi = {"Gigel", "Costel","Mari", "Ela","Ada"};
        int[] numere = {1, 33, 81, 99, 201};
        //contine mai multe elemente de acelasi tip
        //accesam elementele prin index, care incepe de la 0
        //are dimensiune fixa

        System.out.println(elevi[0]);
        System.out.println(elevi[1]);
        elevi[2] = "Sebi";//suprascriere
        System.out.println(elevi[2]);
        System.out.println(elevi.length);
        System.out.println(elevi[0] + " " + elevi[1]);

        //printam ultimul elem. indiferent de marime
        System.out.println("Last place:" + elevi[elevi.length-1]);

        //declarare si alocare de memorie
        int[] note = new int[5];
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;
    }
}
