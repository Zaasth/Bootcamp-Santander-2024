package edu.wellinton.testes.SetTimeOut;
//Link de onde vi https://stackoverflow.com/questions/26311470/what-is-the-equivalent-of-javascript-settimeout-in-java
public class ExecutarComDelay {
    public static void main(String[] args) {

        setTimeout(() -> System.out.println("test"), 1000);

    }
    public static void setTimeout(Runnable runnable, int delay){
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            }
            catch (Exception e){
                System.err.println(e);
            }
        }).start();
    }
}
