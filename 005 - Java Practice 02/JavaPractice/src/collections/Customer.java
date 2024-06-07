package collections;

// This file is made by EmJey
// Project: JavaPractice.java
// FileName: Customer.java
// Date: 2024/06/07
// Modified Date: 2024/06/07
// Email: emjeydev@gmail.com
// Github: emjeydev

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
