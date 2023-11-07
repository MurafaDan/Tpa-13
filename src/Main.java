import java.util.ArrayList;
import java.util.List;

//1.	Creați o metodă ce va returna lista lucrurilor care trebuie să le faceți astăzi. Afișați lista la ecran.
//2.	Definiți o metodă care va primi drept argument o listă de valori de tip String și va returna o
//colecție de valori unice. Lista primită ca argument poate conține valori duplicate. Afișați colecția cu valori unice la ecran.
// 3.	Creați un program în care veți simula un dicționar englez-român pentru 10 cuvinte. Afișați cuvintele
// și traducerile lor corespunzătoare la ecran.
public class Main {
    public static void main(String[] args) {

        Metods metods = new Metods();
        List<String>tasks = new ArrayList<>();
        System.out.println("EX1");
        metods.daylist(tasks);

        System.out.println("EX2");
        metods.unic(tasks);

        System.out.println("EX3");
        metods.words();


    }
}