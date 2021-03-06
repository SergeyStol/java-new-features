package org.stol.employees.layers.db.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class EmployeeDao {
    @Id
    long id;
    String name;
}
