package net.engineeringdigest.journalApp;

import org.springframework.stereotype.Component;

@Component
public class journalEntry {
 
    private Integer id;
    private String notes;
    private String ref;
    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    

}
