package ru.spbu.arts.java.oop;
import java.util.*;

public class Collections {
    public static void main(String[] args) throws Exception {
        System.out.println(count(100));

        List<String> q = new ArrayList<>();
        q.add("a4");
        q.add("3");
        q.add("333");
        q.add("lalala");
        q.add("tata");
        print(q);

        List<String> b = new ArrayList<>();
        b.add("aaa555");
        b.add("3358");
        b.add("lalala");
        printIndex(b);

        List<String> a = new ArrayList<>();
        a.add("11");
        a.add("22");
        a.add("33");
        System.out.println(task5(a));
        System.out.println(a);
        task5_1(a);
        System.out.println(a);

    }

    public static List<Integer> count(int n){
        List<Integer> a = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            a.add(i);
        }
        return a;
    }

    public static void print(List<String> a){
        System.out.println("Элементов в списке: " + a.size());
        for(String i : a)
            System.out.println(i);
    }
    //пока выводит с 0 индекса, подумаю , как сделать с 1
    public static void printIndex(List<String> a){
        System.out.println("Элементов в списке: " + a.size());
        for(int i = 0; i < a.size(); i++)
            System.out.println(i + ": " + a.get(i));
    }

    public static List<String> task5(List<String> a){
        List<String> b = new ArrayList<>();
        for(int i = a.size() - 1; i >= 0; i--){
            b.add(a.get(i));
        }
        return b;
    }

    public static void task5_1(List<String> a){
        List<String> b = new ArrayList<>();
        for(int i = a.size() - 1; i >= 0; i--){
            b.add(a.get(i));
        }
        a.clear();
        a.addAll(b);
    }
}
