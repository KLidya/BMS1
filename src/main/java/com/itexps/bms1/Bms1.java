/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itexps.bms1;

/**
 *
 * @author patel
 */
public class Bms1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         Scanner sc = new Scanner(System.in) ;
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Customer> customers = new ArrayList<Customer>();
        int choice = 0;
        do{
            
            menu();
            choice = sc.nextInt();

            switch(choice) {

            case 1:
                System.out.println("Bank Code");
                int code = sc.nextInt();
                System.out.println("Bank Name");
                String name = sc.next();
                System.out.println("Bank Phone");
                String phone = sc.next();
                Bank bank = new Bank(code, name, phone, employees, customers);
                addbank(bank);
                break;
            
            case 2:
                viewbank();
                break;
            }
        } while(choice != 11);
    }
    public static void addbank (Bank bank){
        try {
            //Write File
            FileWriter fw = new FileWriter("C:\\Data\\BMSProject\\Bank.txt", true);
            //Create Buffer
            BufferedWriter bw = new BufferedWriter (fw) ;
            //write content
            bw.write("[" + bank.getId() + "|" + bank.getName () + "|" + bank.getPhone() + "]" + "\n") ;
         
            //close file
            bw.close();
            fw.close();
        } catch (Exception e) {
            //Write error message
            System.out.println(e.getMessage());
        }
    }
    
    public static void viewbank() {
        try{
            FileReader fr = new FileReader ("C:\\Data\\BMSProject\\Bank.txt");
            //Create Buffer
            BufferedReader br = new BufferedReader (fr) ;

            //Read content
            String line = "";
            while ((line = br.readLine()) != null ){
                System.out.println(line.trim());
        }
            //close file
            br.close();
            fr.close();
        } catch (Exception e){
            System.out.println("e.getMessage()");
        }
    }
    
        public static void menu(){
           
            System.out.println("1 Add Bank");
            System.out.println("2 View Bank");
            System.out.println("3 Add Employee");
            System.out.println("4 View Employee");
            System.out.println("5 Search Employee");
            System.out.println("6 Add Customer");
            System.out.println("7 View Customer");
            System.out.println("8 Search Customer");
            System.out.println("9 Add Account") ;
            System.out.println("10 View Account");
            System.out.println("1l Exit");
            System.out.println("Enter your choice  ");
        }
    
    
}
