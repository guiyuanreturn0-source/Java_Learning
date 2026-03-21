package com.bro.learning.project.projectTest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Poker {
    // 准备牌,使用静态代码块,随着类被加载
    static ArrayList<String> pai = new ArrayList<>();
    static HashMap<String,Integer> cardValue = new HashMap<>();

    static {
        String[] color = {"♦","♣","♠","♥"};
        String[] hao = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                String card = color[i] +  hao[j];
                pai.add(card);
                cardValue.put(card,j+3);
            }
        }

        pai.add("SMALL-Hpf");
        pai.add("BIG-Hpf");
        cardValue.put("SMALL-Hpf",16);
        cardValue.put("BIG-Hpf",17);
    }

    public Poker() {
        // 打乱顺序
        Collections.shuffle(pai);
        // 发牌
        ArrayList<String> farmer1 = new ArrayList<>();
        ArrayList<String> farmer2 = new ArrayList<>();
        ArrayList<String> lord = new ArrayList<>();

        ArrayList<String> dp = new ArrayList<>();

        for(int i=0;i<3;i++){
            lord.add(pai.get(i));
            String remove = pai.remove(i);
            dp.add(remove);
        }
        while(!pai.isEmpty()){
            lord.add(pai.removeFirst());
            farmer1.add(pai.removeFirst());
            farmer2.add(pai.removeFirst());
        }
        // 整理牌
        pai_sort(dp);
        pai_sort(lord);
        pai_sort(farmer1);
        pai_sort(farmer2);
        // 展示牌
        System.out.println("底牌: " + dp);
        System.out.println("lord: " + lord);
        System.out.println("farmer1: " + farmer1);
        System.out.println("farmer2: " + farmer2);
    }

    public static void pai_sort(ArrayList<String> player) {
        player.sort(Comparator.comparingInt(o -> cardValue.get(o)));
    }
}
