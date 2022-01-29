package com.example.demo.data;

public record Data(long time,
        double open,
        double high,
        double low,
        double close,
        int volume,
        double volume_MA){}
