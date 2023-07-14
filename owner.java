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
public final class Owner extends employee{
    private double weeklySalary;
    public Owner(String first,String last,double salary){
        super(first,last);
        setweeklySalary(salary);
    }
public void setweeklySalary(double salary) {
    weeklySalary=(salary>0? salary:0);
}
    @Override
    public double earnings(){
    return weeklySalary;
}
    @Override
    public String toString(){
    return "Owner"+super.toString();
}
}
