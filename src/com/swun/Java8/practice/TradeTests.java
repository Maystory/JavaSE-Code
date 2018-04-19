package com.swun.Java8.practice;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * 描述:
 *
 * @outhor my
 * @create 2018-04-19 15:06
 */
public class TradeTests {

    private List<Transaction> transactions;
    private List<Trader> traders;

    @Before
    public void setup() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        traders = new ArrayList<>();
        traders.add(raoul);
        traders.add(mario);
        traders.add(alan);
        traders.add(brian);
    }

    /**
     * 找出2011年发生的所有交易，并按交易额排序（从低到高）
     */
    @Test
    public void test1() {
        List<Transaction> testList1 = transactions.stream()
                .filter((transaction) -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue)).collect(toList());
        for (Transaction transaction : testList1) {
            System.out.println(transaction);
        }
    }

    /**
     * 交易员都在哪些不同的城市工作过？
     */
    @Test
    public void test2() {
        List<String> cityes = traders.stream()
                .map(Trader::getCity)
                .distinct()
                .collect(toList());
        System.out.println(cityes);
    }

    /**
     * 查找所有来自于剑桥的交易员，并按姓名排序
     */
    @Test
    public void test3() {
        List<Trader> test3List = traders.stream().filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName)).collect(toList());

        System.out.println(test3List);
    }

    /**
     * 返回所有交易员的姓名字符串，按字母顺序排序。
     */
    @Test
    public void test4() {
        List<String> test4List = traders.stream().map(Trader::getName)
                .sorted(Comparator.naturalOrder()).collect(toList());

        System.out.println(test4List);
    }

    /**
     * 有没有交易员是在米兰工作的？
     */
    @Test
    public void test5() {
        boolean isMilan = traders.stream()
                .anyMatch(trader -> trader.getCity().equals("Milan"));
        System.out.println(isMilan);
    }

    /**
     * 打印生活在剑桥的交易员的所有交易额。
     */
    @Test
    public void test6() {
        List<Integer> test6List = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue).collect(toList());
        System.out.println(test6List);
    }


}