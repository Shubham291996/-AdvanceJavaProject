package collection.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpManage {

	public List getEmpList() {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "Shubham", "Male", "Engineering", 27, 120000));
		list.add(new Employee(5, "Faisal", "Male", "Finance", 25, 150000));
		list.add(new Employee(3, "Puja", "Female", "HR", 45, 50000));
		list.add(new Employee(4, "Neha", "Female", "Admin", 62, 210000));
		list.add(new Employee(2, "Pankaj", "Male", "Admin", 65, 200000));

		return list;
	}

	public List getFemaleEmp() {
		List<Employee> femaleList = new ArrayList<>();

		List<Employee> allEmp = getEmpList();
		for (int i = 0; i < allEmp.size(); i++) {
			Employee emp = allEmp.get(i);
			if ("Female".equals(emp.getGender())) {
				femaleList.add(emp);
			}
		}
		return femaleList;
	}

	public List getMaleEmp() {
		List<Employee> maleList = new ArrayList<>();

		List<Employee> allEmp = getEmpList();
		for (int i = 0; i < allEmp.size(); i++) {
			Employee emp = allEmp.get(i);
			if ("Male".equals(emp.getGender())) {
				maleList.add(emp);
			}
		}
		return maleList;
	}

	public List getSeniorEmp() {
		List<Employee> senioEmpList = new ArrayList<>();

		List<Employee> allEmp = getEmpList();
		for (int i = 0; i < allEmp.size(); i++) {
			Employee emp = allEmp.get(i);
			if (emp.getAge() >= 60) {
				senioEmpList.add(emp);
			}
		}

		return senioEmpList;
	}
	public List getEngineeringEmp() {
		List<Employee> engineeringEmp = new ArrayList<>();

		List<Employee> allEmp = getEmpList();
		for (int i = 0; i < allEmp.size(); i++) {
			Employee emp = allEmp.get(i);
			if ("Engineering".equals(emp.getDept())) {
				engineeringEmp.add(emp);
			}
		}
		return engineeringEmp;
	}

	public List getEmpAscId() {

		List<Employee> allEmp = getEmpList();
		Collections.sort(allEmp);

		return allEmp;
	}

	public List getEmpDescId() {
		List<Employee> allEmp = getEmpList();
		Collections.sort(allEmp, Comparator.comparingInt(Employee::getEmpId).reversed());
		return allEmp;
	}
	
	public List getEmpSalaryDesc() {
		List<Employee> allEmp = getEmpList();
		Collections.sort(allEmp, Comparator.comparingLong(Employee::getSalary).reversed());
		return allEmp;
	}
	public List getDept(String dept) {
		List<Employee> deptList = new ArrayList<>();
		List<Employee> allEmp = getEmpList();
		for (int i = 0; i < allEmp.size(); i++) {
			Employee emp = allEmp.get(i);
			if (dept.equals(emp.getDept())) {
				deptList.add(emp);
			}
		}

		return deptList;
	}
}

