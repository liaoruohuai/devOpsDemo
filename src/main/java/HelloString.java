import static java.lang.Thread.sleep;

public class HelloString {
    public String sayHello(){
        return "HelloWorld";
    }

    public static void main(String[] args) {
        System.out.println(new HelloString().sayHello());
        long count=0;
        while (1==1)
        {
            count++;
            System.out.println(count + " Second Passed");
            try{
             sleep(1000);
            }catch (InterruptedException e) {
                System.err.println("Interrupted");
            }
        }
    }
}
