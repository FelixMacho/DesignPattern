package Example4;

public class Example4 {
    public static void main(String[] args) {
        MyList<String> lst = new ListUser<String>();
        lst.addTail("Eins");
        lst.addTail("Zwei");
        lst.addTail("Drei");
        System.out.println(lst);
        lst.delHead();
        System.out.println(lst);
    }
}
