package com.example;


import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList; 
 
public class App 
{
    public static void main( String[] args )
    {
        ImmutableList<String>lis=ImmutableList.of("Apple","Cherry","Lichee");
        System.out.println(lis);
        
        File sourceFile=new File("source.txt");
        File destFile=new File("destination.txt");
        
        try{
        FileUtils.copyFile(sourceFile,destFile);
        System.out.println("copied");
        }
        catch(IOException e){
        System.out.println(e.getMessage());
        }
    }
}
