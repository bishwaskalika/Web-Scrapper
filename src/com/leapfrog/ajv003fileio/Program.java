/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ajv003fileio;

import com.leapfrog.ajv003fileio.util.HttpClient;
import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author abc
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String path = "C:/Users/abc/Desktop/New folder/";
        try {
            

            //FileReader reader = new FileReader(path + "img.jpg");
            
            BufferedReader freader = new BufferedReader(new FileReader(path +"jobs.txt"));
            String fline="";
            HttpClient http=  new HttpClient();
            while((fline=freader.readLine())!=null){
                System.out.println("Browsing" + fline);
                System.out.println(http.get(fline));
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }
}
