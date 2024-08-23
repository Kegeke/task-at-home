package com.aston.lesson2_streamAPI;

import java.util.*;

public class PuttingIntoPractice {
    public static void main(String... args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        print(searchTransaction(transactions));
        //print(getCityList(transactions));
        //print(searchTraderFromCambridge(transactions));
        //print(getSortedNameTrader(transactions));
        //print(isDoesTraderExist(transactions));
        //print(getAllSumTransaction(transactions));
        //print(maxSumTransaction(transactions));
        //print(minSumTransaction(transactions));
    }


    private static List<?> searchTransaction(List<Transaction> list) {        //Найти все транзакции за 2011 год и отсортировать их по сумме
        return list.stream()
                .filter(n -> n.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .toList();
    }

    private static List<?> getCityList(List<Transaction> list) {          //Вывести список неповторяющихся городов, в которых работают трейдеры
        return list.stream()
                .map(x -> x.getTrader().getCity())
                .distinct()
                .toList();
    }

    private static List<?> searchTraderFromCambridge(List<Transaction> list) {   //Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        return list.stream()
                .filter(x -> Objects.equals(x.getTrader().getCity(), "Cambridge"))
                .map(x -> x.getTrader().getName())
                .sorted()
                .toList();
    }

    private static String getSortedNameTrader(List<Transaction> list) {   //Вернуть строку со всеми именами трейдеров, сортитованных в алф. порядке
        return list.stream()
                .map(x -> x.getTrader().getName())
                .sorted()
                .toList().toString();
    }

    private static boolean isDoesTraderExist(List<Transaction> list) {      //Выяснить, существует ли хоть один трейдер из Милана.
        return list.stream()
                .anyMatch(x -> Objects.equals(x.getTrader().getCity(), "Milan"));
    }

    private static int getAllSumTransaction(List<Transaction> list) {  //Вывести суммы всех транзакций трейдеров из Кембриджа
        return list.stream()
                .filter(x -> x.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(Integer::sum)
                .get();
    }

    private static int maxSumTransaction(List<Transaction> list) {   //Какова максимальная сумма среди всех транзакций?
        return list.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .getAsInt();
    }

    private static int minSumTransaction(List<Transaction> list) {
        return list.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt();
    }

    private static <E> void print(E e) {
        System.out.println(e);
    }
}


