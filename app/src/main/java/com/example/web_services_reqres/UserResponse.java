package com.example.web_services_reqres;

import java.util.List;

public class UserResponse {
    private int page;
    private List<User> data;
    private int total;
    private int total_pages;

    // Getters
    public int getPage() {
        return page;
    }

    public List<User> getData() {
        return data;
    }

    public int getTotal() {
        return total;
    }

    public int getTotalPages() {
        return total_pages;
    }
}

