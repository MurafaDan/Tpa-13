import java.util.ArrayList;
import java.util.List;

public class Metods {
    public void daylist(List<String>tasks){
        tasks.add("TPA12");
        tasks.add("TPA13");
        tasks.add("Sleep");
        tasks.add("Eat");
        tasks.add("Drink water");
        tasks.add("Read");
        tasks.add("OOP in C++");
        tasks.add("TPA13");
        tasks.add("TPA13");
        tasks.add("TPA13");

        System.out.println(tasks);
    }

    public void unic(List<String>list){

        List<String>clear = new ArrayList<>();

        for (String element: list){
            if (!clear.contains(element)){
                clear.add(element);
            }

        }
        System.out.println(clear);

    }

    public void words(){
        List<String>romana = new ArrayList<>();
        List<String>engleza = new ArrayList<>();

        romana.add("Cer");
        engleza.add("Sky");

        romana.add("casti");
        engleza.add("Headphones");

        romana.add("Tastiera");
        engleza.add("Keyboard");

        romana.add("pat");
        engleza.add("Bed");

        romana.add("cablu");
        engleza.add("Cable");

        romana.add("Soricel");
        engleza.add("Mouse");

        romana.add("podea");
        engleza.add("Floor");

        romana.add("pix");
        engleza.add("Pen");

        romana.add("cheie");
        engleza.add("Key");

        romana.add("usa");
        engleza.add("door");

        if (romana.size()==engleza.size()){
            for (int i = 0; i < romana.size() ; i++) {

                System.out.println(romana.get(i)+" in engleza va fi:"+engleza.get(i));

            }
        }


    }


}
