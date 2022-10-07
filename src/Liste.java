import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        //declaram o lista goala
        List<String> fructe = new ArrayList<>();
        //au dimensiune dinamica

        //adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //luam elemente
        System.out.println(fructe.get(0));

        //aflam indexul unui element
        System.out.println(fructe.indexOf("banana"));

        //scoatem un element
        fructe.remove("mar");

        //listam elemente
        System.out.println(Arrays.toString(fructe.toArray()));

        //dimensiunea listei
        System.out.println(fructe.size());

        //declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
        System.out.println(Arrays.toString(numere.toArray()));

        //declaram o lista dinamica
        String[] flowers = {"Ageratum", "Allium", "Poppy"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(flowerList);


    }
}
