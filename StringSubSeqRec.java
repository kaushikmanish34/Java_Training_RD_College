import java.util.ArrayList;

public class StringSubSeqRec {
    static ArrayList<String> SubSquence(String s) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char singleCharacter = s.charAt(i);
            if (list.size() == 0) {
                list.add("");
                list.add("" + singleCharacter);
                continue;
            }
            int size = list.size();
            for (int j = 0; j < size; j++) {
                String temp = list.get(j) + singleCharacter;
                if (!list.contains(temp)) {
                    list.add(temp);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(SubSquence("Ravi"));
    }
}