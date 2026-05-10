package Composicao.Ex03.Entities;

import java.time.LocalDate;

public class Client {
    
    private String name;
    private String email;
    private LocalDate birthyDate;

    public Client() {
    }

    public Client(String name, String email, LocalDate birthyDate) {
        this.name = name;
        this.email = email;
        this.birthyDate = birthyDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthyDate() {
        return birthyDate;
    }

    public void setBirthyDate(LocalDate birthyDate) {
        this.birthyDate = birthyDate;
    }
}
