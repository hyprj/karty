package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Boolean isGameOver(Player p1, Player p2) {
        if (p1.getCards().isEmpty() && p2.getCards().isEmpty()) {
            System.out.println("Remis!");
            return true;
        } else if (p1.getCards().isEmpty()) {
            System.out.println("Wygrał gracz nr.2!");
            return true;
        } else if (p2.getCards().isEmpty()) {
            System.out.println("Wygrał gracz nr.1!");
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        DeckOfCards session = new DeckOfCards();
        Player p1 = new Player(session.splitCards(), "potezny Gracz");
        Player p2 = new Player(session.splitCards(), "BOT");

        List<Card> cp1 = new ArrayList<>();
        List<Card> cp2 = new ArrayList<>();

        while (!isGameOver(p1, p2)) {

            cp1.add(p1.getCards().remove(p1.getCards().size() - 1));
            cp2.add(p2.getCards().remove(p2.getCards().size() - 1));

            if (cp1.get(cp1.size() - 1).getValue().compareTo(cp2.get(cp2.size() - 1).getValue()) > 0) {
                System.out.println("P1 wygrywa! " + cp1.get(cp1.size() - 1).getValueToDisplay() + " vs " + cp2.get(cp2.size() - 1).getValueToDisplay());
                while (!cp2.isEmpty()) {
                    p1.getCards().add(0, cp2.remove(cp2.size() - 1));
                }
                while (!cp1.isEmpty()) {
                    p1.getCards().add(0, cp1.remove(cp1.size() - 1));
                }
            } else if (cp1.get(cp1.size() - 1).getValue().compareTo(cp2.get(cp2.size() - 1).getValue()) < 0) {
                System.out.println("P2 wygrywa! " + cp1.get(cp1.size() - 1).getValueToDisplay() + " vs " + cp2.get(cp2.size() - 1).getValueToDisplay());
                while (!cp1.isEmpty()) {
                    p2.getCards().add(0, cp1.remove(cp1.size() - 1));
                }
                while (!cp2.isEmpty()) {
                    p2.getCards().add(0, cp2.remove(cp2.size() - 1));
                }
            } else if (!isGameOver(p1, p2)) {
                    System.out.println("Wojna!");
                    cp1.add(p1.getCards().remove(0));
                    cp2.add(p2.getCards().remove(0));
                }
            }
        }
    }