public class HelloString {
    public String sayHello(){
        return "HelloWorld";
    }

    public static void main(String[] args) {
        System.out.println(new HelloString().sayHello());
    }
}
