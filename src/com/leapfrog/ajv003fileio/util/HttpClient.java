/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ajv003fileio.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author abc
 */
public class HttpClient {
    
    public String get(String link) throws IOException{
         URL url = new URL(link);
            URLConnection conn = url.openConnection();
           
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
           String line ="";
           StringBuffer buffer = new StringBuffer();
            while((line=reader.readLine()) !=null) {
                buffer.append(line).append("\r\n");
               
            }
            reader.close();
            return buffer.toString();
           
        
    }
}
