package org.linkedIn.course.chapter.polymorphism.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("John", "555-555-5555"));
        contactList.add(new Contact("Sarah", "555-555-5556", "sarah@gmail.com"));
        contactList.add(new Contact("Bob", "555-555-5557"));
        contactList.add(new Contact("Jane", "555-555-5558", "jane@gmail.com"));

        for (Contact contact : contactList) {
            System.out.println(contact.getName() + " " + contact.getPhoneNumber() + " " + contact.getEmail());
        }


    }
}
