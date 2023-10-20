import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students one = new Students("Alex", "Popov", 20);
        Students two = new Students("Masha", "Ivanova", 22);
        Students three = new Students("Aleksandr", "Popovich", 25);


        List<Students> numberGroup = new ArrayList<>();
        numberGroup.add(one);
        numberGroup.add(two);
        numberGroup.add(three);

        System.out.println(numberGroup);
        numberGroup.sort(new StudentsComporator());

        System.out.println(numberGroup);

    }
}