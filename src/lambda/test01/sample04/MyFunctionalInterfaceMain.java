package lambda.test01.sample04;

public class MyFunctionalInterfaceMain {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x, y) -> {
            int result = x * y;
            return result;
        };
        System.out.println("result 1 : " + fi.method(4, 5));

        fi = (x, y) -> { return (x * y); };
        System.out.println("result 2 : " + fi.method(4, 5));

        fi = (x, y) -> (x * y);
        System.out.println("result 3 : " + fi.method(4,5));

        fi = (x, y) -> sum(x, y);
        System.out.println("result 4 : " + fi.method(4, 5));

    }

    public static int sum(int a, int b) {
        return (a + b);
    }
}
