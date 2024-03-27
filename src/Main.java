import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<Character,Integer> countS=new HashMap<>();
       String myName="Pavan Kumaru p Reddy aa".toLowerCase();
           char[] charArray = myName.toCharArray();
        for (char c : charArray) {
            if (countS.containsKey(c)) {
                countS.put(c,countS.get(c)+1);
            }
            else{
                countS.put(c,1);
            }
        }
        System.out.println(countS);
    }
}