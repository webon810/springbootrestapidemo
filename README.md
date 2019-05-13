# Spring Boot,Restful API,JPA, Hibernate, MySQL CRUD Sample
this is maven project of Spring Boot with JPA, MySQL and build by eclipse

# step1: create new maven project
select an Archetype - webapp

group id: com.springcoding

artifact id: springbootrestapidemo

# step2: add dependency (pom.xml)

# step3: add application.properties
under Java Resources -> src/main/resources
right click -> new other -> general -> file

# step4: index.jsp clean up

# step5: ready for maven build
right click the project -> run as -> maven build ...

PS: markers has maven error -> may do right click on project and select maven -> update project

# step6: Build Path - no Java folder yet, and need to enable java folder , add java files
project->right click property-> java build path (Java v1.8)
select the last 2 JRE and Maven, and it will add src/main/java folder

# Start work on these java files
# step7: add java class file - Employees.java
package: add package eg: 

springbootrestapidemo to com.springcoding.springbootrestapidemo.model

and create the java file - Employees.java and save

on the page, right click -> source -> generate getter and setter

and do the maven build again

PS: make sure - preference -> Java -> Installed JREs select the JDK, if JRE will failed to maven build

# step8: add java class file - EmployeesRepository.java  (interface)

# step9: add java class file - EmployeesDao.java  
PS: this is the file using EmployeesRepository and Employees to insert data to database

@Autowired
EmployeeRepository employeeRepository;

/* save an employee */
save(emp)
/* search all employee */
findall()
/* get an employee */
findById(empid)
/* delete (VOID) an employee */
delete(empid)

@Service
public class EmployeeDAO {}

so far
define the model
the employee (list of fields and getter/seter)
define the repository (interface and extends JpaRepository<Employee, Long>)
and dao - the logic

# step10: maven build again

# step11: create the controller page
com.springcoding.springbootrestapidemo.controller
and create new controller class file

//all of the urls and postman and restapi
//Controller call the employeeDAO

/*to save an employee*/  @PostMapping()
/*get all of employees*/ @GetMapping()
/*get an employee by empid*/ @GetMapping()
/*update an employee by empid*/ @PutMapping()
/*delete an employee*/ @DeleteMapping()

# step12: back to employee.java
add 2 more annoation for Date  (may has the issue here)

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate


# step13: maven build again

# step14: add EmployeeApplication - main method to run springboot app
//run as Java Application and it will run this spring boot app
//and use postman to test the endpoint methods

