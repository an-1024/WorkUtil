package com.anzhi.utilsdemo.javanio;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
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

            //bufferedReader.mark((int)sourceFile.length() + 1);
            // 统计文件行数, 创建新的 FileReader 对象统计行数
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(sourceFile));
            lineNumberReader.skip(sourceFile.length());
            int lineNumber = lineNumberReader.getLineNumber();
            // 重置文件指针
            //bufferedReader.reset();

            System.out.println("----- 文件行数为：" + lineNumber);
            
            String bufferLine;
            while((bufferLine = bufferedReader.readLine()) != null){
                targetWriter.write(bufferLine);
                targetWriter.newLine();
                targetWriter.flush();
            }
        }
    }
}
