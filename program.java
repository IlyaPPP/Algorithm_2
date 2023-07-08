import java.util.LinkedList;

public class program {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list1.addLast(list.get(i));
        }
        System.out.println(list1);
    }
}