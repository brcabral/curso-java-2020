package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class TestDepartment {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//		System.out.println("==== TEST 1: department findById =====");
//		Department department = departmentDao.findById(1);
//		System.out.println(department);

		System.out.println();
		System.out.println("==== TEST 2: department findAll =====");
		List<Department> departments = departmentDao.findAll();
		for (Department dep : departments) {
			System.out.println(dep);
		}

//		System.out.println();
//		System.out.println("==== TEST 3: department insert =====");
//		Department newDepartment = new Department(null, "Music");
//		departmentDao.insert(newDepartment);
//		System.out.println("Inserted! new id = " + newDepartment.getId());

		Department department = null;
		System.out.println();
		System.out.println("==== TEST 4: department update =====");
		department = departmentDao.findById(3);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed!");

//		System.out.println();
//		System.out.println("==== TEST 5: department delete =====");
//		departmentDao.deleteById(6);
//		System.out.println("Delete completed");
	}
}
