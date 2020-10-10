package com.company.z1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Random rand = new Random();
	    int val = rand.nextInt(20);
	    Window w = new Window();
	    w.setVal(val);
    }
}
