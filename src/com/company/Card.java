package com.company;

public class Card {

    private final Color color;
    private final Value value;

    public Card(Color color, Value value){
        this.value = value;
        this.color = color;
    }

    public Value getValue(){
        return value;
    }

    public String getValueToDisplay(){
        return value.toString();
    }

    public String getColorToDisplay(){
        return color.toString();
    }

    public Color getColor(){
        return color;
    }

}
