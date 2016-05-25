package threads;

public class WriterThread extends Thread {

    private String text = "";
    private int times = 0;

    public WriterThread(String text, int times) {
        this.text = text;
        this.times = times;
    }

    public void run() {
        System.out.println("Deve escrever \""+text+"\" "+times+" vezes.");
        for (int i = 0; i < times; i++) {
            System.out.println(text + " (" + i + ")");
            try {
                this.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
