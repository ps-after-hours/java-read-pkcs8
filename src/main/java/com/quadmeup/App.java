package com.quadmeup;

import java.security.PrivateKey;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        PrivateKeyLoader loader = new PrivateKeyLoader();
        PrivateKey key = loader.load("rsakey.pem");

        System.out.println( key.toString() );
    }
}
