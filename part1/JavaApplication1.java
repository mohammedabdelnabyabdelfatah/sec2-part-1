
package javaapplication1;
import java.util.Scanner;
class person{
    public String name;
    private String address;
    private String Email_address;
    private int phone_number;

    public person(String name, String address, String Email_address, int phone_number) {
        this.name = name;
        this.address = address;
        this.Email_address = Email_address;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail_address() {
        return Email_address;
    }

    public void setEmail_address(String Email_address) {
        this.Email_address = Email_address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "person{" + "name=" + name + '}';
    }
    
    
}
///////////////////////////////
class student extends person{
    private String class_stutus;

    public student(String class_stutus, String name, String address, String Email_address, int phone_number) {
        super(name, address, Email_address, phone_number);
        this.class_stutus = class_stutus;
    }

    public String getClass_stutus() {
        return class_stutus;
    }

    public void setClass_stutus(String class_stutus) {
        this.class_stutus = class_stutus;
    }

    @Override
    public String toString() {
        
        return  "student{" + "name = " + name +" }";
    }
    
}
///////////////////////////////////
class Mydate{
    int year,mounth,day;
    Mydate(int newyear , int newmounth, int newday){
        this.day=newday;
        this.mounth=newmounth;
        this.year=newyear;
    }
    public void date_hired(){
        System.out.println( "my date hired is "+ year +"/"+mounth+"/"+day );
    }
}
///////////////////////////////
class employee extends person{
    private String office;
    private int salary;
     Mydate date_hired ;

    public employee(String office, int salary,Mydate date_hired,  String name, String address, String Email_address, int phone_number) {
        super(name, address, Email_address, phone_number);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Mydate getDate_hired() {
        return date_hired;
    }

    public void setDate_hired(Mydate date_hired) {
        this.date_hired = date_hired;
    }

    @Override
    public String toString() {
        return "employee{" +  "name = " + name +'}';
    }
    

   
}
//////////////////////////
class faculty extends employee{
    private int office_hour;
    private String rank;

    public faculty(int office_hour, String rank, String office, int salary, Mydate date_hired, String name, String address, String Email_address, int phone_number) {
        super(office, salary, date_hired, name, address, Email_address, phone_number);
        this.office_hour = office_hour;
        this.rank = rank;
    }

    public int getOffice_hour() {
        return office_hour;
    }

    public void setOffice_hour(int office_hour) {
        this.office_hour = office_hour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "faculty{" +  "name = " + name + '}';
    }
    
}
////////////////////////////
class staff extends employee{
     private String title;

    public staff(String title, String office, int salary, Mydate date_hired, String name, String address, String Email_address, int phone_number) {
        super(office, salary, date_hired, name, address, Email_address, phone_number);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "staff{" + "name = " + name+ '}';
    }
     
}

public class JavaApplication1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       person pr = new person("ahmed sayed","menia","ahmed@yahoo.com",01212233444);
       Mydate date= new Mydate(2000,5,13);
       employee emp = new employee("maneger office",5000,date,"mohamed ali","menia","moali@yahoo.com",0111110444);
       student std = new student("jonior","hassen salah","menia","hassen@yahoo.com",01555555544);
       staff sff = new staff("HR","HR office",1000,date,"ali mohamed","menia","aaali@yahoo.com",0111110444);
       faculty fac = new faculty(8,"maneger","maneger office",5000,date,"sara hassen","menia","sarai@yahoo.com",01110444);
       
       
       System.out.println( pr.toString());
       System.out.println( emp.toString());
       System.out.println( std.toString());
       System.out.println( sff.toString());
       System.out.println( fac.toString());
      
       
       
       
       
       
       
    }
    
}
