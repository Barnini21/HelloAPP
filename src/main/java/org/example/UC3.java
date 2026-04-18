package org.example;

public class UC3 {
    public static void main( String[] args )
    {
        String name;
        if (args.length == 0)
            name = "World";
        else
            name = args[0];
        System.out.println( "Hello, "+ name + "!");
    }
}
