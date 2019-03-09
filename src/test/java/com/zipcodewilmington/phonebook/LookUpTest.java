package com.zipcodewilmington.phonebook;






import java.util.Arrays;
import java.util.List;


public class LookUpTest {

    void test1() {
        // given
        String name = "Sam";
        String phoneNumber = "385-746-7484";
        List<String> expectedPhoneNumbers = Arrays.asList(phoneNumber);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name, phoneNumber);

        // when
        List<String> actualPhoneNumbers = phoneBook.lookup(name);


        // then

    }


    void test2() {
        // given
        String name = "Sam";
        String phoneNumber1 = "378-863-9388";
        String phoneNumber2 = "244-948-9376";
        List<String> expectedPhoneNumbers = Arrays.asList(
                phoneNumber1, phoneNumber2);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name, phoneNumber1, phoneNumber2);

        // when
        List<String> actualPhoneNumbers = phoneBook.lookup(name);


        // then

    }



    void test3() {
        // given
        String name = "Sam";
        String phoneNumber1 = "373-769-0004";
        String phoneNumber2 = "839-397-3331";
        String phoneNumber3 = "295-656-7847";
        List<String> expectedPhoneNumbers = Arrays.asList(
                phoneNumber1, phoneNumber2, phoneNumber3);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name, phoneNumber1, phoneNumber2, phoneNumber3);

        // when
        List<String> actualPhoneNumbers = phoneBook.lookup(name);


        // then

    }



}
