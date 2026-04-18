package org.example;

public class UC4 {
    public static void main( String[] args )
    {
        StringBuilder name= new StringBuilder();
        if (args.length == 0)
            name = new StringBuilder("World");
        else
            for (String arg : args) {
                name.append(",").append(arg);
            }
        System.out.println( "Hello"+ name + "!");
    }

}
