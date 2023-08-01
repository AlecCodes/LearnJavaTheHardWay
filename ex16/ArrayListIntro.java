import java.util.ArrayList;

public class ArrayListIntro{
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println( "ArrayList has size(): " + arr.size());

        arr.add("Ant-man");
        arr.add("Hulk");
        arr.add("Thor");
        arr.add("Iron Man");
        arr.add("Wasp");

        System.out.println( "ArrayList has size(): " + arr.size());
        System.out.println("Current Contents:" + arr );
        showList(arr);

        arr.add(3, "Jarvis"); //inserts into slot 3
        showList(arr);

        int i = arr.indexOf("Hulk");
        System.out.println(arr.get(i) + " is located in slot " + i);
        arr.remove(i);
        showList(arr);

        arr.add(1, "Captain America");
        showList(arr);

        arr.set(1, "Cap"); //set replaces value in slot 1
        arr.remove(5);
        arr.remove(4);
        arr.remove(2);
        arr.remove(0);
        showList(arr);

        arr.add("Hawkeye");
        arr.add("Quicksilver");
        arr.add("Scarlet Witch");
        showList(arr);

        i = arr.indexOf("Hawkeye");
        String removed = arr.remove(i)
        arr.add(i-1, removed);
        showList(arr);

        System.out.println("Current contents: " + arr );

    }
}