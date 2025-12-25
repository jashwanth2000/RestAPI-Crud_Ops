package net.engineeringdigest.journalApp;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jornalapp {
    
private HashMap<Integer, journalEntry> journals=new HashMap<>();
    @PostMapping
    public String createEntry(@RequestBody journalEntry myentry ){
        journals.put(myentry.getId(), myentry);
        return "record added";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping
    public List<journalEntry> getAll(){
        return new ArrayList<>(journals.values());
    }


}
