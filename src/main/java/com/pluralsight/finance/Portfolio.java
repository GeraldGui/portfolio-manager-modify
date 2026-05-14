package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable assets) {
        this.assets.add(assets);
    }

    public double getValue() {
        double value = 0;
        for (Valuable valuable : assets) {
            value += valuable.getValue();
        }
        return value;
    }

    public Valuable getMostValuable() {
        double mostValue = 0;
        for (Valuable valuable : assets) {
            if (value > va)
        }

    }

    public Valuable getLeastValuable() {

    }
}
