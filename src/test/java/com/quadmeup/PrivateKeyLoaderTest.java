package com.quadmeup;

import static org.junit.Assert.assertThat;

import java.security.PrivateKey;

import org.junit.Test;

public class PrivateKeyLoaderTest {
    
    @Test
    public void testLoad() throws Exception {
        PrivateKeyLoader loader = new PrivateKeyLoader();
        PrivateKey key = loader.load("src/test/resources/rsakey.pem");

    }
}
