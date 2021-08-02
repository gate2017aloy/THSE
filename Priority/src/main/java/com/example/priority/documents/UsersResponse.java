package com.example.priority.documents;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Data
@Document(collection = "TaskManager")
public class UsersResponse {
    @Id
    private long id;
    private List<Response> response;
}
