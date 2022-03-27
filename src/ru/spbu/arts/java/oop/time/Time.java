package ru.spbu.arts.java.oop.time;

public class Time {
    private int h;
    private int m;

    public Time(int h, int m) {
        this.h = h;
        this.m = m;
    }

    public void show() {
        System.out.println(this.h + ":" + this.m);
    }

    public boolean isMorning() {
        boolean result;
        if (this.h >= 3 && this.h <= 11) {
            return true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean isDay() {
        boolean result;
        if (this.h >= 12 && this.h <= 17) {
            return true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean isEvening() {
        boolean result;
        if (this.h >= 18 && this.h <= 23) {
            return true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean isNight() {
        boolean result;
        if (this.h >= 0 && this.h <= 2) {
            return true;
        } else {
            result = false;
        }
        return result;
    }

    public String sayHello() {
        String s = "";
        if (isDay()) {
            s = "Добрый день";
        } else if (isMorning()) {
            s = "Доброе утро";
        } else if (isEvening()) {
            s = "Добрый вечер";
        } else if (isNight()) {
            s = "Добрая ночь";
        }
        return s;
    }

    public void add(int a) {
        int sum1 = this.m + a;
        if (sum1 >= 60) {
            this.m = sum1 - 60;
            this.h++;
        } else {
            this.m = sum1;
        }

        System.out.println(this.h + ":" + this.m);
    }
}
