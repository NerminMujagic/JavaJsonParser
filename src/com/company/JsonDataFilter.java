package com.company;

import java.util.Map;

/**
 * Created by nermin on 19/03/2017.
 */
public class JsonDataFilter {

    public String getDataFromJson(Map<String, DetailedData> detailsFromJson,String resortID){
        if (detailsFromJson == null || resortID == null || resortID.equals("")) {
            return "No valid values send";
        }
        for(Map.Entry<String,DetailedData> entry:detailsFromJson.entrySet()){
            if(entry.getValue().getSnowResortId().equals(resortID)){
                return entry.getValue().toString();
            }
        }
           return "No resort with that ID found.";
    }


}
