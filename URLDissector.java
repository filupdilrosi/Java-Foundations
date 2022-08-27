package Chapters2Thru4;
import java.util.Scanner;
import java.io.*;

public class URLDissector {
    //Reads urls from a file and prints their path components
    public static void main(String[] args) throws IOException{
        String url;
        Scanner fileScan, urlScan;

        fileScan = new Scanner(new File("websites.inp"));
        //read and process each line of the file

        while (fileScan.hasNext())
        {
            url = fileScan.nextLine();
            System.out.println("URL: "+url);

            urlScan = new Scanner(url);
            urlScan.useDelimiter("/");
            //prints each part of url
            while (urlScan.hasNext())
            {
                System.out.println(" " + urlScan.next());
                System.out.println();
            }
        }


    }

}
