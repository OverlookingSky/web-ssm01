package com.xzj.crud.bean;

public class Employee {
    private Integer empId;

    private String empName;

    private Integer empAge;

    private String empEmail;

    private Integer dId;

    private Department dept;
    
    
    
    @Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empEmail=" + empEmail
				+ ", dId=" + dId + ", dept=" + dept + "]";
	}

	public Employee() {
		super();
	}

	public Employee(String empName, Integer empAge, String empEmail, Integer dId) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empEmail = empEmail;
		this.dId = dId;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail == null ? null : empEmail.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}