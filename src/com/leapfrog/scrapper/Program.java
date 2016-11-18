/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.scrapper;

import com.leapfrog.scrapper.util.Grabber;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author abc
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            while(true){
            System.out.println("Enter Job search Keyword:");
            String keyword= input.next();
            Grabber grabber = new Grabber();
            String content = grabber.grab("http://www.jobsnepal.com/simple-job-search","Keywords="+keyword);
            
            
            String regex ="<a class=\"job-item\"(.*?)href=\"(.*?)\"\\s>\\n(.*?)</a>";       
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(content);
            int jobcount = 1;
            
            while(matcher.find()){
                System.out.println((jobcount++)+") "+matcher.group(3).trim());
                jobcount++;
            }
            }
            
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

}
