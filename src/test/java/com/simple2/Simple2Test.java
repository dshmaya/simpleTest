package com.simple2;

import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;


/**  
 * Created by dshmaya on 15/11/2017 ..01
 */  
public class Simple2Test {
	
   @Test  
   public void alwaysPass1()
   {
       Assert.assertEquals(1, 1);
   }

   @Test
    public void alwaysPass2()
    {
        Assert.assertEquals(1, 1);
    }
   @Test  
   public void alwaysPass3()
   {
       Assert.assertEquals(1, 1);
   }

  @Test
    public void alwaysPass4()
    {
        Assert.assertEquals(1, 1);
    }
   @Test
   public void alwaysFail5()
   {
       Assert.assertEquals(1, 2);
   }


  @Test
    public void alwaysPass6()
    {
        Assert.assertEquals(1, 1);
    }
 	@Test  
   public void alwaysfail171()
   {
       Assert.assertEquals(1, 2);
   }
	
		@Test  
   public void alwaysfail172()
   {
       Assert.assertEquals(1, 2);
   }

 
/*    @Test
    public void sometimesPass1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
// 	Assert.assertEquals(true, true);
    }

    @Test
    public void sometimesPass2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
// 	Assert.assertEquals(true, true);
    }*/
	
    @Test
    @Ignore
    public void ignored1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(99);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);	
    }
	
    @Test
    @Ignore
    public void ignored2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
}
 

