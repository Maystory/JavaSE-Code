package com.swun.Java8.future;

import com.google.common.base.Stopwatch;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * test
 * </p>
 *
 * @author mf
 * @date 2021-03-03 10:21
 */
public class CompleteFutureTest {

    public static void main(String[] args) {

        List<DataLoader> dataLoaders = Stream.of(new OrderInfoLoader(), new ProductLoader(), new UserInfoLoader())
                .collect(Collectors.toList());

        Stopwatch stopwatch = Stopwatch.createStarted();

        //step 1 2017
        // List<String> resultList = dataLoaders.parallelStream().map(DataLoader::load).collect(Collectors.toList());
        //
        // System.out.println(" step 1 总共执行耗时 : " + stopwatch.elapsed(TimeUnit.MILLISECONDS));

        //step 2 6048
        // List<String> futureList = dataLoaders.stream()
        //         .map(loader -> CompletableFuture.supplyAsync(loader::load))
        //         .map(CompletableFuture::join)
        //         .collect(Collectors.toList());
        // System.out.println(futureList);
        // System.out.println(" step 2 总共执行耗时 : " + stopwatch.elapsed(TimeUnit.MILLISECONDS));

        //step 3 2013
        // List<CompletableFuture<String>> futureList = dataLoaders.stream()
        //         .map(loader -> CompletableFuture.supplyAsync(loader::load))
        //         .collect(Collectors.toList());
        //
        //
        // List<String> stringList = futureList.stream().map(CompletableFuture::join)
        //         .collect(Collectors.toList());
        // System.out.println(stringList);
        // System.out.println(" step 3 总共执行耗时 : " + stopwatch.elapsed(TimeUnit.MILLISECONDS));


        //step 4 2019
        // ExecutorService threadPool = Executors.newFixedThreadPool(Math.min(dataLoaders.size(), 20));
        //
        // List<CompletableFuture<String>> futureList = dataLoaders.stream()
        //         .map(loader -> CompletableFuture.supplyAsync(loader::load, threadPool))
        //         .collect(Collectors.toList());
        //
        //
        // List<String> stringList = futureList.stream().map(CompletableFuture::join)
        //         .collect(Collectors.toList());
        // System.out.println(stringList);
        //
        // System.out.println(" step 4 总共执行耗时 : " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
        // threadPool.shutdown();

        List<CompletableFuture<String>> fList = dataLoaders.stream()
                .map(loader -> CompletableFuture.supplyAsync(loader::load))
                .collect(Collectors.toList());

        // CompletableFuture.allOf(fList);




    }
}
