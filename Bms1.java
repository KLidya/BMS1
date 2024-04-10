/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itexps.bms1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author patel
 */
public class Bms1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner sc = new Scanner(System.in) ;
        
        PartTimeEmployee p1 = new PartTimeEmployee( 30, 30.5f, 1, "Mike", "Smith", "mike@abc.com", "2223334040", "N Pine St", EmployeeType.PartTimeEmployee);
        PartTimeEmployee p2 = new PartTimeEmployee(25, 40.5f, 2, "Rob", "Jonas", "rob@abc.com", "3323334040", "W Main St", EmployeeType.PartTimeEmployee);
        
        FullTimeEmployee f1 = new FullTimeEmployee(35000, 3, "David", "patric", "david@abc.com", "4423334040", "W Central Ave", EmployeeType.FullTimeEmployee);
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(p1);
        employees.add(p2);
        employees.add(f1);
        ArrayList<Customer> customers = new ArrayList<Customer>();
       
        int choice;
        Bank myBank=new Bank("B001","Bank Of Suburbs","9990000111","Schaumburg, IL",employees,customers);
        
        do {
            System.out.println("|**********************************|");
            System.out.println("|*** Welcome to Bank Of Suburbs ***|");
            System.out.println("|**********************************|");         
            System.out.println("|        1. Admin Portal           |");
            System.out.println("|        2. Employee Portal        |");
            System.out.println("|        3. Customer Portal        |");
            System.out.println("|        4. Exit                   |");
            System.out.println("|**********************************|");
            
            System.out.println(" --> Please make your selection from above options : <--");
            Scanner sc1 = new Scanner(System.in);
            choice = sc1.nextInt(); 
            
            switch(choice) {
                case 1 :
                
                        String username,pwd;
                        Scanner s= new Scanner(System.in);
                        System.out.println("Enter Username to Login Employee Portal:");
                        username= s.nextLine();
                        System.out.println("Enter Password to Login Employee Portal:");
                        pwd= s.next();
                        if(username.equals("admin") && pwd.equals("admin123")){
                          printAdminMenu(myBank);  
                        }else{
                            System.out.println("Please check your Credentials and Try again..!");  
                        } 
                        
                        break;
                        
/*                case 2 :
                        String uname,password;
                        Scanner sc2= new Scanner(System.in);
                        System.out.println("Enter Username to Login Employee Portal:");
                        uname= sc2.next();
                        System.out.println("Enter Password to Login Employee Portal:");
                        password= sc2.next();
                        
                        if(uname.equals("emp") && password.equals("emp@123")){
                          printEmployeeMenu(myBank);  
                        }else{
                            System.out.println("Please check your Credentials and Try again..!");  
                        }  
                        break;
                case 3 :
                        printCustomerMenu();
                        break;
*/                        
                case 4 :
                        System.out.println("Thanks for visiting Bank Of Suburbs...See you soon...!");
                        break;
                        
                default :
                        System.out.println("Try again...Unfortunately, you won't be to able visit any portal, as you have made the wrong selection..!");
                        break;
                        
            }
            
        }while(choice!=4);
    }

    private static void printAdminMenu(Bank myBank) {
         int choice2;
            do {
                System.out.println("|****************************************|");
                System.out.println("|****** Welcome to Admin Portal ******|");
                System.out.println("|****************************************|");         
                System.out.println("|  1. Print Bank Information   |");
                System.out.println("|  2. Add Employees and Save Employees |");
                System.out.println("|  3. Serach Employee                      |");
                System.out.println("|  4. Print All Employee's Information   |");
                System.out.println("|  5. Exit                               |");
                System.out.println("|****************************************|");
                System.out.println(" --> Please make your selection from above options : <--");
                
                Scanner sc1 = new Scanner(System.in);
                choice2 = sc1.nextInt();
                
                switch(choice2) {
                        case 1 :
                            try {
                                //Write File
                                FileWriter fw = new FileWriter("C:\\Data\\BMSProject\\Bank.txt", true);
                                //Create Buffer
                                BufferedWriter bw = new BufferedWriter (fw) ;
                                bw.write("================Bank==============\n");
                                //write content
                                bw.write("[" + myBank.getId() + "|" + myBank.getName () + "|" + myBank.getPhone() + "]" + "\n") ;
                                
                                System.out.println(myBank);
                                //close file
                                bw.close();
                                fw.close();
                            } catch (Exception e) {
                            //Write error message
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2 :
                            try {
                                //Write File
                                FileWriter fw = new FileWriter("C:\\Data\\BMSProject\\Bank.txt", true);
                                //Create Buffer
                                BufferedWriter bw = new BufferedWriter (fw) ;
                                Scanner sc = new Scanner(System.in);
                                
                                System.out.println("Enter Employee ID");
                                int eid = sc.nextInt();
                                System.out.println("Enter Employee's FirstName");
                                String empfirst = sc.next();
                                System.out.println("Enter Employee's LastName");
                                String emplast = sc.next();
                                System.out.println("Enter Employee's Email");
                                String empemail = sc.next();
                                System.out.println("Enter Employee Phone");
                                String empphone = sc.next();
                                sc.nextLine();
                                System.out.println("Enter Your Address");
                                String empaddress = sc.nextLine();
                              
                                System.out.println("Enter Employee Type");
                                String empType = sc.next();
                                
                   
                                if (empType.equalsIgnoreCase("FullTime")) {
                                    //create employee instance with data
                                    System.out.println("Enter Employee's Salary");
                                    float salary = sc.nextFloat();
                                    Employee emp1 = new FullTimeEmployee(salary, eid, empfirst, emplast, empemail, empphone, empaddress, EmployeeType.FullTimeEmployee);
                                    ArrayList<Employee> tEmployees = myBank.getEmployees();
                                    tEmployees.add(emp1);
                                    myBank.setEmployees(tEmployees);
                                    System.out.println(emp1);

                                } 
                                else if (empType.equalsIgnoreCase("PartTime")){

                                    System.out.println("Enter Your Hours");
                                    int hours = sc.nextInt();
                                    System.out.println("Enter hourly rate");
                                    float hourlyrate = sc.nextFloat();
                                    Employee emp1 = new PartTimeEmployee(hours, hourlyrate, eid, empfirst, emplast, empemail, empphone, empaddress, EmployeeType.PartTimeEmployee );

                                    myBank.getEmployees().add(emp1);
                                    System.out.println(emp1);

                                }
                                else{
                                    System.out.println("Enter valid employeeType as FullTime or PartTime");
                                }
                                
                                for (Employee e : myBank.getEmployees()) {
                                // Construct string containing all employee details
                                String empDetails = "[" + e.getEid() + "|" + e.getFirstname() + "|" + e.getLastname() + "|" + e.getEmail() + "|" + e.getPhone() + "|" + e.getAddress() + "|" +e.getEmpType();

                                // Append salary or hours and hourly rate based on employee type
                                if(e instanceof FullTimeEmployee) {
                                    empDetails += "|" + ((FullTimeEmployee) e).getSalary() + "]";
                                } else if (e instanceof PartTimeEmployee) {
                                    empDetails += "|" + ((PartTimeEmployee) e).getHours() + "|" + ((PartTimeEmployee) e) + "]";
                                }

                                // Write employee details to file
                                bw.write(empDetails);
                                bw.write("\n");

                                // Print employee details to console
                                System.out.println(empDetails);
                            }
                                bw.close();
                                fw.close();
                            }
                            catch (Exception e) {
                            //Write error message
                            System.out.println(e.getMessage());
                        }

                            break;
                        case 3 :
                                System.out.println("======== Search Employees =========");
                                System.out.println("Enter employee id ");
                                Scanner sc = new Scanner(System.in);
                                int eid = sc.nextInt();
                                boolean found = false;
                                for (Employee e : myBank.getEmployees()) {
                                    if (e.getEid() == eid) {
                                        System.out.println("!! Employee Found !!");
                                        System.out.println(e.toString());
                                        found = true;
                                        break;
                                    }
                                }
                                if (found == false) {
                                    System.out.println("For this id - Employee does not exit");
                                }
                            
                            break;
                        case 4 :
                                
                            System.out.println("======== Print Employees =========");
                            System.out.println("All Employees:");
                            for (Employee e : myBank.getEmployees()) {
                                System.out.println(e.toString());
                            }
                            break;
                        case 5 :
                            System.out.println("Thanks for visiting Admin Portal...!");
                            break;
                        default :
                            System.out.println("Try again...you have made the wrong selection..!");
                            break;
                }
            }while(choice2!=5);
    }
/*  
    private static void printEmployeeMenu(Bank myBank) {
            int choice2;
            do {
                System.out.println("|****************************************|");
                System.out.println("|****** Welcome to Employee Portal ******|");
                System.out.println("|****************************************|");         
                System.out.println("|  1. Add Customer and Open Account/s    |");
                System.out.println("|  2. Update Customer Details            |");
                System.out.println("|  3. Find Customer                      |");
                System.out.println("|  4. Print All Customer's Information   |");
                System.out.println("|  5. Exit                               |");
                System.out.println("|****************************************|");
                System.out.println(" --> Please make your selection from above options : <--");

                Scanner sc1 = new Scanner(System.in);
                choice2 = sc1.nextInt();
                
                switch(choice2) {
                        case 1 :
                                Customer cust=new Customer();
                                addCustomer(cust);
                                System.out.println("Added Customer:");
                                System.out.println(cust);
                                //myBank.setCustomers(customers);
                                break;
                        case 2 :
                                
                                break;
                        case 3 :
                                
                                break;
                        case 4 :
                                
                                break;
                        case 5 :
                                System.out.println("Thanks for visiting Employee Portal...!");
                                break;
                        default :
                                System.out.println("Try again...you have made the wrong selection..!");
                                break;
                }
            }while(choice2!=5);
    }
*/    
/*    
    private static void printCustomerMenu() {
        System.out.println("I am in Customer Portal");
    }
*/   

/*  
    private static void addCustomer(Customer cust) {
        String answer;
        ArrayList<Account> accountsArray = new ArrayList();
        System.out.println("Enter Customer ID:");
        Scanner sc3=new Scanner(System.in);
        answer=sc3.next();
        cust.setId(Integer.parseInt(answer));
        
        System.out.println("Enter Customer's First Name:");       
        answer=sc3.next();
        cust.setFirstname(answer);
        
        System.out.println("Enter Customer's Last Name:");      
        answer=sc3.next();
        cust.setLastname(answer);
        
        System.out.println("Enter Customer's Email:");       
        answer=sc3.next();
        cust.setEmail(answer);
        
        System.out.println("Enter Customer's Phone:");
        answer=sc3.next();
        cust.setPhone(answer);
        
        System.out.println("Enter Customer Type: Enter 'I'/'i' For Individual and 'B'/'b' For Business:");
        answer=sc3.next();
        if(answer.equalsIgnoreCase("i")) {
           cust.setCustType(CustomerType.Individual);
        }else if(answer.equalsIgnoreCase("b")) {
           cust.setCustType(CustomerType.Business); 
        }else {
           cust.setCustType(CustomerType.Individual); 
        }
        
        System.out.println("Customer wants to open Checking Account: Y/N ?");
        answer=sc3.next();
        if(answer.equalsIgnoreCase("y")){
           Account checkAcc = new Account();
           System.out.println("Enter Checking Account Number:");      
            answer=sc3.next();
            checkAcc.setId(Integer.parseInt(answer));
            checkAcc.setAccType(AccountType.Checking);
            System.out.println("Enter Balance For Checking Account:");
            float balance = sc3.nextFloat();
            checkAcc.setBalance(balance);
            accountsArray.add(checkAcc);
        }
        
        System.out.println("Customer wants to open Saving Account: Y/N ?");
        answer=sc3.next();
        if(answer.equalsIgnoreCase("y")){
           Account savingAcc = new Account();
           System.out.println("Enter Saving Account Number:");      
            answer=sc3.next();
            savingAcc.setId(Integer.parseInt(answer));
            savingAcc.setAccType(AccountType.Saving);
            System.out.println("Enter Balance For Saving Account:");
            float balance = sc3.nextFloat();
            savingAcc.setBalance(balance);
            accountsArray.add(savingAcc);
        }
        
        System.out.println("Customer wants to open FD Account: Y/N ?");
        answer=sc3.next();
        if(answer.equalsIgnoreCase("y")){
           Account fdAcc = new Account();
           System.out.println("Enter FD Account Number:");      
            answer=sc3.next();
            fdAcc.setId(answer);
            fdAcc.setAccType(AccountType.FixedDeposite);
            System.out.println("Enter Balance For FD Account:");
            float balance = sc3.nextFloat();
            fdAcc.setBalance(balance);
            accountsArray.add(fdAcc);
        }
        
        cust.setAccounts(accountsArray);
    }
*/
}