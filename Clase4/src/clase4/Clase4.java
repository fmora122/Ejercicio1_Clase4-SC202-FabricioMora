/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4;

import javax.swing.JOptionPane;

/**
 *
 * @author fmora
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String strEmployees = "";
        int numEmployees = 0;
        String strSalary = "";
        int numSalary = 0;
        double semSalary = 0;
        double ivaSalary = 0;
        double totalCost = 0;
        
        strEmployees = JOptionPane.showInputDialog("Type in the amount of employees\n");
        numEmployees = Integer.parseInt(strEmployees);
        
        for (int counter = 1; counter <= numEmployees; counter++) {
            strSalary = JOptionPane.showInputDialog("Type in the salary #"+counter);
            numSalary = Integer.parseInt(strSalary);
            
            semSalary = numSalary*0.0925;
            ivaSalary = numSalary*0.0508;
            totalCost = totalCost+semSalary+ivaSalary;
            
        }
        System.out.println("The total cost is: "+totalCost);
    }
    
}
