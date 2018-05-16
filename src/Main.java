import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Pair daniel = new Pair("Daniel Düsentrieb", "Raketenbau");
        StringMap2DImpl map2D = new StringMap2DImpl();

        map2D.put("Daniel Düsentrieb", "Raketenbau", "1,8");
        map2D.put("Daniel Düsentrieb", "Physik", "2,9");
        System.out.println(map2D.get("Daniel Düsentrieb", "Raketenbau"));

        System.out.println(map2D.contains("Daniel Düsentrieb", "Raketenbau"));

        Iterator iterator = map2D.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }





    }
}
