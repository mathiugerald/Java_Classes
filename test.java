/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;


/**
 *
 * @author GERALD
 */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class test {
    public static void main(String args[]){
        employee Employee;

        String outputMessage;
         double totalcommission;
         double wage;
         double totalsalary;


      Boss boss=new Boss("", "",800.0);
        commissionworker CommissionWorker=new commissionworker ("","",400.0,3.0,150);
        pieceworker PieceWorker= new pieceworker("","",2.5,200);
        DecimalFormat precision2=new DecimalFormat("");

   int x =1;
   while(x>0){
         String firstname = JOptionPane.showInputDialog("firstName","Enter first Name");
   String lastname = JOptionPane.showInputDialog("lastName","Enter last Name");
   double salary = Double.parseDouble( JOptionPane.showInputDialog("salary","enter basic salary") );
  double commission = Double.parseDouble( JOptionPane.showInputDialog("commission","Enter item commission"));
  double quantity = Double.parseDouble( JOptionPane.showInputDialog("quantity","Enter total sold"));
    double wageperpiece = Double.parseDouble(JOptionPane.showInputDialog("wageperpiece","Enter wage per piece"));
  double Quantity = Double.parseDouble( JOptionPane.showInputDialog("quantity","EnterNumber of items"));
  {
       wage= wageperpiece*Quantity;
  }
  {
      totalcommission = commission*quantity;
  }
  {
      totalsalary= totalcommission+ salary +wage;
  }
outputMessage="firstname: "+firstname+ "\n"
        +"lastname: "+lastname+"\n"+ "salary: "+salary+"\n"+"commission: "+commission+"\n"+"quantity: "
        +quantity+"\n"+"wageperpiece: "+wageperpiece+"\n"+"Quantity: "+Quantity + "\n"
        + " your totalcommission is " +totalcommission+ "\n" +" your total wage per piece is :"+wage+ "\n\n" + "your total salary is" +totalsalary + "\n\n" ;
 JOptionPane.showMessageDialog(null,outputMessage);


     Employee=boss;
      outputMessage += Employee.toString() + "earned $"
              + precision2.format(Employee.earnings()) +"\n"
              + boss.toString() + "earned $"
              + precision2.format(boss.earnings()) +"\n";
      //employee reference to commissionworker
      Employee=CommissionWorker;
      outputMessage += Employee.toString() + "earned $"
           +precision2.format(Employee.earnings()) + "\n"
              + CommissionWorker.toString() + "earned $"
             + precision2.format(CommissionWorker.earnings()) + "\n";
    //employee referenceto piece worker
    Employee=PieceWorker;
    outputMessage += Employee.toString() +" earned $ "
            + precision2.format(Employee.earnings()) + "\n"
            + PieceWorker.toString() + "earned $"
            + precision2.format(PieceWorker.earnings()) + "\n";

    JOptionPane.showMessageDialog(null,outputMessage);
       x++;
   }


   }




    }




