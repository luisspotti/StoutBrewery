package com.bees.brewery;

public class Main {

    public static void main(String[] args) {
	    Controladora controladora = Controladora.getInstancia();

        SwingMainScreen examples = new SwingMainScreen();
        examples.execute();
    }
}
