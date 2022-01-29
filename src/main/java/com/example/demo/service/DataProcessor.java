package com.example.demo.service;

import com.example.demo.data.Data;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class DataProcessor {

    public List<Data> getData(String filename){
        try{
            List<Data> data = new ArrayList<>();
            var scanner = new Scanner(ResourceUtils.getFile("classpath:" + filename + ".csv"));
            var line1 = scanner.nextLine();
            while(scanner.hasNextLine()){
                var column = scanner.nextLine().split(",");
                long time = Long.parseLong(column[0].trim()) * 1000;
                double open = Double.parseDouble(column[1].trim());
                double high = Double.parseDouble(column[2].trim());
                double low = Double.parseDouble(column[3].trim());
                double close = Double.parseDouble(column[4].trim());
                int Volume = Integer.parseInt(column[5].trim());
                double Volume_MA = Double.parseDouble(column[6].trim());
                data.add(new Data(time, open, high, low, close, Volume, Volume_MA));
            }
            return data;
        }catch(Exception ex){
            ex.printStackTrace();
            return List.of();
        }
    }

}
