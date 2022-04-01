package lambda.test01.sample01;

public class RunableTestMain {
    public static void main(String[] args) {
        Thread thr = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 10; i++) {
                    System.out.println("> " + i);
                    try { Thread.sleep(1000); } catch(InterruptedException e) {}
                }
            }
        });
        thr.start();

        ///////////////////////////////////////////////////////////
        Runnable runnable = null;
        runnable = () -> {
            for(int i = 0; i < 10; i++) {
                System.out.println(">> " + i);
                try { Thread.sleep(1000); } catch(InterruptedException e) {}
            }
        };
        runnable.run();

        ///////////////////////////////////////////////////////////
        thr = new Thread(runnable);
        thr.start();

    }

}
