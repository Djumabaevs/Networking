package com.company;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;

public class ApacheTest {
    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
    }
}
