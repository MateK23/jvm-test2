package com.matek;

import java.io.*;

public class ECounter implements IECounter {
    private String name;
    private String usage;
    private String date;
    private String[] lines;
    private String output;

    public ECounter(String filepath) {
        File file = new File(filepath);

        readDataFromFile(file);
    }

    @Override
    public void readDataFromFile(File file) {
        try (Reader reader = new FileReader(file)) {

            int read;

            while ((read = reader.read()) != -1) {
                char c = (char) read;
                if (output == null) {
                    output = "" + c;
                } else {
                    output += c;
                }

                lines = output.split(" ? ");

                // System.out.print(c);
            }

            name = lines[2];
            usage = lines[5];
            date = lines[8];

        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    @Override
    public String getOutput() {
        return output;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUsage() {
        return usage;
    }

    @Override
    public String getDate() {
        return date;
    }
}
