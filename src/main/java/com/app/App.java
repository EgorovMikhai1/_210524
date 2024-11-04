package com.app;

import com.github.javafaker.Faker;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        System.out.println(new Faker().name().firstName());
    }
}