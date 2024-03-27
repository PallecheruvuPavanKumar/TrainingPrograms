import java.util.List;

public class Checking {
    public static void main(String[] args){
        List<String> names=List.of("Pavan","Kumar","Theja");
        int jk=1;
        for(int i=0;i<jk;i++){
            for(int j=0;j<names.size();j++){
                if(names.get(j).equals("Theja")){
                    System.out.println(names.indexOf("Theja"));
                }
            }
        }
    }
}
