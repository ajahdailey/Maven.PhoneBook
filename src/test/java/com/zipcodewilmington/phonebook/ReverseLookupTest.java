package com.zipcodewilmington.phonebook;

public class ReverseLookupTest {

    public void test1() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String expected = "Ssm";
        String phoneNumber = "222-648-9264";
        phoneBook.add(expected, phoneNumber);

        // when
        String actual = phoneBook.reverseLookup(phoneNumber);

        // then

    }




}
