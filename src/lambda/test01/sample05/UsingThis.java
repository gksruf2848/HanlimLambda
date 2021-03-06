package lambda.test01.sample05;

public class UsingThis {

    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            MyFunctionalInterface fi = () -> {
                System.out.println("outterField : " + outterField);
                System.out.println("outterField : " + UsingThis.this.outterField);

                System.out.println("innerField : " + innerField);
                System.out.println("innerField : " + this.innerField);
            };
            fi.method();
        }
    }
}
