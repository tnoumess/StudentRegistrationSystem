/**
 * 
 */
package ejb.dao;

import javax.ejb.Local;

import ejb.domain.Student;

/**
 * @author root
 *
 */

@Local
public interface StudentDaoLocal extends GenericDao<Student>{
	
public Student findStudentByStudentId(String studentId);
	
public boolean createStudent(Student student);

public void createS(Student student);

}
