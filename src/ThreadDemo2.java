public class ThreadDemo2 {
    public static void main(String[] args){
        Runnable r=()->{
            for(int i=0;i<10;i++){
                System.out.println("child thread");
            }
        };
        Thread t=new Thread(r);
        t.start();
        Thread k=new Thread(r);
        k.start();
    }
}
