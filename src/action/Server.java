/**
 * 
 */
package action;

import javax.inject.Inject;
import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import ejb.business.RegisterServiceLocal;
import ejb.domain.Student;

/**
 * @author root
 *
 */
public class Server extends ActionSupport implements ModelDriven, ServletContextAware {
	@Inject
	public static RegisterServiceLocal rsl;
	
	
	public String register(){		
		/*Student s=new Student("G00760357", "noumessi", "SWE", true, "tnoumess@gmu.edu", "xxxx");
		System.out.println("begin");
		//rs=new RegisterServiceImpl();
		//String st=Test.rsl.register(s);
		rsl.register(s);
  System.out.println(s);*/
		
		return "success";
	}

	/* (non- Javadoc)
	 * @see org.apache.struts2.util.ServletContextAware#setServletContext(javax.servlet.ServletContext)
	 */
	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
