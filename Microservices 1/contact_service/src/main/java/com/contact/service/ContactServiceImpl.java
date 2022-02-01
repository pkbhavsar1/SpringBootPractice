package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

//    Fake List of Contacts
    List<Contact> list = List.of(
            new Contact(1L, "pawarpankaj9665@gmail.com","Pankaj Pawar", 101L),
            new Contact(2L, "abhipatil123123@gmail.com","Abhijeet Patil", 101L),
            new Contact(3L, "shubhampatil01@gmail.com","Shubham Patil", 102L),
            new Contact(4L,"saurabhparihar98@gmail.com","Saurabh Parihar",102L),
            new Contact(5L,"lokii2704@gmail.com","Lokesh Patil", 103L)
);

    @Override
    public List<Contact> getContactsOfUser(Long user_id) {
        return list.stream().filter(contact -> contact.getUserId().equals(user_id)).collect(Collectors.toList());
    }
}
