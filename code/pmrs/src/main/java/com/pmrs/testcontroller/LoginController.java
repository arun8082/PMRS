package com.pmrs.testcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pmrs.idao.ICourseDAO;
import com.pmrs.idao.IStudentDAO;
import com.pmrs.iservice.ICourseAdminService;
import com.pmrs.iservice.ICourseService;
import com.pmrs.pojos.Course;
import com.pmrs.pojos.CourseAdmin;
import com.pmrs.pojos.Mentor;
import com.pmrs.pojos.Phase;
import com.pmrs.pojos.Project;
import com.pmrs.pojos.ProjectPhase;
import com.pmrs.pojos.Student;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/pmrs")
public class LoginController {

	@Autowired
	private ICourseAdminService courseAdminService;

	//@Autowired
	//private ICourseDAO courseDAO;
	@Autowired
	//private IStudentDAO studentDao;
	
	
	private ICourseService courseService;

	@GetMapping("/home")
	public String showLogin() {
		return "Hi this is login page";
	}

	@PostMapping("/CourseAdmin/get")
	public CourseAdmin getCourseAdmin(@RequestBody CourseAdmin courseAdmin) {
		//courseAdmin.setCourseId(courseAdmin.getCourseId());
		System.out.println(courseAdmin);
		return courseAdminService.get(courseAdmin.getCourseAdminId());
	}

	@PostMapping("/CourseAdmin/add")
	public CourseAdmin addCourseAdmin(@RequestBody CourseAdmin courseAdmin) {
		System.out.println(courseAdmin);
		return courseAdminService.add(courseAdmin);
	}

	@PostMapping("/CourseAdmin/update")
	public boolean updateCourseAdmin(@RequestBody CourseAdmin courseAdmin) {
		System.out.println(courseAdmin);
		courseAdminService.update(courseAdmin);
		return true;
	}

	@PostMapping("/CourseAdmin/list")
	public List<CourseAdmin> listAllCourseAdmin() {
		return courseAdminService.listAll();
	}

	@PostMapping("/CourseAdmin/remove")
	public boolean removeCourseAdmin(@RequestBody CourseAdmin courseAdmin) {
		return courseAdminService.remove(courseAdmin.getCourseAdminId());
	}

	@PostMapping("/Course/add")
	public Course addCourse(@RequestBody Course course) {
		return courseService.add(course);
	}

	/*
	 * @PostMapping("/upload") public int uploadDocument(@RequestParam MultipartFile
	 * file) { System.out.println("register student"); String uploadLocation =
	 * "F:\\b1_project\\PMRS\\code\\pmrs\\target\\documents";
	 * System.out.println(file.getOriginalFilename()+" "); File dest=new
	 * File(uploadLocation, file.getOriginalFilename()); //file transferred to
	 * server side folder try { file.transferTo(dest); } catch
	 * (IllegalStateException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } return 1; }
	 */
	/*@PostMapping("/upload")
	public int uploadDocument(@RequestParam MultipartFile file, Student student) {
		System.out.println("register student" + student);
		String uploadLocation = "F:\\b1_project\\PMRS\\code\\pmrs\\target\\documents";
		System.out.println(file.getOriginalFilename());
		File dest = new File(uploadLocation, file.getOriginalFilename());
		// file transferred to server side folder
		try {
			file.transferTo(dest);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}
	*/
	@PostMapping("/register/student")
	public Student registerStudent(@RequestParam Student student) {
		System.out.println("register student " + student);
		// Student s=studentDao.add(student);
		// System.out.println(s);
		return null;
	}

}
