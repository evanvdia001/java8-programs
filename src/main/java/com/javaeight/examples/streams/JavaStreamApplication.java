package com.javaeight.examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.javaeight.examples.model.AccountDetail;
import com.javaeight.examples.model.Address;
import com.javaeight.examples.model.Employee;

public class JavaStreamApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee>empList = new ArrayList<>();
         
		Employee emp = new Employee();
		Address address = new Address("23ss stree", "dgg", "London", "London", "England", "026566");
		AccountDetail account = new AccountDetail("41414141441141", "322", "05/25");
		emp.setEmpID("100");
		emp.setFirstName("John");
		emp.setLastName("Honay");
		emp.setTitle("Mr.");
		emp.setAge("27");
		emp.setAddress(address);
		emp.setAccount(account);
		
		Employee emp1 = new Employee();
		Address address1 = new Address("Wallstree", "north tower", "NewYork", "NewYork", "USA", "12322");
		AccountDetail account1 = new AccountDetail("41414141441141", "131", "05/25");
		emp1.setEmpID("101");
		emp1.setFirstName("Smith");
		emp1.setLastName("John");
		emp1.setTitle("Mr.");
		emp1.setAge("24");
		emp1.setAddress(address1);
		emp1.setAccount(account1);
		
		empList.add(emp);
		empList.add(emp1);
		
	List<Employee>list =empList.stream().filter(ep ->ep.getAddress().getCity().equalsIgnoreCase("London")).collect(Collectors.toList());
	
	list.forEach(e-> System.out.println(e.getTitle() +" " +e.getFirstName() + " " + e.getLastName()));
	}

}
