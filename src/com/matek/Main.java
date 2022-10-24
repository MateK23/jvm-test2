package com.matek;

public class Main {
    public static void main(String[] args) {
        ECounter ecounter = createEcounter();

        // String output = ecounter.getOutput(); // raw output from file

        System.out.println(ecounter.getName());
        System.out.println(ecounter.getUsage());
        System.out.println(ecounter.getDate());
    }

    public static ECounter createEcounter(){
        ECounter ecounter = new ECounter("C:\\Users\\matew\\Desktop\\test2\\data.txt");
        return ecounter;
    }
}
