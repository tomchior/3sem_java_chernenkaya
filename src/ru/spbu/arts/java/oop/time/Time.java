package ru.spbu.arts.java.oop.time;

public class Time {

    int h;
    int m;
    Time(int h, int m) {
        this.h = h;
        this.m = m;
    }

    void show(){
        System.out.println(this.h + ":" + this.m);
    }

    boolean isMorning(){
        boolean result;
        if(this.h >= 4 && this.h <= 11){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    boolean isDay(){
        boolean result;
        if(this.h >= 12 && this.h <= 17){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    boolean isEvening(){
        boolean result;
        if(this.h >= 18 && this.h <= 22){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    boolean isNight(){
        boolean result;
        if(this.h >= 23 && this.h <= 4){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    String sayHello(){
        String s = "";
        if(isDay()){
            s = "Добрый день";
        }else if(isMorning()){
            s = "Доброе утро";
        }else if(isEvening()){
            s = "Добрый вечер";
        }else if(isNight()){
            s = "Добрая ночь";
        }
        return s;
    }

    void add(int a){
        int sum1 = this.m + a;
        if(sum1 >= 60){
            this.m = sum1 - 60;
            this.h++;
        }else{
            this.m = sum1;
        }

        System.out.println(this.h + ":" + this.m);
    }
}
