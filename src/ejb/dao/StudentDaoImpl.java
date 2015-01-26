/**
 * 
 */
package ejb.dao;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;

import ejb.domain.Student;

/**
 * @author root
 *
 */
@Stateless
public class StudentDaoImpl extends GenericDaoImpl<Student> implements StudentDaoLocal{
	
	
	/* (non-Javadoc)
	 * @see ejb.dao.StudentDaoLocal#findStudentByStudentId(java.lang.String)
	 */
	@Override
	public Student findStudentByStudentId(String studentId) {
		// TODO Auto-generated method stub
		Student user = null;
    	try {
			user = (Student) em
				.createNamedQuery("findStudentByStudentId")
				.setParameter("studentId", studentId).getSingleResult();
    	} catch (NoResultException nre) {
    		return new Student();
    	}
		return user;
	}

	/* (non-Javadoc)
	 * @see ejb.dao.StudentDaoLocal#createStudent(ejb.domain.Student)
	 */
	@Override
	public boolean createStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			em.createNamedQuery("createStudent")
				.setParameter("name", student.getName())
				.setParameter("studentId", student.getStudentId())
			.setParameter("email", student.getEmail())
			.setParameter("major", student.getMajor())
			.setParameter("hold", student.isHold())
			.setParameter("pwd", student.getPwd()).getSingleResult();
    	} catch (NoResultException nre) {
    		return false;
    	}
		return true;
	}
	
	@Override
	public void create(Student student) {
		System.out.println(this.getClass());
		createS(student);		
		
	}
}
