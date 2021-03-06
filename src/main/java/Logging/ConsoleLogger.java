/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logging;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Client
 */
public class ConsoleLogger implements Logger{
    
    @Override
    public void logInfo(String logData) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("info:\t["+timeStamp+"] - "+ logData);
    } 
    
    @Override
    public void logWarning(String logData) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("warning:\t["+timeStamp+"] - "+ logData);
    }   
    
    @Override
    public void logError(String logData) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("error:\t["+timeStamp+"] - "+ logData);
    }
}
