/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.locks;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.List;
import java.util.concurrent.TimeUnit;
import model.States;
import util.StatesDaoJava7;

/**
 *
 * @author vdoxx
 */
public class FileReeader {

    public static FileChannel fileChannel;
    public static RandomAccessFile randomAccessFile;
    public static String filePath = "E:\\Customer-large-file-size\\GitHub\\2019\\poc\\java1_8\\src\\filelocktest.txt";

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

        List<States> statesList = StatesDaoJava7.initStates();
        writeToFileWithLock(filePath, statesList);
        System.out.println("main method end");

    }

    private static void writeToFileWithLock(String filePath, List<States> statesList) throws FileNotFoundException, IOException, InterruptedException {

        randomAccessFile = new RandomAccessFile(filePath, "rw");
        fileChannel = randomAccessFile.getChannel();
        ByteBuffer buffer = null;
        FileLock fileLock = fileChannel.tryLock();
        if (fileLock != null) {
            buffer = ByteBuffer.wrap(statesList.toString().getBytes());
            Thread.sleep(50000);
            buffer.put(statesList.toString().getBytes());
            buffer.flip();
            while (buffer.hasRemaining()) {
                fileChannel.write(buffer);
            }
        }
    }

}
