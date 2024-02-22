package collection.function;

public class Employee implements Comparable<Employee> {

	int empId;
	String name;
	String gender;
	String dept;
	int age;
	

	public Employee(int empId, String name, String gender, String dept, int age, long salary) {
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee Details :: EmpId =" + getEmpId() + ", \n Name =" + getName() + ", \n Gender ="
				+ getGender() + ", \n Dept =" + getDept() + ", \n Age =" + getAge() + ", \n Salary =" + getSalary();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	long salary;


	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.empId-emp.empId;
	}

}
