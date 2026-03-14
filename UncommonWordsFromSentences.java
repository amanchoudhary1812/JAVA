import java.util.*;

public class UncommonWordsFromSentences {

    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] words = (s1 + " " + s2).split(" ");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> result = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first sentence: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second sentence: ");
        String s2 = sc.nextLine();

        String[] result = uncommonFromSentences(s1, s2);

        System.out.println("Uncommon words:");

        for (String word : result) {
            System.out.print(word + " ");
        }

        sc.close();
    }
}