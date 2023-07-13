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
public final class Wages extends employee {
    private double wagePerPiece;
    private int quantity;
    public Wages(String first ,String last ,double wage, int numberOfItems){
    super (first,last);
    setwage(wage);
    setquantity(numberOfItems);
}
    public void  setwage(double wage){
        wagePerPiece=(wage>0? wage:0);}

    public void setquantity(int numberOfItems){
        quantity=(numberOfItems>0? numberOfItems:0);
    }
    @Override
    public double earnings()
    {
        return quantity*wagePerPiece;
    }
    @Override
    public String toString(){
       return "Wages" +super.toString();

    }
}

