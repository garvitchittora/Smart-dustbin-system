/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javaapplication5.mailll;
/**
 *
 * @author HP
 */

 class TestSleepMethod1 extends Thread{  
 public void run(){  
  
    try{Thread.sleep(30000);}catch(InterruptedException e){System.out.println(e);}  
    
    int level = 10;
    if(level !=0){
    mailll t1=new mailll();
    t1.sendMail("1","shivam12345kr@gmail.com");
    
  }  }
 }
    
 
