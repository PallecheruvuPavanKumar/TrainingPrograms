
@FunctionalInterface
interface Interface2{
   int  m2(String s);
}
class GetLength  {
    public static void main(String[] args){
        Interface2 k=s-> s.length();
        System.out.println(k.m2("pavanFeddy"));

    }
}
