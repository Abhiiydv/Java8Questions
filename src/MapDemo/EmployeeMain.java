package MapDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
       Employee e1 = new Employee();
       e1.setId(10);
       e1.setName("Abhishek");
       e1.setLastName("Yadav");
       e1.setCourses(List.of("Hindi","English","Maths"));
       list.add(e1);
        Employee e2 = new Employee();
        e2.setId(15);
        e2.setName("Deepak");
        e2.setLastName("Kumar");
        e2.setCourses(List.of("Hindi","Science","Maths","French","British"));
        list.add(e2);

       // System.out.println(list);

//print all subjects only

   List<String> courses = list.stream()
            .flatMap(student -> student.getCourses().stream())
            .distinct()
            .collect(Collectors.toList());
   courses.stream().forEach(s->System.out.print(s +" "));


    }

}
