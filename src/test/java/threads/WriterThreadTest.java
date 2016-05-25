package threads;

import org.junit.Test;
import threads.WriterThread;

import java.util.ArrayList;
import java.util.List;

public class WriterThreadTest {

    @Test
    public void test001() throws InterruptedException {

        List<WriterThread> threadList = new ArrayList<WriterThread>();

        for (int i = 0; i < 100; i++) {
            WriterThread writerThread = new WriterThread("Thread_"+i,100);
            writerThread.start();
            threadList.add(writerThread);
        }

        // Aguarda todas as threads morrerem
        for (WriterThread writerThread : threadList) {
            writerThread.join();
        }

    }

}
