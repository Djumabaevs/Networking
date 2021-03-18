package com.company;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

       try {
       /*    URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
           URL url = uri.toURL();

*/
           URI baseUri = new URI("http://username:password@myserver.com:5000");
           URI uri = new URI("/catalogue/phones?os=android#samsung");
           URI resolvedUri = baseUri.resolve(uri);
           URL url = resolvedUri.toURL();
           System.out.println("URl: " + url);

           URI relativizedURI = baseUri.relativize(resolvedUri);
           System.out.println("Relativized URI: " + relativizedURI);


        /*   System.out.println("Scheme: " + uri.getScheme());
           System.out.println("Scheme - specific path: " + uri.getSchemeSpecificPart());
           System.out.println("Authority: " + uri.getAuthority());
           System.out.println("User info: " + uri.getUserInfo());
           System.out.println("Host: " + uri.getHost());
           System.out.println("Port: " + uri.getPort());
           System.out.println("Path: " + uri.getPath());
           System.out.println("Query: " + uri.getQuery());
           System.out.println("Fragment: " + uri.getFragment());*/

       }
       catch (URISyntaxException e) {
           System.out.println("URI bad syntax: " + e.getMessage());
       }
       catch (MalformedURLException e) {
           System.out.println("URL exception: " + e.getMessage());
       }

    }
}
