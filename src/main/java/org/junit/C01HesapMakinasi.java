package org.junit;
import java.util.stream.DoubleStream;

public class C01HesapMakinasi {
     static double topla(double... sayilar ){
        return DoubleStream.of(sayilar).sum();
    }

     static double carp(double... sayilar ){
        return DoubleStream.of(sayilar).reduce(1,(a,b) -> a*b);
    }
}
