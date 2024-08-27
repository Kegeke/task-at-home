package com.aston.lesson2_streamAPI.service;

import com.aston.lesson2_streamAPI.Trader;
import com.aston.lesson2_streamAPI.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class TransactionService {
    private final List<Transaction> transactionList;

    public TransactionService(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public List<?> searchTransaction() {        //Найти все транзакции за 2011 год и отсортировать их по сумме
        return transactionList.stream()
                .filter(n -> n.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .toList();
    }

    public List<?> getCityList() {          //Вывести список неповторяющихся городов, в которых работают трейдеры
        return transactionList.stream()
                .map(x -> x.getTrader().getCity())
                .distinct()
                .toList();
    }

    public List<?> searchTrader() {   //Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        return transactionList.stream()
                .map(Transaction::getTrader)
                .filter(x -> x.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .toList();
    }

    public String getSortedNameTrader() {   //Вернуть строку со всеми именами трейдеров, сортитованных в алф. порядке
        return transactionList.stream()
                .map(x -> x.getTrader().getName())
                .sorted()
                .toList().toString();
    }

    public boolean isDoesTraderExist() {      //Выяснить, существует ли хоть один трейдер из Милана.
        return transactionList.stream()
                .anyMatch(x -> Objects.equals(x.getTrader().getCity(), "Milan"));
    }

    public int getAllSumTransaction() {  //Вывести суммы всех транзакций трейдеров из Кембриджа
        return transactionList.stream()
                .filter(x -> x.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(Integer::sum)
                .get();
    }

    public int maxSumTransaction() {   //Какова максимальная сумма среди всех транзакций?
        return transactionList.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .getAsInt();
    }

    public int minSumTransaction() {
        return transactionList.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt();
    }

}
