import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.println("Enter a string: ");
        String st = sc.nextLine();
        for (int i = 0; i < st.length(); i++){
            if (list.size() > 1 && st.charAt(i) <= list.getLast() && list.contains(st.charAt(i))){
                list.clear();
            }
            list.add(st.charAt(i));
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character : max){
            System.out.print(character);
        }
    }
}
