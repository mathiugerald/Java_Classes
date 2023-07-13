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
public final class commission extends employee {
    private double salary;
    private double commission;
    private int quantity;
    public commission(String first,String last,double salary,double commmission,int quantity){
        super (first,last);
        setsalary(salary);
        setcommission(commission);
        setquantity(quantity);
    }
    public void setsalary(double weeklySalary){
        salary=(weeklySalary>0? weeklySalary:0);
    }
    public void setcommission(double itemcommission){
        commission=(itemcommission>0? itemcommission:0);
    }
    public void setquantity(int totalSold){
        quantity=(totalSold>0? totalSold:0);
    }
    @Override
    public double earnings(){
        return salary+commission+quantity;
    }
    @Override
    public String toString(){
        return "commission" +super.toString();
    }

}
