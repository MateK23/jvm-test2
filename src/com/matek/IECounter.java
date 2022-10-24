package com.matek;

import java.io.File;

public interface IECounter {
    String name = "";
    String usage = "";
    String date = "";
    void readDataFromFile(File file);
    String getOutput();

    String getName();
    String getUsage();
    String getDate();
}
