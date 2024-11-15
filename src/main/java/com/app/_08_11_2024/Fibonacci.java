package com.app._08_11_2024;

import lombok.var;

import java.util.stream.Stream;

public class Fibonacci {
    public static long fibRec(int index) {
        if (index == 0) {
            return 0;
        }
        return index == 1 || index == 2 ? 1 : fibRec(index - 1) + fibRec(index - 2);
    }

    public static long getFibonacci(int i) {
        int result;
        int v1 = 0;
        int v2 = 1;

        for (int j = 1; j < i; j++) {
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }
        return v2;
    }

    public static long fibStream(int index) {
        var result =
                Stream.iterate(new long[]{0, 1}, arr ->
                        new long[]{arr[1], arr[0] + arr[1]})
                        .limit(index + 1)
                        .map(y -> y[0])
                        .max(Long::compareTo);
        return result.orElseThrow(IllegalAccessError::new);
    }

    public static void main(String[] args) {
        int n = 45;
        long Ftime = System.currentTimeMillis();
        System.out.println(getFibonacci(n));
        long Ftime2 = System.currentTimeMillis() - Ftime;
        System.out.println("getFibonacci: " + Ftime2);

        long FtimeR = System.currentTimeMillis();
        System.out.println(fibRec(n));
        long Ftime2R = System.currentTimeMillis() - FtimeR;
        System.out.println("fibRec: " + Ftime2R);

        long FtimeRS = System.currentTimeMillis();
        System.out.println(fibStream(n));
        long Ftime2RS = System.currentTimeMillis() - FtimeRS;
        System.out.println("fibStream: " + Ftime2RS);
    }
}