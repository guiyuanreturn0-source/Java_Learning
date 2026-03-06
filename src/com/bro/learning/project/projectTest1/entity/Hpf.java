package com.bro.learning.project.projectTest1.entity;

import java.util.Random;

public class Hpf {
    // 创建主角类
    // 属性
    private final String name = "何朋飞";
    public String getName(){
        return name;
    }

    private final String gender = "灵长目人科人属21世纪雄性";
    public String getGender(){
        return gender;
    }

    private final int age = 18;
    public int getAge(){
        return age;
    }

    private int hp = 100;
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }

    private int san = 80;
    public int getSan(){
        return san;
    }
    public void setSan(int san){
        this.san = san;
    }

    private int cp_num = -1;
    public int getCp_num(){
        return cp_num;
    }
    public void setCp_num(int cp_num){
        this.cp_num = cp_num;
    }

    Random rand = new Random();
    private int luckValue = rand.nextInt(100);
    public int getLuckValue(){
        return luckValue;
    }
    // 主角只有一个,默认空参构造一个就行

    // 主角的行为
}
