package com.example.cwiczenia0103;

public class Pojo {

    private String text;
    private int number;
    private float decimalNumber;


    public Pojo(String text, int number) {
        setText(text);
        setNumber(number);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String getText() {
        return text;
    }

    public int getNumber() {
        return number;
    }

    public double getDecimalNumber() {
        return decimalNumber;
    }


}
