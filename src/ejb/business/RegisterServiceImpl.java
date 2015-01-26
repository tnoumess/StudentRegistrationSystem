/**
 * 
 */
package ejb.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

import ejb.dao.StudentDaoLocal;
import ejb.domain.Student;

/**
 * @author root
 *
 */
@Stateless
public class RegisterServiceImpl implements RegisterServiceLocal{
	
	
	@Inject
	private StudentDaoLocal SDL;
	
	
	
	/* (non-Javadoc)
	 * @see ejb.business.RegisterServiceLocal#register()
	 */
	@Override
	public String register(Student st) {System.out.println(this.getClass());
		// TODO Auto-generated method stub
		Student St=SDL.find(st.getStudentId());
		//First off, do some back-end validation with regular expression. then -->
		/*
		 * if bad inputs, send a JSon response corresponding to the error message
		 * 
		 * */
		if(St!=null){	       
			SDL.create(st);
			return "this will be a json response(Student name and studentId)";
			}else
		return "json error message";
	}



	/**
	 * @param sDL
	 */
	public RegisterServiceImpl() {
		
		super();
		System.out.println("inside construct");
	}

}
