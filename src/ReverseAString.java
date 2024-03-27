public class ReverseAString {
    public static void main(String [] args){
        String name="Pavan";
        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder append = stringBuilder.append(name);
        System.out.println(append);
        StringBuilder reverse = append.reverse();
        System.out.println(reverse);

        String name1="Kumar";
        String name2 = "";
        for(int i=0;i<name1.length();i++){
            char c = name1.charAt(i);
            name2=c+name2;
        }
        System.out.println(name2);
    }
}
