package com.example.priority.models;

import javax.persistence.*;

@Entity
@Table(name = "PRIORITIES")
public class Priority {
    @Id
    String priority;

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Priority{" +
                "priority='" + priority + '\'' +
                '}';
    }
}
