package FilterDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesMain {

    public static void main(String[] args) {
        List<Employees> eList = new ArrayList<>();
        eList.add(new Employees("Michal",2000L));
        eList.add(new Employees("Flora",10000L));
        eList.add(new Employees("James",60000L));
        eList.add(new Employees("Josef",65000L));

        //increase salary by 20000L if salary is greater than 50000L

       List<Employees> updatedSalariedEmp = eList.stream().filter(e->e.getSalary()>50000L).map(employee -> {
            employee.setSalary(employee.getSalary() + 20000L);
            return employee;
        }).collect(Collectors.toList());

       for(Employees e: updatedSalariedEmp){
           System.out.println(e);
       }
    }

}
