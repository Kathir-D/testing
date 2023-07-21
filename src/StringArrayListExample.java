import java.util.ArrayList;

public class StringArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("apple");
        stringArrayList.add("cucumber");
        stringArrayList.add("tomato");
        stringArrayList.add("potato");
        stringArrayList.add("something");


        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }

    }
}
