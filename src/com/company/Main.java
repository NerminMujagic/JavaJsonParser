package com.company;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Loading Data......");
        Map<String, DetailedData> detailsFromJson = new Gson().fromJson(new JsonLoaderClass().LoadJsonFromLocalFile("data/snowdata.json"), new TypeToken<Map<String, DetailedData>>() {}.getType());
        while(true){
            System.out.println("Plese enter Resort ID:");
            String resortID = scanner.next();
            System.out.println(new JsonDataFilter().getDataFromJson(detailsFromJson,resortID));
        }
    }
}
