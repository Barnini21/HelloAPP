package org.example;

public class UC5 {
    public static void main( String[] args )
    {
        StringBuilder sb= new StringBuilder("Hello");
        if (args.length == 0)
            sb.append(", World");
        else
            for (String arg : args) {
                sb.append(", ").append(arg);
            }
        System.out.println( sb + "!");
    }

}
