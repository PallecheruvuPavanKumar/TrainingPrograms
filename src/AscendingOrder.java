


@FunctionalInterface
    interface Interface1 {
    void m1(int a,int b);
}

class Demo implements Interface1 {
   public void m1(int a,int b) {
        System.out.println("without lambda Expression :" +(a+b));
    }
}

class Test {
    public static void main(String[] args) {
        Interface1 i=new Demo();
        Interface1 k=( a, b)-> System.out.println("with LambdaExpression :"+(a+b));
        k.m1(10,20);
        i.m1(15,25);
    }
}



