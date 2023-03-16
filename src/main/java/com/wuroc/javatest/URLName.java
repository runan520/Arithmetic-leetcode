package com.wuroc.javatest;



import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import static org.hamcrest.CoreMatchers.containsString;

public class URLName {
    private String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;

            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        System.out.println(resultStringBuilder.toString());
        return resultStringBuilder.toString();
    }

    @Test
    public void givenURLName_whenUsingURL_thenFileData() throws IOException {
        String expectedData = "Baeldung";

        URL urlObject = new URL("http://10.16.40.182:18085/v1/query/");
        URLConnection urlConnection = urlObject.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        String data = readFromInputStream(inputStream);

        Assert.assertThat(data, containsString(expectedData));
    }

}
