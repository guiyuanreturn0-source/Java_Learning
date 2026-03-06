package com.bro.learning.project.projectTest1.entity;

import java.util.Random;

public class Npc {
    // 创建npc类
    // NPC属性
    private String npc_name;
    public String getNpc_name() {
        return npc_name;
    }
    public void setNpc_name(String npc_name) {
        this.npc_name = npc_name;
    }

    private String npc_species;
    public String getNpc_species() {
        return npc_species;
    }
    public void setNpc_species(String npc_species) {
        this.npc_species = npc_species;
    }

    private String npc_gender;
    public String getNpc_gender() {
        return npc_gender;
    }
    public void setNpc_gender(String npc_gender) {
        this.npc_gender = npc_gender;
    }

    private int npc_age;
    public int getNpc_age() {
        return npc_age;
    }
    public void setNpc_age(int npc_age) {
        this.npc_age = npc_age;
    }

    private int npc_ak;
    public int getNpc_ak() {
        return npc_ak;
    }
    public void setNpc_ak(int npc_ak) {
        this.npc_ak = npc_ak;
    }

    private int npc_charmValue;
    public int getNpc_charmValue() {
        return npc_charmValue;
    }
    public void setNpc_charmValue(int npc_charmValue) {
        this.npc_charmValue = npc_charmValue;
    }

    private int npc_intimacy;
    public int getNpc_intimacy() {
        return npc_intimacy;
    }
    public void setNpc_intimacy(int npc_intimacy) {
        this.npc_intimacy = npc_intimacy;
    }

    // 随机生成一个幸运值
    Random rand = new Random();
    private int luckValue = rand.nextInt(100);
    public int getLuckValue() {
        return luckValue;
    }
    // 空参构造
    public Npc(){}

    // 含参构造
    public Npc(String name,String species,String gender,int age,int charmValue,int intimacy){
        this.npc_name = name;
        this.npc_species = species;
        this.npc_gender = gender;
        this.npc_age = age;
        this.npc_ak = charmValue;
        this.npc_charmValue = charmValue;
    }
}
