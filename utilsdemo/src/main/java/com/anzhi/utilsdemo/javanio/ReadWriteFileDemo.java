package com.anzhi.utilsdemo.javanio;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.util.stream.Collectors;

/**
 * 读写文件
 */
public class ReadWriteFileDemo {
    public static void main(String[] args) throws Exception{
        String sourcePath = "src/main/resources/sourcepath";
        String targetPath = "src/main/resources/targetpath/001.txt";
        File file = new File(sourcePath);
        File[] files = file.listFiles();
        for(File sourceFile : files){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile), "GBK"));
            BufferedWriter targetWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(targetPath), "GBK"));
            
            // 统计文件行数
            LineNumberReader lineNumberReader = new LineNumberReader(bufferedReader);
            lineNumberReader.skip(sourceFile.length());
            int lineNumber = lineNumberReader.getLineNumber();

            System.out.println("----- 文件行数为：" + lineNumber);
            String bufferLine = null;
            while((bufferLine = bufferedReader.readLine()) != null){
                targetWriter.write(bufferLine);
                
                targetWriter.newLine();
                targetWriter.flush();
            }
        }
    }
}
