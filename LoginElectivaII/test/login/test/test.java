/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.test;

import login.persistence.ConnectBD;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguel
 */
public class test {
    
     private ConnectBD connectBD;
   
   private void stupEscenarieOne(){
       connectBD=new ConnectBD();
   }
   @Test
   public void testConnect(){
       stupEscenarieOne();
       assertTrue(connectBD.connect());
   }
    
  
}
