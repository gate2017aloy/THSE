package com.example.priority.documents;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Data
@Document(collection = "TaskManager")
public class UsersResponse {
    @Id
    private String id;
    private String task;
    private String description;
    private String dueDate;
    private String label;
    private String status;
}
