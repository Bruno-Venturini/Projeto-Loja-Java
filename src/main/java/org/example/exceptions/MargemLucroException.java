package org.example.exceptions;

public class MargemLucroException extends Exception {

    public MargemLucroException() {
        super("A margem de lucro não pode ser menor que 20%.");
    }
}
