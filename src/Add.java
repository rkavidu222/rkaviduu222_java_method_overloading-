public class Add {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(Add.add(25,35));
        System.out.println(Add.add(45,53,22));
    }
}
