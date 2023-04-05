package ch06.employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("김철수", 35000);
        Employee e2 = new Employee("최수철", 50000);
        Employee e3 = new Employee("김철호", 20000);

        System.out.println("현재의 직원수 = " + Employee.getCount());

        e1 = null;

        System.gc();

        System.out.println("계속 하려면 enter를 치세요.");

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        System.out.println("현재의 직원수 = " + Employee.getCount());
    }    
}
