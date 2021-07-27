package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        String str = "QUICK FOX JUMPS";
        String str = "  QUICK FOX   JUMPS ";
        var rv = new Revers(str);
        var result = rv.make();
        System.out.println(result);

    }
}
