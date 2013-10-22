package com.lawdocslox.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.lawdocslox.app.KeyObj;
import com.lawdocslox.app.KeyObjFactory;
import java.lang.System;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        byte[] clientid = new byte[20];
	for(int i=0;i<clientid.length;i++) {
		clientid[i] = (byte)i;
	}
        byte[] firmid = new byte[20];
	for(int i=0;i<firmid.length;i++) {
		firmid[i] = (byte)i;
        }
        KeyObj key;
	key = KeyObjFactory.getKeyObj(clientid,firmid);
        for (byte b : key.getKey()) {
            System.out.printf("0x%02X", b);
        }
        System.out.println("Finishing test up!");
        assertTrue( true );
    }
}
