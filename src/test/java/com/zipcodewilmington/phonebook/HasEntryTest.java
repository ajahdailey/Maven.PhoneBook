package com.zipcodewilmington.phonebook;


import com.sun.tools.javac.util.Assert;

public class HasEntryTest {


    public void test1() {
        String name = "Sam";
        String phoneNumber = "222-567-8679";



        // given
        PhoneBook phoneBook = new PhoneBook();


        // when
        phoneBook.add(name, phoneNumber);


        // then
        Assert.check(phoneBook.hasEntry(name));
    }



    public void test2() {
        String name = "Sam";
        String phoneNumber = "222-567-8679";



        // given
        PhoneBook phoneBook = new PhoneBook();


        // when
        phoneBook.add(name, phoneNumber);


        // then
        Assert.check(phoneBook.hasEntry(name));
    }


}
