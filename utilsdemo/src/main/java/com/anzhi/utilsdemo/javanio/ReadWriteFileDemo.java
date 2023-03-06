package com.anzhi.utilsdemo.javanio;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 读写文件
 */
public class ReadWriteFileDemo {
    public static void main(String[] args) throws Exception{
        String sourcePath = "src/main/resources/sourcepath";
        String targetPath = "src/main/resources/targetpath/2.txt";
        File file = new File(sourcePath);
        File[] files = file.listFiles();
        for(File sourceFile : files){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile), "utf-8"));
            BufferedWriter targetWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(targetPath), "utf-8"));
            String bufferLine = null;
            while((bufferLine = bufferedReader.readLine()) != null){
                targetWriter.write(bufferLine);
                targetWriter.flush();
            }
        }
    }
}
