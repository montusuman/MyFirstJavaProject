package OOPS;

public class Employee {
    int empid;
    String empname;
    int salary;
    int deptno;

    //constructor
//    Employee(int id,String name, int sal, int dno)
//    {
//        empid=id;
//        empname=name;
//        salary=sal;
//        deptno=dno;
//    }
    void setData(int id,String name, int sal, int dno){
        empid=id;
        empname=name;
        salary=sal;
        deptno=dno;
    }

    void  display(){
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(salary);
        System.out.println(deptno);
    }

    public static void main(String[] args) {

        //Assigning values to class variables using object - First method

//        Employee emp1 = new Employee();
//        emp1.empid=2459474;
//        emp1.empname="Suman Kumar";
//        emp1.salary=8500;
//        emp1.deptno=101;
//
//        emp1.display();

//        Employee emp2 = new Employee();
//        emp2.empid=2459478;
//        emp2.empname="Lucky";
//        emp2.salary=8800;
//        emp2.deptno=101;
//
//        emp2.display();


        //Assigning values to class variables using constructor - second method

//        Employee emp1 = new Employee(2459474,"Suman Kumar",2500,100);
//        emp1.display();
//
//        Employee emp2 = new Employee(245555,"Sunil Kumar",2500,100);
//        emp2.display();

        //Assigning values to class variables using method - third method

        Employee emp1 = new Employee();
        emp1.setData(2459474,"suman Kumar",2500,101);
        emp1.display();
    }
}
