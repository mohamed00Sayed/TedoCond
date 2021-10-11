/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sayed.conditional.test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 *
 * @author Mohamed Sayed
 */


public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(MagicExistsTest.class);
      int num = 1;
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString() +" :f"+num++);
      }
		
      System.out.println(result.wasSuccessful());
   }
} 
