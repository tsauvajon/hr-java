package com.github.tsauvajon.hrjava.java.dataStructures.comparator;

import java.util.Comparator;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        int diff = b.score - a.score;

        if (diff == 0) {
            return a.name.compareTo(b.name);
        }

        return diff;
    }
}
