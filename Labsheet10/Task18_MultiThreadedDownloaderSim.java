package Labsheet10;

import java.io.FileOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
18. Multi-threaded file downloader simulation where threads download chunks of a file concurrently.
    This is a simulation: threads write chunk data to parts of a local file.
*/
public class Task18_MultiThreadedDownloaderSim {
    static class ChunkWriter implements Runnable {
        private final String filename; private final int offset; private final byte value;
        ChunkWriter(String f,int o,byte v){ filename=f; offset=o; value=v; }
        public void run() {
            try (FileOutputStream fos = new FileOutputStream(filename, true)) {
                // append simulated chunk data
                byte[] buf = new byte[1024];
                for (int i=0;i<buf.length;i++) buf[i] = value;
                fos.write(buf);
                System.out.println(Thread.currentThread().getName() + " wrote chunk with byte " + value);
            } catch (Exception e) { e.printStackTrace(); }
        }
    }

    public static void main(String[] args) throws Exception {
        String file = "download_sim.bin";
        ExecutorService ex = Executors.newFixedThreadPool(4);
        for (int i=0;i<8;i++) ex.submit(new ChunkWriter(file, i*1024, (byte)(i+1)));
        ex.shutdown();
        while (!ex.isTerminated()) Thread.sleep(100);
        System.out.println("Download simulation completed. File: " + file);
    }
}
