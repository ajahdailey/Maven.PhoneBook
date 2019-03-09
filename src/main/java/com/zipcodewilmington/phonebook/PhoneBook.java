package com.zipcodewilmington.phonebook;

import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;
/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String, List<String>> map = new TreeMap();



    public Boolean hasEntry(String name) {

        return map.containsKey(name);
   }



   public void add(String name, String phoneNumber){

       if(hasEntry(name)) {
           List<String> theirPhoneNumbers = lookup(name);
           theirPhoneNumbers.add(phoneNumber);
       } else {
           List<String> phoneNumberList = new ArrayList<>();
           map.put(name, phoneNumberList);
           phoneNumberList.add(phoneNumber);
       }

    }


    public void add(String name, String... phoneNumbers) {
        for (int i = 0; i < phoneNumbers.length; i++) {
            String phoneNumber = phoneNumbers[i];
            this.add(name, phoneNumber);
        }
    }

    public List<String> lookup(String name) {
        return this.map.get(name);
    }

    public String reverseLookup(String number) {
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> phoneNumbers = entry.getValue();
            if(phoneNumbers.contains(number)) {
                String name = entry.getKey();
                return name;
            }
        }
        return null;
    }
}
