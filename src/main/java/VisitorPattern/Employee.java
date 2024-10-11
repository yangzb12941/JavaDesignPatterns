package VisitorPattern;

import lombok.Data;

@Data
public class Employee implements Element{

    private String name;

    private Integer degree;

    private Integer vacationDays;

    @Override
    public void Accept(Visitor visitor) {

    }
}
