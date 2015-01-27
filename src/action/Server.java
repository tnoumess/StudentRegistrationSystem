/**
 * 
 */
package action;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import ejb.business.RegisterServiceLocal;
import ejb.dao.GenericDao;
import ejb.dao.StudentDaoLocal;
import ejb.domain.Student;

/**
 * @author root
 *
 */
@Named
@RequestScoped
public class Server extends ActionSupport  {
	
	//@Inject
	//private  RegisterServiceLocal rsl;
	@Inject
	private StudentDaoLocal sdl;
	@Inject
	private GenericDao<Serializable> gd;
	
	static class UserServiceProvider {
	      @Inject static RegisterServiceLocal service;
	    }
	public String register(){		
		Student s=new Student("G00760357", "noumessi", "SWE", true, "tnoumess@gmu.edu", "xxxx");
		System.out.println("begin");
		//rs=new RegisterServiceImpl();
		//String st=Test.rsl.register(s);
		//rsl.register(s);
  System.out.println(UserServiceProvider.service);
  System.out.println(sdl);
  System.out.println(gd);
		
		return "success";
	}

	

}
