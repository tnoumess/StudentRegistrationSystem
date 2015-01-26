/**
 * 
 */
package ejb.business;

import javax.ejb.Local;

import ejb.domain.Student;

/**
 * @author root
 *
 */
@Local
public interface RegisterServiceLocal {
	
	public String register(Student st);

}
