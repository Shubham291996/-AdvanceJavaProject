package collection.client;

import java.util.List;

import collection.function.EmpManage;
import collection.function.Employee;

public class CollectionClient {

	public static void main(String[] args) {
		
		EmpManage empManage = new EmpManage();
		
		System.out.println("Get All employee Details :: ");
		List<Employee> empList = empManage.getEmpList();
		printList(empList);
		System.out.println("=========EOP=============");
		
		System.out.println("Get only female employee data :: ");
		List<Employee> femaleEmpList =  empManage.getFemaleEmp();
		printList(femaleEmpList);
		System.out.println("=========EOP=============");
		
		System.out.println("Get male employee data ::");
		List<Employee> maleEmp = empManage.getMaleEmp();
		printList(maleEmp);
		System.out.println("=========EOP=============");
		
		System.out.println("Get senior employee data ::");
		List<Employee> seniorEmp = empManage.getSeniorEmp();
		printList(seniorEmp);
		System.out.println("=========EOP=============");

		System.out.println("Get employee Id ASC data ::");
		List<Employee> empAscId = empManage.getEmpAscId();
		printList(empAscId);
		System.out.println("=========EOP=============");
		
		System.out.println("Get employee Id DESC data ::");
		List<Employee> empdescId = empManage.getEmpDescId();
		printList(empdescId);
		System.out.println("=========EOP=============");
		
		System.out.println("Get employee Salary DESC data ::");
		List<Employee> empSalaryDesc = empManage.getEmpSalaryDesc();
		printList(empSalaryDesc);
		System.out.println("=========EOP=============");
		
		System.out.println("Get Engineering Employee List ::");
		List<Employee> getEngineeringEmp = empManage.getDept();
		printList(getEngineeringEmp);
		System.out.println("=========EOP=============");
		
		
	}
	
	public static void printList(List<Employee> empList) {
		for (int i = 0; i < empList.size(); i++) {
			Employee emp = empList.get(i);
			System.out.println(emp.toString());
			System.out.println("------------------------------------------------");
		}
	}
	

}
